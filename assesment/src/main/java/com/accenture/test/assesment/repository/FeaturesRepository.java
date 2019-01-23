package com.accenture.test.assesment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accenture.test.assesment.entites.Features;

public interface FeaturesRepository extends JpaRepository<Features, Integer>{
	
	//List<Features> findByFeatrureId(Integer featrureid);

}
