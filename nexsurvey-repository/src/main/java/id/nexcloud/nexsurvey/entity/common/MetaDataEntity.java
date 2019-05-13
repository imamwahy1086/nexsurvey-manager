package id.nexcloud.nexsurvey.entity.common;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@MappedSuperclass
@EqualsAndHashCode
@EntityListeners(AuditingEntityListener.class)
public abstract class MetaDataEntity implements IsNexEntity {

	@CreatedBy
	@Column(name = "created_by", updatable = false)
	protected String createdBy;

	@CreatedDate
	@Column(name = "created_date", updatable = false)
	protected Date createdDate;

	@LastModifiedBy
	@Column(name = "modified_by")
	protected String modifiedBy;

	@Version
	@LastModifiedDate
	@Column(name = "modified_date", nullable = false)
	protected Date modifiedDate;

}
