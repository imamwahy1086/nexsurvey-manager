package id.nexcloud.nexsurvey.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import id.nexcloud.nexsurvey.entity.jpa.competitor;
import id.nexcloud.nexsurvey.entity.jpa.noteStore;

public interface competitorRepo  extends JpaRepository<competitor, Long>, QuerydslPredicateExecutor<competitor> {


}
