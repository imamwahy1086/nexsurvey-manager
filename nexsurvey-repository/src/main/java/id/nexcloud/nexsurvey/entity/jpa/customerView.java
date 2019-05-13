package id.nexcloud.nexsurvey.entity.jpa;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import id.nexcloud.nexsurvey.entity.common.BaseEntity;
import id.nexcloud.nexsurvey.entity.jpa.customer.customerBuilder;
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
public class customerView extends BaseEntity{

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
	
	@Column(name = "customerLatitude")
	private String customerLatitude;
	
	@Column(name = "customerLongitude")
	private String customerLongitude;
	
	@Column(name = "visitDate")
	private Date visitDate;
}
