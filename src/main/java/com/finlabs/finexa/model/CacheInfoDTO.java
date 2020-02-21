package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class CacheInfoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer clientId;
	private Map<String, List<?>> calculatedMethodListMap;
	private Map<String, Map<String,List<?>>> calculatedMethodMap;
	
	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public Map<String, List<?>> getCalculatedMethodListMap() {
		return calculatedMethodListMap;
	}

	public void setCalculatedMethodListMap(Map<String, List<?>> calculatedMethodListMap) {
		this.calculatedMethodListMap = calculatedMethodListMap;
	}

	public Map<String, Map<String, List<?>>> getCalculatedMethodMap() {
		return calculatedMethodMap;
	}

	public void setCalculatedMethodMap(Map<String, Map<String, List<?>>> calculatedMethodMap) {
		this.calculatedMethodMap = calculatedMethodMap;
	}

}
