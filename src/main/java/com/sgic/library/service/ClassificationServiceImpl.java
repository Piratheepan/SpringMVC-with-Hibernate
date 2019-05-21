package com.sgic.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.library.dao.ClassificationDAO;
import com.sgic.library.model.Classification;



@Service
public class ClassificationServiceImpl implements ClassificationService{
	
	@Autowired
    private ClassificationDAO classificationDAO;

//	public ClassificationDAO getClassificationDAO() {
//		return classificationDAO;
//	}
//
//	public void setClassificationDAO(ClassificationDAO classificationDAO) {
//		this.classificationDAO = classificationDAO;
//	}

	public Classification addClassification(Classification classification) {
		// TODO Auto-generated method stub
		return classificationDAO.createClassification(classification);
	}


	public List<Classification> getClassifications() {
		// TODO Auto-generated method stub
		return classificationDAO.getClassifications();
	}

}
