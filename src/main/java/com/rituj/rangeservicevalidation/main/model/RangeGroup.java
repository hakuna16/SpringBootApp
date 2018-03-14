package com.tesco.rangeservicevalidation.main.model;

import java.util.Date;

import org.springframework.data.couchbase.core.mapping.Document;

@Document
public class RangeGroup {

	private String id;
	private Date created;
	private Date updated;
	private String type;
	private String createdBy;
	private String productGroup;
	private String group;
	private String rangeClass;
	private String startDate;
	private String endDate;
	private Float valueOfMods;
	private String effectiveDate;
	private String status;
	private String compareValue;
	private int version;
	private String rangeTrigger;
	
	@Override
	public String toString() {
		return "RangeGroup [id=" + id + ", type=" + type + ", createdBy=" + createdBy + ", productGroup=" + productGroup
				+ ", group=" + group + ", rangeClass=" + rangeClass + ", startDate=" + startDate + ", endDate="
				+ endDate + ", valueOfMods=" + valueOfMods + ", effectiveDate=" + effectiveDate + ", status=" + status
				+ ", compareValue=" + compareValue + ", version=" + version + ", rangeTrigger=" + rangeTrigger + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
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

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getRangeClass() {
		return rangeClass;
	}

	public void setRangeClass(String rangeClass) {
		this.rangeClass = rangeClass;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Float getValueOfMods() {
		return valueOfMods;
	}

	public void setValueOfMods(Float valueOfMods) {
		this.valueOfMods = valueOfMods;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCompareValue() {
		return compareValue;
	}

	public void setCompareValue(String compareValue) {
		this.compareValue = compareValue;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getRangeTrigger() {
		return rangeTrigger;
	}

	public void setRangeTrigger(String rangeTrigger) {
		this.rangeTrigger = rangeTrigger;
	}
}
