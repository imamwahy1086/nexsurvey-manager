package id.nexcloud.nexsurvey.repository.jpa;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import id.nexcloud.nexsurvey.entity.jpa.customer;
import id.nexcloud.nexsurvey.entity.jpa.customerView;

public interface customerViewRepo extends JpaRepository<customerView, Long>, QuerydslPredicateExecutor<customerView>{
	
//	List<customer> findByPrincipalIDAndDistributorID(String principalID, String distributorID);
	List<customerView> findByPrincipalIDAndDistributorIDAndCustomerCode(String principalID, String distributorID, String customerID);
	customer findByPrincipalIDAndDistributorIDAndCustomerCodeAndVisitDate(String principalID, String distributorID, String customerID,Date visitDate);

	@Query(value = ("select * "
			+ " from customer c where principalID=:principalID and distributorID=:distributorID "
			+ " and visitDate between :start and :end "
			+ " group by customercode order by visitDate asc"), nativeQuery = true)
	List<customerView> findByPrincipalIDAndDistributorID(@Param("principalID") String principalID, 
			@Param("distributorID") String distributorID,
			@Param("start") Timestamp start,@Param("end") Timestamp end );

	@Query(value = ("select id,visitDate "
			+ " from customer  where principalID=:principalID and distributorID=:distributorID "
			+ " and customerCode=:customerID order by id desc "), nativeQuery = true)
	List<Object[]> findVisitDate(@Param("principalID") String principalID, 
			@Param("distributorID") String distributorID,
			@Param("customerID") String customerID);

}
