package com.rituj.rangeservicevalidation.main.model;

public class RangeGroupOutput {
	
	private String productGroup;
	private int rangeGroupCount;
	
	@Override
	public String toString() {
		return "RangeGroupOutput [productGroup=" + productGroup + ", rangeGroupCount=" + rangeGroupCount + "]";
	}

	public String getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}

	public int getRangeGroupCount() {
		return rangeGroupCount;
	}

	public void setRangeGroupCount(int rangeGroupCount) {
		this.rangeGroupCount = rangeGroupCount;
	}

}
