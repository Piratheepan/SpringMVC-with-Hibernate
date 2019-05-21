package com.sgic.library.service;

import java.util.List;

import com.sgic.library.model.Classification;

public interface ClassificationService {
	public abstract Classification addClassification(Classification classification);

	public abstract List<Classification> getClassifications();
}
