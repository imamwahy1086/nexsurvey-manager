package id.nexcloud.nexsurvey.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import id.nexcloud.nexsurvey.entity.jpa.customer;
import id.nexcloud.nexsurvey.entity.jpa.productInStore;

public interface productStoreRepo extends JpaRepository<productInStore, Long>, QuerydslPredicateExecutor<productInStore> {


	
}
