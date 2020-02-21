package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PortfolioNetWorthDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String rootTypeName;
	private String productType;
	private String productName;
	private String totalTypeName;
	private Double currentValue;
	private Double totalTypeValue;
	private Double networthValue;
	private int clientID;
	private String name;
	private Map<String, Double> totaltypeValueMap = new HashMap<>();
	private List<PortfolioNetWorthDto> networthTotal;
	private List<PortfolioNetWorthDto> networthDetails;
	private Map<String, Double> typeValueMap = new HashMap<>();
	private Map<String, Map<String, Map<String, List<PortfolioNetWorthDto>>>> rootMap = new HashMap<>();
	
	private String totalAssetsForReport;
	private String totalLiabilitiesForReport;
	private String networthForReport;
	
	private String assetBreakupName;
	private String assetBreakupValue;

	public String getTotalTypeName() {
		return totalTypeName;
	}

	public void setTotalTypeName(String totalTypeName) {
		this.totalTypeName = totalTypeName;
	}

	public Double getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(Double currentValue) {
		this.currentValue = currentValue;
	}

	public Double getTotalTypeValue() {
		return totalTypeValue;
	}

	public void setTotalTypeValue(Double totalTypeValue) {
		this.totalTypeValue = totalTypeValue;
	}

	public Double getNetworthValue() {
		return networthValue;
	}

	public void setNetworthValue(Double networthValue) {
		this.networthValue = networthValue;
	}

	public String getRootTypeName() {
		return rootTypeName;
	}

	public void setRootTypeName(String rootTypeName) {
		this.rootTypeName = rootTypeName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public List<PortfolioNetWorthDto> getNetworthDetails() {
		return networthDetails;
	}

	public void setNetworthDetails(List<PortfolioNetWorthDto> networthDetails) {
		this.networthDetails = networthDetails;
	}

	public List<PortfolioNetWorthDto> getNetworthTotal() {
		return networthTotal;
	}

	public void setNetworthTotal(List<PortfolioNetWorthDto> networthTotal) {
		this.networthTotal = networthTotal;
	}

	public Map<String, Double> getTypeValueMap() {
		return typeValueMap;
	}

	public void setTypeValueMap(Map<String, Double> typeValueMap) {
		this.typeValueMap = typeValueMap;
	}

	public Map<String, Double> getTotaltypeValueMap() {
		return totaltypeValueMap;
	}

	public void setTotaltypeValueMap(Map<String, Double> totaltypeValueMap) {
		this.totaltypeValueMap = totaltypeValueMap;
	}

	public Map<String, Map<String, Map<String, List<PortfolioNetWorthDto>>>> getRootMap() {
		return rootMap;
	}

	public void setRootMap(Map<String, Map<String, Map<String, List<PortfolioNetWorthDto>>>> rootMap) {
		this.rootMap = rootMap;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTotalAssetsForReport() {
		return totalAssetsForReport;
	}

	public void setTotalAssetsForReport(String totalAssetsForReport) {
		this.totalAssetsForReport = totalAssetsForReport;
	}

	public String getTotalLiabilitiesForReport() {
		return totalLiabilitiesForReport;
	}

	public void setTotalLiabilitiesForReport(String totalLiabilitiesForReport) {
		this.totalLiabilitiesForReport = totalLiabilitiesForReport;
	}

	public String getNetworthForReport() {
		return networthForReport;
	}

	public void setNetworthForReport(String networthForReport) {
		this.networthForReport = networthForReport;
	}

	public String getAssetBreakupName() {
		return assetBreakupName;
	}

	public void setAssetBreakupName(String assetBreakupName) {
		this.assetBreakupName = assetBreakupName;
	}

	public String getAssetBreakupValue() {
		return assetBreakupValue;
	}

	public void setAssetBreakupValue(String assetBreakupValue) {
		this.assetBreakupValue = assetBreakupValue;
	}
	
	
	

}
