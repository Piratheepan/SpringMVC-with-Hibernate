package com.sgic.library.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.sgic.library.model.Classification;
import com.sgic.library.service.ClassificationService;
import com.sgic.library.service.ClassificationServiceImpl;

public class Test {

	public static void main(String[] args) {
	AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("springConfig.xml");
		ClassificationService classificationService=ctx.getBean("classificationService", ClassificationServiceImpl.class);
		
//	    Resource r=new ClassPathResource("springConfig.xml");  
//	    BeanFactory factory=new XmlBeanFactory(r);  
//	    ClassificationService classificationService=(ClassificationService)factory.getBean("classificationService");  
		
//		ClassificationService classificationService=new ClassificationServiceImpl();
		
		
		
//		Classification classification=new Classification();
//		classification.setClassificationName("TestFile");
//		
//		classificationService.addClassification(classification);
//		System.out.println("main");
		
		for(Classification classification:classificationService.getClassifications()) {
		System.out.println(classification.getClassificationId()+" "+classification.getClassificationName());
	}

	}

}
