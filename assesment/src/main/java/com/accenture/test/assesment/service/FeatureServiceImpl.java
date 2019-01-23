package com.accenture.test.assesment.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import com.accenture.test.assesment.model.Cloud;


@Service
public class FeatureServiceImpl implements FeatureService {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Cloud> getFeatures(String FeatureService) {
		 
		return manager.createNamedQuery("getCloudFeatures", Cloud.class).setParameter(1, FeatureService)
                .getResultList();
	}

}
