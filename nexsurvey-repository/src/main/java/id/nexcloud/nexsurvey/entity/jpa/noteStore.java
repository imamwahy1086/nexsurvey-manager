package id.nexcloud.nexsurvey.entity.jpa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import id.nexcloud.nexsurvey.entity.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "noteStore")
public class noteStore extends BaseEntity{
	
	@Column(name = "customer_ID")
	private Long customer_ID;
	
	
	@Column(name = "noteCategory")
	private String noteCategory;
	
	@Column(name = "noteDescription")
	private String noteDescription;

	@Column(name = "visitDate")
	private Date visitDate;
}
