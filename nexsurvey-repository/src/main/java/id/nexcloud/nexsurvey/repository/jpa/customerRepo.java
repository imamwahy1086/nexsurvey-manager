package id.nexcloud.nexsurvey.repository.jpa;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import id.nexcloud.nexsurvey.entity.jpa.customer;
import id.nexcloud.nexsurvey.entity.jpa.customerView;

public interface customerRepo  extends JpaRepository<customer, Long>, QuerydslPredicateExecutor<customer>{
	
//	List<customer> findByPrincipalIDAndDistributorID(String principalID, String distributorID);
	List<customer> findByPrincipalIDAndDistributorIDAndCustomerCode(String principalID, String distributorID, String customerID);
	customer findByPrincipalIDAndDistributorIDAndCustomerCodeAndVisitDate(String principalID, String distributorID, String customerID,Date visitDate);

	@Query(value = ("select * "
			+ " from customer c where principalID=:principalID and distributorID=:distributorID "
			+ " group by customercode,visitDate"), nativeQuery = true)
	List<customerView> findByPrincipalIDAndDistributorID(@Param("principalID") String principalID, 
			@Param("distributorID") String distributorID);
}
