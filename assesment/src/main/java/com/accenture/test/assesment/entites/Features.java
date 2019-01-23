package com.accenture.test.assesment.entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "FEATURES")
@SqlResultSetMapping(name="ScheduleResult",
    classes={
      @ConstructorResult(
        targetClass=com.accenture.test.assesment.model.Cloud.class,
        columns={
          @ColumnResult(name="awsFeature", type=String.class),
          @ColumnResult(name="predixFeature", type=String.class)
          })})

@NamedNativeQueries({
    @NamedNativeQuery(
            name    =   "getCloudFeatures",
            query   =   "SELECT a.AWSFEATURE, p.PREDIXFEATURE FROM AWS_CLOUD a JOIN FEATURES f on a.FEATURETYPE = f.FEATURETYPE JOIN PREDIX_CLOUD p ON p.FEATURETYPE = f.FEATURETYPE where f.FEATUREDESCRIPTION= ?",
            resultSetMapping = "ScheduleResult"
    )
})
public class Features {
	
   /* @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FEATUREID")
    private Integer id; */
	
	@EmbeddedId
    private FeatureId featureId;
	
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "problem_feature", joinColumns={
            @JoinColumn(name="feature_type", referencedColumnName="FEATURETYPE", insertable = false, updatable = false),
            @JoinColumn(name="feature_description", referencedColumnName="FEATUREDESCRIPTION", insertable = false, updatable = false)
    }, inverseJoinColumns = @JoinColumn(name = "businessproblem_id", referencedColumnName = "PROBLEMID"))
    @JsonIgnore
    private List<BusinessProblem> businessProblems;

    public Features() {
    	
    }

	
	public FeatureId getFeatureId() {
		return featureId;
	}

	public void setFeatureId(FeatureId featureId) {
		this.featureId = featureId;
	}

	public List<BusinessProblem> getBusinessProblems() {
		return businessProblems;
	}

	public void setBusinessProblems(List<BusinessProblem> businessProblems) {
		this.businessProblems = businessProblems;
	}
    


}
