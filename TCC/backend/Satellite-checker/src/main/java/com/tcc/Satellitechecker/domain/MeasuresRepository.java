package com.tcc.Satellitechecker.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MeasuresRepository extends JpaRepository<Measures,Long> {
	
	  @Query(value = "select * from measures m where m.modules_id = :modules and m.satellites_id =:satellites"
			  , nativeQuery = true
			  )
	  List<Measures> findMeasures(
			  @Param("modules") Integer modules,
			  @Param("satellites") Integer satellites
			  ); 
	  
}
		

