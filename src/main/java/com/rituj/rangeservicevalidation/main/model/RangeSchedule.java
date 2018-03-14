package com.tesco.rangeservicevalidation.main.model;

import java.util.Date;

import org.springframework.data.couchbase.core.mapping.Document;

@Document
public class RangeSchedule {

	private String id;
	private String created;
	private String updated;
	private String type;
	private String createdBy;
	String productGroup;
	String effectiveDate;
	int version;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getProductGroup() {
		return productGroup;
	}
	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}
	public String getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "RangeSchedule [id=" + id + ", created=" + created + ", updated=" + updated + ", type=" + type
				+ ", createdBy=" + createdBy + ", productGroup=" + productGroup + ", effectiveDate=" + effectiveDate
				+ ", version=" + version + "]";
	}
	

	

	
}
