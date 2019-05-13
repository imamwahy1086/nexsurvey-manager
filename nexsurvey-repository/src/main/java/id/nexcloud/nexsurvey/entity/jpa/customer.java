package id.nexcloud.nexsurvey.entity.jpa;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

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
@Table(name = "customer")

public class customer extends BaseEntity{

	@OneToMany(fetch=FetchType.LAZY)
	@Fetch(value = FetchMode.SUBSELECT )
	@JoinColumn(name="customer_id", referencedColumnName="id", insertable=false, updatable=false)
	@NotFound(action=NotFoundAction.IGNORE)
	private List<implementationPromo> listPromo;

	@OneToMany(fetch=FetchType.LAZY)
	@Fetch(value = FetchMode.SUBSELECT )
	@JoinColumn(name="customer_id", referencedColumnName="id", insertable=false, updatable=false)
	@NotFound(action=NotFoundAction.IGNORE)
	private List<noteStore> listNote;
	
	@OneToMany(fetch=FetchType.LAZY)
	@Fetch(value = FetchMode.SUBSELECT )
	@JoinColumn(name="customer_id", referencedColumnName="id", insertable=false, updatable=false)
	@NotFound(action=NotFoundAction.IGNORE)
	private List<productInStore> listProd;
	
	@OneToMany(fetch=FetchType.LAZY)
	@Fetch(value = FetchMode.SUBSELECT )
	@JoinColumn(name="customer_id", referencedColumnName="id", insertable=false, updatable=false)
	@NotFound(action=NotFoundAction.IGNORE)
	private List<competitor> listCompetitor;
	
	@Column(name = "principalID")
	private String principalID;
	
	@Column(name = "distributorID")
	private String distributorID;
	
	@Column(name = "customerCode")
	private String customerCode;
	
	@Column(name = "customerName")
	private String customerName;
	
	@Column(name = "customerAddress1")
	private String customerAddress1;
	
	@Column(name = "customerAddress2")
	private String customerAddress2;
	
	@Column(name = "customerKodePos")
	private String customerKodePos;
	
	@Column(name = "customerCity")
	private String customerCity;
	
	@Column(name = "customerPhone")
	private String customerPhone;
	
	@Column(name = "customerType")
	private String customerType;
	
	@Column(name = "customerSubtype")
	private String customerSubtype;
	
	@Column(name = "customerKeyAccount")
	private String customerKeyAccount;
	
	@Column(name = "customerLatitude")
	private String customerLatitude;
	
	@Column(name = "customerLongitude")
	private String customerLongitude;
	
	@Column(name = "npwpNumber")
	private String npwpNumber;
	
	@Column(name = "npwpName")
	private String npwpName;
	
	@Column(name = "npwpAddress")
	private String npwpAddress;
	
	@Column(name = "visitDate")
	private Date visitDate;
}
