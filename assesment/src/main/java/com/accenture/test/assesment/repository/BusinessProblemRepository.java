package com.accenture.test.assesment.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accenture.test.assesment.entites.BusinessProblem;

public interface BusinessProblemRepository extends JpaRepository<BusinessProblem, Integer> {

	List<BusinessProblem> findByProblemId(int problemid);
    
}
