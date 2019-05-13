package id.nexcloud.nexsurvey.entity.common;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@MappedSuperclass
@ToString(callSuper = true)
public abstract class BaseTreeEntity<T, ID extends Serializable> extends BaseEntity implements Comparable<T> {

	@Column(name = "level", nullable = false)
	private Integer level;

	@ManyToOne
	@JoinColumn(name = "parent_id", insertable = false, updatable = false)
	private T parent;

	@Transient
	private Set<T> children;

	public abstract ID getEntityId();

}
