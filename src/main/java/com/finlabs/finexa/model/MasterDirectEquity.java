package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The persistent class for the masterDirectEquity database table.
 * 
 */
@Entity
@Table(name = "masterDirectEquity")
@NamedQuery(name = "MasterDirectEquity.findAll", query = "SELECT m FROM MasterDirectEquity m")
public class MasterDirectEquity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ISIN")
	private String isin;

	private Integer bseCode;

	private String nseCode;

	private String stockName;

	// bi-directional many-to-one association to ClientEquity
	@OneToMany(mappedBy = "masterDirectEquity")
	private List<ClientEquity> clientEquities;

	// bi-directional many-to-one association to MasterMFSector
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sectorID")
	private MasterMFSector masterMfsector;
	
	//bi-directional one-to-one association to MasterDirectEquityMarketCap
	@OneToOne(mappedBy="masterDirectEquity", fetch=FetchType.LAZY)
	private MasterDirectEquityMarketCap masterDirectEquityMarketCap;


	public MasterDirectEquity() {
	}

	public String getIsin() {
		return this.isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public Integer getBseCode() {
		return this.bseCode;
	}

	public void setBseCode(Integer bseCode) {
		this.bseCode = bseCode;
	}

	public String getNseCode() {
		return this.nseCode;
	}

	public void setNseCode(String nseCode) {
		this.nseCode = nseCode;
	}

	public String getStockName() {
		return this.stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public List<ClientEquity> getClientEquities() {
		return this.clientEquities;
	}

	public void setClientEquities(List<ClientEquity> clientEquities) {
		this.clientEquities = clientEquities;
	}

	public ClientEquity addClientEquity(ClientEquity clientEquity) {
		getClientEquities().add(clientEquity);
		clientEquity.setMasterDirectEquity(this);

		return clientEquity;
	}

	public ClientEquity removeClientEquity(ClientEquity clientEquity) {
		getClientEquities().remove(clientEquity);
		clientEquity.setMasterDirectEquity(null);

		return clientEquity;
	}

	public MasterMFSector getMasterMfsector() {
		return this.masterMfsector;
	}

	public void setMasterMfsector(MasterMFSector masterMfsector) {
		this.masterMfsector = masterMfsector;
	}
	
	public MasterDirectEquityMarketCap getMasterDirectEquityMarketCap() {
		return this.masterDirectEquityMarketCap;
	}

	public void setMasterDirectEquityMarketCap(MasterDirectEquityMarketCap masterDirectEquityMarketCap) {
		this.masterDirectEquityMarketCap = masterDirectEquityMarketCap;
	}

}