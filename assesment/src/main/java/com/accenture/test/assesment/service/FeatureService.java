package com.accenture.test.assesment.service;

import java.util.List;
import com.accenture.test.assesment.model.Cloud;


public interface FeatureService {
	public List<Cloud> getFeatures(String featureName);
}
