package com.sgic.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="classification")
public class Classification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="classification_id")
	private Integer classificationId;
	
	@Column(name="classification_name")
	private String classificationName;
	
	public Classification(Integer classificationId, String classificationName) {
		super();
		this.classificationId = classificationId;
		this.classificationName = classificationName;
	}
	
	public Classification() {
		
	}

	public Integer getClassificationId() {
		return classificationId;
	}
	public void setClassificationId(Integer classificationId) {
		this.classificationId = classificationId;
	}
	public String getClassificationName() {
		return classificationName;
	}
	public void setClassificationName(String classificationName) {
		this.classificationName = classificationName;
	}
	

	
}
