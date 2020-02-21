package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the masterTransactBSEMFPhysicalScheme database table.
 * 
 */
@Entity
@Table(name="masterTransactBSEMFPhysicalScheme")
@NamedQuery(name="MasterTransactBSEMFPhysicalScheme.findAll", query="SELECT m FROM MasterTransactBSEMFPhysicalScheme m")
public class MasterTransactBSEMFPhysicalScheme implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int uniqueNo;

	private String additionalPurchaseAmount;

	private int amcActiveFlag;

	private String amcCode;

	private int amcInd;

	private String amcSchemeCode;

	private String channelPartnerCode;

	private String dividendReinvestmentFlag;

	@Temporal(TemporalType.DATE)
	private Date endDate;

	private int exitLoad;

	private String exitLoadFlag;

	private int faceValue;

	private String isin;

	private int lockInPeriod;

	private String lockInPeriodFlag;

	private String maximumPurchaseAmount;

	private BigDecimal maximumRedemptionAmount;

	private BigDecimal maximumRedemptionQty;

	private String minimumPurchaseAmount;

	private BigDecimal minimumRedemptionAmount;

	private BigDecimal minimumRedemptionQty;

	private BigDecimal multipleRedemptionAmount;

	private String purchaseAllowed;

	private String purchaseAmountMultiplier;

	private Time purchaseCutoffTime;

	private String purchaseTransactionMode;

	private String redemptionAllowed;

	private Time redemptionCutOffTime;

	private BigDecimal redemptionQtyMultiplier;

	private String redemptionTransactionMode;

	private String rtaAgentCode;

	private String rtaSchemeCode;

	private String schemeCode;

	private String schemeName;

	private String schemePlan;

	private String schemeType;

	private String settlementType;

	private String sipFlag;

	@Temporal(TemporalType.DATE)
	private Date startDate;

	private String stpFlag;

	private String switchFlag;

	private String swpFlag;

	//bi-directional many-to-one association to PurchaseOrderEntryParam
	@OneToMany(mappedBy="masterTransactBsemfphysicalScheme")
	private List<PurchaseOrderEntryParam> purchaseOrderEntryParams;

	//bi-directional many-to-one association to ClientSWPSTPOrderRegistration
	@OneToMany(mappedBy="masterTransactBsemfphysicalScheme")
	private List<ClientSWPOrderRegistration> clientSwpstporderRegistrations;

	//bi-directional many-to-one association to XsipOrderEntryParam
	@OneToMany(mappedBy="masterTransactBsemfphysicalScheme")
	private List<XsipOrderEntryParam> xsipOrderEntryParams;

	public MasterTransactBSEMFPhysicalScheme() {
	}

	public int getUniqueNo() {
		return this.uniqueNo;
	}

	public void setUniqueNo(int uniqueNo) {
		this.uniqueNo = uniqueNo;
	}

	public String getAdditionalPurchaseAmount() {
		return this.additionalPurchaseAmount;
	}

	public void setAdditionalPurchaseAmount(String additionalPurchaseAmount) {
		this.additionalPurchaseAmount = additionalPurchaseAmount;
	}

	public int getAmcActiveFlag() {
		return this.amcActiveFlag;
	}

	public void setAmcActiveFlag(int amcActiveFlag) {
		this.amcActiveFlag = amcActiveFlag;
	}

	public String getAmcCode() {
		return this.amcCode;
	}

	public void setAmcCode(String amcCode) {
		this.amcCode = amcCode;
	}

	public int getAmcInd() {
		return this.amcInd;
	}

	public void setAmcInd(int amcInd) {
		this.amcInd = amcInd;
	}

	public String getAmcSchemeCode() {
		return this.amcSchemeCode;
	}

	public void setAmcSchemeCode(String amcSchemeCode) {
		this.amcSchemeCode = amcSchemeCode;
	}

	public String getChannelPartnerCode() {
		return this.channelPartnerCode;
	}

	public void setChannelPartnerCode(String channelPartnerCode) {
		this.channelPartnerCode = channelPartnerCode;
	}

	public String getDividendReinvestmentFlag() {
		return this.dividendReinvestmentFlag;
	}

	public void setDividendReinvestmentFlag(String dividendReinvestmentFlag) {
		this.dividendReinvestmentFlag = dividendReinvestmentFlag;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getExitLoad() {
		return this.exitLoad;
	}

	public void setExitLoad(int exitLoad) {
		this.exitLoad = exitLoad;
	}

	public String getExitLoadFlag() {
		return this.exitLoadFlag;
	}

	public void setExitLoadFlag(String exitLoadFlag) {
		this.exitLoadFlag = exitLoadFlag;
	}

	public int getFaceValue() {
		return this.faceValue;
	}

	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}

	public String getIsin() {
		return this.isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public int getLockInPeriod() {
		return this.lockInPeriod;
	}

	public void setLockInPeriod(int lockInPeriod) {
		this.lockInPeriod = lockInPeriod;
	}

	public String getLockInPeriodFlag() {
		return this.lockInPeriodFlag;
	}

	public void setLockInPeriodFlag(String lockInPeriodFlag) {
		this.lockInPeriodFlag = lockInPeriodFlag;
	}

	public String getMaximumPurchaseAmount() {
		return this.maximumPurchaseAmount;
	}

	public void setMaximumPurchaseAmount(String maximumPurchaseAmount) {
		this.maximumPurchaseAmount = maximumPurchaseAmount;
	}

	public BigDecimal getMaximumRedemptionAmount() {
		return this.maximumRedemptionAmount;
	}

	public void setMaximumRedemptionAmount(BigDecimal maximumRedemptionAmount) {
		this.maximumRedemptionAmount = maximumRedemptionAmount;
	}

	public BigDecimal getMaximumRedemptionQty() {
		return this.maximumRedemptionQty;
	}

	public void setMaximumRedemptionQty(BigDecimal maximumRedemptionQty) {
		this.maximumRedemptionQty = maximumRedemptionQty;
	}

	public String getMinimumPurchaseAmount() {
		return this.minimumPurchaseAmount;
	}

	public void setMinimumPurchaseAmount(String minimumPurchaseAmount) {
		this.minimumPurchaseAmount = minimumPurchaseAmount;
	}

	public BigDecimal getMinimumRedemptionAmount() {
		return this.minimumRedemptionAmount;
	}

	public void setMinimumRedemptionAmount(BigDecimal minimumRedemptionAmount) {
		this.minimumRedemptionAmount = minimumRedemptionAmount;
	}

	public BigDecimal getMinimumRedemptionQty() {
		return this.minimumRedemptionQty;
	}

	public void setMinimumRedemptionQty(BigDecimal minimumRedemptionQty) {
		this.minimumRedemptionQty = minimumRedemptionQty;
	}

	public BigDecimal getMultipleRedemptionAmount() {
		return this.multipleRedemptionAmount;
	}

	public void setMultipleRedemptionAmount(BigDecimal multipleRedemptionAmount) {
		this.multipleRedemptionAmount = multipleRedemptionAmount;
	}

	public String getPurchaseAllowed() {
		return this.purchaseAllowed;
	}

	public void setPurchaseAllowed(String purchaseAllowed) {
		this.purchaseAllowed = purchaseAllowed;
	}

	public String getPurchaseAmountMultiplier() {
		return this.purchaseAmountMultiplier;
	}

	public void setPurchaseAmountMultiplier(String purchaseAmountMultiplier) {
		this.purchaseAmountMultiplier = purchaseAmountMultiplier;
	}

	public Time getPurchaseCutoffTime() {
		return this.purchaseCutoffTime;
	}

	public void setPurchaseCutoffTime(Time purchaseCutoffTime) {
		this.purchaseCutoffTime = purchaseCutoffTime;
	}

	public String getPurchaseTransactionMode() {
		return this.purchaseTransactionMode;
	}

	public void setPurchaseTransactionMode(String purchaseTransactionMode) {
		this.purchaseTransactionMode = purchaseTransactionMode;
	}

	public String getRedemptionAllowed() {
		return this.redemptionAllowed;
	}

	public void setRedemptionAllowed(String redemptionAllowed) {
		this.redemptionAllowed = redemptionAllowed;
	}

	public Time getRedemptionCutOffTime() {
		return this.redemptionCutOffTime;
	}

	public void setRedemptionCutOffTime(Time redemptionCutOffTime) {
		this.redemptionCutOffTime = redemptionCutOffTime;
	}

	public BigDecimal getRedemptionQtyMultiplier() {
		return this.redemptionQtyMultiplier;
	}

	public void setRedemptionQtyMultiplier(BigDecimal redemptionQtyMultiplier) {
		this.redemptionQtyMultiplier = redemptionQtyMultiplier;
	}

	public String getRedemptionTransactionMode() {
		return this.redemptionTransactionMode;
	}

	public void setRedemptionTransactionMode(String redemptionTransactionMode) {
		this.redemptionTransactionMode = redemptionTransactionMode;
	}

	public String getRtaAgentCode() {
		return this.rtaAgentCode;
	}

	public void setRtaAgentCode(String rtaAgentCode) {
		this.rtaAgentCode = rtaAgentCode;
	}

	public String getRtaSchemeCode() {
		return this.rtaSchemeCode;
	}

	public void setRtaSchemeCode(String rtaSchemeCode) {
		this.rtaSchemeCode = rtaSchemeCode;
	}

	public String getSchemeCode() {
		return this.schemeCode;
	}

	public void setSchemeCode(String schemeCode) {
		this.schemeCode = schemeCode;
	}

	public String getSchemeName() {
		return this.schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public String getSchemePlan() {
		return this.schemePlan;
	}

	public void setSchemePlan(String schemePlan) {
		this.schemePlan = schemePlan;
	}

	public String getSchemeType() {
		return this.schemeType;
	}

	public void setSchemeType(String schemeType) {
		this.schemeType = schemeType;
	}

	public String getSettlementType() {
		return this.settlementType;
	}

	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}

	public String getSipFlag() {
		return this.sipFlag;
	}

	public void setSipFlag(String sipFlag) {
		this.sipFlag = sipFlag;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStpFlag() {
		return this.stpFlag;
	}

	public void setStpFlag(String stpFlag) {
		this.stpFlag = stpFlag;
	}

	public String getSwitchFlag() {
		return this.switchFlag;
	}

	public void setSwitchFlag(String switchFlag) {
		this.switchFlag = switchFlag;
	}

	public String getSwpFlag() {
		return this.swpFlag;
	}

	public void setSwpFlag(String swpFlag) {
		this.swpFlag = swpFlag;
	}

	public List<PurchaseOrderEntryParam> getPurchaseOrderEntryParams() {
		return this.purchaseOrderEntryParams;
	}

	public void setPurchaseOrderEntryParams(List<PurchaseOrderEntryParam> purchaseOrderEntryParams) {
		this.purchaseOrderEntryParams = purchaseOrderEntryParams;
	}

	public PurchaseOrderEntryParam addPurchaseOrderEntryParam(PurchaseOrderEntryParam purchaseOrderEntryParam) {
		getPurchaseOrderEntryParams().add(purchaseOrderEntryParam);
		purchaseOrderEntryParam.setMasterTransactBsemfphysicalScheme(this);

		return purchaseOrderEntryParam;
	}

	public PurchaseOrderEntryParam removePurchaseOrderEntryParam(PurchaseOrderEntryParam purchaseOrderEntryParam) {
		getPurchaseOrderEntryParams().remove(purchaseOrderEntryParam);
		purchaseOrderEntryParam.setMasterTransactBsemfphysicalScheme(null);

		return purchaseOrderEntryParam;
	}

	public List<ClientSWPOrderRegistration> getClientSwpstporderRegistrations() {
		return this.clientSwpstporderRegistrations;
	}

	public void setClientSwpstporderRegistrations(List<ClientSWPOrderRegistration> clientSwpstporderRegistrations) {
		this.clientSwpstporderRegistrations = clientSwpstporderRegistrations;
	}

	public ClientSWPOrderRegistration addClientSwpstporderRegistration(ClientSWPOrderRegistration clientSwpstporderRegistration) {
		getClientSwpstporderRegistrations().add(clientSwpstporderRegistration);
		clientSwpstporderRegistration.setMasterTransactBsemfphysicalScheme(this);

		return clientSwpstporderRegistration;
	}

	public ClientSWPOrderRegistration removeClientSwpstporderRegistration(ClientSWPOrderRegistration clientSwpstporderRegistration) {
		getClientSwpstporderRegistrations().remove(clientSwpstporderRegistration);
		clientSwpstporderRegistration.setMasterTransactBsemfphysicalScheme(null);

		return clientSwpstporderRegistration;
	}

	public List<XsipOrderEntryParam> getXsipOrderEntryParams() {
		return this.xsipOrderEntryParams;
	}

	public void setXsipOrderEntryParams(List<XsipOrderEntryParam> xsipOrderEntryParams) {
		this.xsipOrderEntryParams = xsipOrderEntryParams;
	}

	public XsipOrderEntryParam addXsipOrderEntryParam(XsipOrderEntryParam xsipOrderEntryParam) {
		getXsipOrderEntryParams().add(xsipOrderEntryParam);
		xsipOrderEntryParam.setMasterTransactBsemfphysicalScheme(this);

		return xsipOrderEntryParam;
	}

	public XsipOrderEntryParam removeXsipOrderEntryParam(XsipOrderEntryParam xsipOrderEntryParam) {
		getXsipOrderEntryParams().remove(xsipOrderEntryParam);
		xsipOrderEntryParam.setMasterTransactBsemfphysicalScheme(null);

		return xsipOrderEntryParam;
	}

}