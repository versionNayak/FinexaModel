package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the lookupRTABO database table.
 * 
 */
@Entity
@Table(name="lookupRTABO")
@NamedQuery(name="LookupRTABO.findAll", query="SELECT l FROM LookupRTABO l")
public class LookupRTABO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	//bi-directional many-to-one association to MasterFileMappingBO
	@OneToMany(mappedBy="lookupRtabo")
	private List<MasterFileMappingBO> masterFileMappingBos;
	
	//bi-directional many-to-one association to InvestorMasterBO
	@OneToMany(mappedBy="lookupRtabo")
	private List<InvestorMasterBO> investorMasterBos;
	
	//bi-directional many-to-one association to TransactionMasterBO
	@OneToMany(mappedBy="lookupRtabo")
	private List<TransactionMasterBO> transactionMasterBos;
	
	//bi-directional many-to-one association to RejectionMasterBO
	@OneToMany(mappedBy="lookupRtabo")
	private List<RejectionMasterBO> rejectionMasterBos;
	
	//bi-directional many-to-one association to AumMasterBO
	@OneToMany(mappedBy="lookupRtabo")
	private List<AumMasterBO> aumMasterBos;
	
	//bi-directional many-to-one association to SipSTPMasterBO
	@OneToMany(mappedBy="lookupRtabo")
	private List<SIPSTPMasterBO> sipStpmasterBos;
	
	//bi-directional many-to-one association to BackOfficeUploadHistory
		@OneToMany(mappedBy="lookupRtabo")
		private List<BackOfficeUploadHistory> backOfficeUploadHistories;


	public LookupRTABO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MasterFileMappingBO> getMasterFileMappingBos() {
		return this.masterFileMappingBos;
	}

	public void setMasterFileMappingBos(List<MasterFileMappingBO> masterFileMappingBos) {
		this.masterFileMappingBos = masterFileMappingBos;
	}
	
	public List<InvestorMasterBO> getInvestorMasterBos() {
		return this.investorMasterBos;
	}

	public void setInvestorMasterBos(List<InvestorMasterBO> investorMasterBos) {
		this.investorMasterBos = investorMasterBos;
	}

	public InvestorMasterBO addInvestorMasterBo(InvestorMasterBO investorMasterBo) {
		getInvestorMasterBos().add(investorMasterBo);
		investorMasterBo.setLookupRtabo(this);

		return investorMasterBo;
	}

	public InvestorMasterBO removeInvestorMasterBo(InvestorMasterBO investorMasterBo) {
		getInvestorMasterBos().remove(investorMasterBo);
		investorMasterBo.setLookupRtabo(null);

		return investorMasterBo;
	}
	
	public List<TransactionMasterBO> getTransactionMasterBos() {
		return this.transactionMasterBos;
	}

	public void setTransactionMasterBos(List<TransactionMasterBO> transactionMasterBos) {
		this.transactionMasterBos = transactionMasterBos;
	}

	public TransactionMasterBO addTransactionMasterBo(TransactionMasterBO transactionMasterBo) {
		getTransactionMasterBos().add(transactionMasterBo);
		transactionMasterBo.setLookupRtabo(this);

		return transactionMasterBo;
	}

	public TransactionMasterBO removeTransactionMasterBo(TransactionMasterBO transactionMasterBo) {
		getTransactionMasterBos().remove(transactionMasterBo);
		transactionMasterBo.setLookupRtabo(null);

		return transactionMasterBo;
	}
	
	public List<RejectionMasterBO> getRejectionMasterBos() {
		return this.rejectionMasterBos;
	}

	public void setRejectionMasterBos(List<RejectionMasterBO> rejectionMasterBos) {
		this.rejectionMasterBos = rejectionMasterBos;
	}

	public RejectionMasterBO addRejectionMasterBo(RejectionMasterBO rejectionMasterBo) {
		getRejectionMasterBos().add(rejectionMasterBo);
		rejectionMasterBo.setLookupRtabo(this);

		return rejectionMasterBo;
	}

	public RejectionMasterBO removeRejectionMasterBo(RejectionMasterBO rejectionMasterBo) {
		getRejectionMasterBos().remove(rejectionMasterBo);
		rejectionMasterBo.setLookupRtabo(null);

		return rejectionMasterBo;
	}
	
	public List<AumMasterBO> getAumMasterBos() {
		return this.aumMasterBos;
	}

	public void setAumMasterBos(List<AumMasterBO> aumMasterBos) {
		this.aumMasterBos = aumMasterBos;
	}

	public AumMasterBO addAumMasterBo(AumMasterBO aumMasterBo) {
		getAumMasterBos().add(aumMasterBo);
		aumMasterBo.setLookupRtabo(this);

		return aumMasterBo;
	}

	public AumMasterBO removeAumMasterBo(AumMasterBO aumMasterBo) {
		getAumMasterBos().remove(aumMasterBo);
		aumMasterBo.setLookupRtabo(null);

		return aumMasterBo;
	}
	
	public List<SIPSTPMasterBO> getSipStpmasterBos() {
		return this.sipStpmasterBos;
	}

	public void setSipStpmasterBos(List<SIPSTPMasterBO> sipStpmasterBos) {
		this.sipStpmasterBos = sipStpmasterBos;
	}

	public SIPSTPMasterBO addSipStpmasterBo(SIPSTPMasterBO sipStpmasterBo) {
		getSipStpmasterBos().add(sipStpmasterBo);
		sipStpmasterBo.setLookupRtabo(this);

		return sipStpmasterBo;
	}

	public SIPSTPMasterBO removeSipStpmasterBo(SIPSTPMasterBO sipStpmasterBo) {
		getSipStpmasterBos().remove(sipStpmasterBo);
		sipStpmasterBo.setLookupRtabo(null);

		return sipStpmasterBo;
	}
	
	public List<BackOfficeUploadHistory> getBackOfficeUploadHistories() {
		return this.backOfficeUploadHistories;
	}

	public void setBackOfficeUploadHistories(List<BackOfficeUploadHistory> backOfficeUploadHistories) {
		this.backOfficeUploadHistories = backOfficeUploadHistories;
	}

	public BackOfficeUploadHistory addBackOfficeUploadHistory(BackOfficeUploadHistory backOfficeUploadHistory) {
		getBackOfficeUploadHistories().add(backOfficeUploadHistory);
		backOfficeUploadHistory.setLookupRtabo(this);

		return backOfficeUploadHistory;
	}

	public BackOfficeUploadHistory removeBackOfficeUploadHistory(BackOfficeUploadHistory backOfficeUploadHistory) {
		getBackOfficeUploadHistories().remove(backOfficeUploadHistory);
		backOfficeUploadHistory.setLookupRtabo(null);

		return backOfficeUploadHistory;
	}


}