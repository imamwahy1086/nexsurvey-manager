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
@Table(name = "productInStore")

public class productInStore extends BaseEntity {

	@Column(name = "customer_ID")
	private Long customer_ID;
	
	@Column(name = "productCode")
	private String productCode;
	
	@Column(name = "productName")
	private String productName;
	
	@Column(name = "productPackaging")
	private String productPackaging;
	
	@Column(name = "uom1")
	private String uom1;
	
	@Column(name = "uom2")
	private String uom2;
	
	@Column(name = "uom3")
	private String uom3;
	
	@Column(name = "uom4")
	private String uom4;
	
	@Column(name = "uom1Qty")
	private Integer uom1Qty;
	
	@Column(name = "uom2Qty")
	private Integer uom2Qty;
	
	@Column(name = "uom3Qty")
	private Integer uom3Qty;
	
	@Column(name = "uom4Qty")
	private Integer uom4Qty;
	
	@Column(name = "productCategoryID")
	private String productCategoryID;
	
	@Column(name = "productCategoryName")
	private String productCategoryName;
	
	@Column(name = "productGroup1")
	private String productGroup1;
	
	@Column(name = "productGroup1Name")
	private String productGroup1Name;
	

	@Column(name = "productGroup2")
	private String productGroup2;
	
	@Column(name = "productGroup2Name")
	private String productGroup2Name;
	

	@Column(name = "productGroup3")
	private String productGroup3;
	
	@Column(name = "productGroup3Name")
	private String productGroup3Name;
	
	@Column(name = "goodStock")
	private Integer goodStock;
	
	@Column(name = "badStock")
	private Integer badStock;
	
	@Column(name = "sellingPrice")
	private Double sellingPrice;
	
	@Column(name = "isMsl")
	private String isMSl;

	@Column(name = "visitDate")
	private Date visitDate;
}
