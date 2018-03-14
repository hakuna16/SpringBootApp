package com.tesco.rangeservicevalidation.main.model;

import org.springframework.data.couchbase.core.mapping.Document;

@Document
public class Range extends Entity{
	
	private String rangeEventID;
	private String product;
	private String productGroup;
	private String effectiveDate;
	private String group;
	private String groupName;
	private String rangeClass;
	private String startDate;
	private String endDate;
	private String overlay;
	private String overlayName;
	private String rangeType;
	private int level;
	private int version;
	private String reference;
	private String country;
	private String status;
	private Float valueOfMods;
	private String startReasonCode;
	private String endReasonCode;
	public String getRangeEventID() {
		return rangeEventID;
	}
	public void setRangeEventID(String rangeEventID) {
		this.rangeEventID = rangeEventID;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
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
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
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
	public String getOverlay() {
		return overlay;
	}
	public void setOverlay(String overlay) {
		this.overlay = overlay;
	}
	public String getOverlayName() {
		return overlayName;
	}
	public void setOverlayName(String overlayName) {
		this.overlayName = overlayName;
	}
	public String getRangeType() {
		return rangeType;
	}
	public void setRangeType(String rangeType) {
		this.rangeType = rangeType;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Float getValueOfMods() {
		return valueOfMods;
	}
	public void setValueOfMods(Float valueOfMods) {
		this.valueOfMods = valueOfMods;
	}
	public String getStartReasonCode() {
		return startReasonCode;
	}
	public void setStartReasonCode(String startReasonCode) {
		this.startReasonCode = startReasonCode;
	}
	public String getEndReasonCode() {
		return endReasonCode;
	}
	public void setEndReasonCode(String endReasonCode) {
		this.endReasonCode = endReasonCode;
	}
	
	
	@Override
	public String toString() {
		return "Range [rangeEventID=" + rangeEventID + ", product=" + product + ", productGroup=" + productGroup
				+ ", effectiveDate=" + effectiveDate + ", group=" + group + ", groupName=" + groupName + ", rangeClass="
				+ rangeClass + ", startDate=" + startDate + ", endDate=" + endDate + ", overlay=" + overlay
				+ ", overlayName=" + overlayName + ", rangeType=" + rangeType + ", level=" + level + ", version="
				+ version + ", reference=" + reference + ", country=" + country + ", status=" + status
				+ ", valueOfMods=" + valueOfMods + ", startReasonCode=" + startReasonCode + ", endReasonCode="
				+ endReasonCode + "]";
	}
	
	
	
}