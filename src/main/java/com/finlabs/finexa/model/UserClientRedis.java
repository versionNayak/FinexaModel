package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.List;

public class UserClientRedis implements Serializable{
	private static final long serialVersionUID = 1L;
	 private int id;
     private int offset;
     private int limit;
     private int totalClient;
     private List<ClientMaster> Clientmasters;
     private List<ClientMaster> ClientmastersTotalRedis;
     private List<PortfolioNetWorthDto> PortfolioNetWorthDtoList;
     
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getTotalClient() {
		return totalClient;
	}
	public void setTotalClient(int totalClient) {
		this.totalClient = totalClient;
	}
	
	public List<ClientMaster> getClientmastersTotalRedis() {
		return ClientmastersTotalRedis;
	}
	public void setClientmastersTotalRedis(List<ClientMaster> clientmastersTotalRedis) {
		ClientmastersTotalRedis = clientmastersTotalRedis;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<ClientMaster> getClientmasters() {
		return Clientmasters;
	}
	public void setClientmasters(List<ClientMaster> clientmasters) {
		Clientmasters = clientmasters;
	}
	public List<PortfolioNetWorthDto> getPortfolioNetWorthDtoList() {
		return PortfolioNetWorthDtoList;
	}
	public void setPortfolioNetWorthDtoList(List<PortfolioNetWorthDto> portfolioNetWorthDtoList) {
		PortfolioNetWorthDtoList = portfolioNetWorthDtoList;
	}
	
}
