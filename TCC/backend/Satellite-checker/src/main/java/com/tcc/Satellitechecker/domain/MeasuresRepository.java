package com.tcc.Satellitechecker.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MeasuresRepository extends JpaRepository<Measures,Integer> {
	
	  @Query("SELECT r FROM Measures r WHERE (:message is null or r.message= :message)"
			  + "and (:status is null or r.status= :status)"
			  + "and (:modules_id is null or r.modules_id= :modules_id)"
			  + "and (:satellites_id is null or r.satellites_id= :satellites_id)"
			  + "and (:sample is null or r.sample= :sample)"
			  )
	  List<Measures> findMeasures(
			  @Param("sample") Integer sample,
			  @Param("message") String message,
			  @Param("status") Boolean status,
			  @Param("modules_id") Integer modules_id,		
			  @Param("satellites_id") Integer satellites_id	
			  );
}
