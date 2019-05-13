package id.nexcloud.nexsurvey.entity.jpa;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
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
@Table(name = "competitor")

public class competitor extends BaseEntity{
	
	@Column(name = "customer_ID")
	private Long customer_ID;
	
	@Column(name = "competitorName")
	private String competitorName;
	
	@Column(name = "prodCompetitor")
	private String prodCompetitor;
	
	@Column(name = "jenisPromo")
	private String jenisPromo;
	
	@Column(name = "mekanismePromo")
	private String mekanismePromo;
	
	@Column(name = "periodePromo")
	private String periodePromo;
	
	@Column(name = "impactPromo")
	private String impactPromo;
	
	@Column(name = "visitDate")
	private Date visitDate;
	
}
