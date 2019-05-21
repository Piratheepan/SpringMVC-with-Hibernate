package com.sgic.library.dao;

import java.util.List;

import com.sgic.library.model.Classification;

public interface ClassificationDAO {
	public abstract Classification createClassification(Classification classification);
	public abstract List<Classification> getClassifications();
}
