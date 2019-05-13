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
@Table(name = "implementationPromo")
public class implementationPromo extends BaseEntity{
	
	@Column(name = "customer_ID")
	private Long customer_ID;
	
	@Column(name = "promoID")
	private String promoID;
	
	@Column(name = "promoName")
	private String promoName;
	
	@Column(name = "referenceNumber")
	private String referenceNumber;
	
	@Column(name = "isAvailable")
	private String isAvailable;
	
	@Column(name = "validFrom")
	private Date validFrom;
	
	@Column(name = "validThru")
	private Date validThru;

	@Column(name = "visitDate")
	private Date visitDate;
}
