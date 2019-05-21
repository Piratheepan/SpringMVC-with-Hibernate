package com.sgic.library.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sgic.library.model.Classification;

@Repository
@Transactional
public class ClassificationDAOImpl implements ClassificationDAO {
//	private static List<Classification> list=null;
//	static {
//		list=new ArrayList<Classification>();
//		list.add(new Classification(1,"maths"));
//		list.add(new Classification(2,"science"));
//	}
//	public Classification createClassification(Classification classification) {
//		list.add(classification);
//		return null;
//	}
//
//	public List<Classification> listClassification() {
//		// TODO Auto-generated method stub
//		return list;
//	}

	@Autowired
	private HibernateTemplate hibernateTemplate;
//	
//	public HibernateTemplate getHibernateTemplate() {
//		return hibernateTemplate;
//	}
//
//	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
//		this.hibernateTemplate = hibernateTemplate;
//	}


	public Classification createClassification(Classification classification) {
		hibernateTemplate.save(classification);
		System.out.println("dao");
		return null;
	}
	
	public List<Classification> getClassifications(){  
	    List<Classification> list=new ArrayList<Classification>();  
	    list=hibernateTemplate.loadAll(Classification.class);  
	    return list;  
	}

}
