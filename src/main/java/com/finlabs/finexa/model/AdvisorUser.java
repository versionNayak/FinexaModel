package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the advisorUser database table.
 * 
 */
@Entity
@Table(name = "advisorUser")
@NamedQuery(name = "AdvisorUser.findAll", query = "SELECT a FROM AdvisorUser a")
public class AdvisorUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String activeFlag;

	@Temporal(TemporalType.DATE)
	private Date birthDate;

	private String city;

	private String emailID;

	private String employeeCode;

	private String firstName;

	private String gender;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastLoginTime;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastLogoutTime;

	private String lastName;

	private String loginPassword;

	private String loginUsername;

	private String middleName;

	private String phoneCountryCode;

	private BigInteger phoneNo;

	private String salutation;

	private String state;

	private String bseUsername;

	@Lob
	private byte[] bsePassword;

	private String bseMemberId;

	@Lob
	private byte[] logo;
	
	private String loggedInFlag;

	// bi-directional many-to-one association to AdvisorMaster
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "advisorID")
	private AdvisorMaster advisorMaster;

	// bi-directional many-to-one association to LookupCountry
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "country")
	private LookupCountry lookupCountry;

	// bi-directional many-to-one association to AdvisorUserLoginInfo
	@OneToMany(cascade =CascadeType.ALL, mappedBy = "advisorUser")
	private List<AdvisorUserLoginInfo> advisorUserLoginInfos;

	// bi-directional many-to-one association to AdvisorUserRoleMapping
	@OneToMany(mappedBy = "advisorUser")
	private List<AdvisorUserRoleMapping> advisorUserRoleMappings;

	// bi-directional many-to-one association to AdvisorUserSupervisorMapping
	@OneToMany(mappedBy = "advisorUser1")
	private List<AdvisorUserSupervisorMapping> advisorUserSupervisorMappings1;

	// bi-directional many-to-one association to AdvisorUserSupervisorMapping
	@OneToMany(mappedBy = "advisorUser2")
	private List<AdvisorUserSupervisorMapping> advisorUserSupervisorMappings2;

	// bi-directional many-to-one association to ClientMaster
	@OneToMany(mappedBy = "advisorUser")
	private List<ClientMaster> clientMasters;

	// bi-directional many-to-one association to ClientMaster
	@OneToMany(mappedBy = "advisorUser")
	private List<ClientMeeting> clientMeetings;

	// bi-directional many-to-one association to ClientMaster
	@OneToMany(mappedBy = "advisorUser")
	private List<ClientTask> clientTask;

	// bi-directional many-to-one association to MasterTablesUploadHistory
	@OneToMany(mappedBy = "advisorUser")
	private List<MasterTablesUploadHistory> masterTablesUploadHistories;

	// bi-directional many-to-one association to AdvisorProductReco
	@OneToMany(mappedBy = "advisorUser")
	private List<AdvisorProductReco> advisorProductRecos;

	// bi-directional many-to-one association to ClientUCCDetail
	@OneToMany(mappedBy = "advisorUser")
	private List<ClientUCCDetail> clientUccdetails;

	// bi-directional many-to-one association to ClientFatcaReport
	@OneToMany(mappedBy = "advisorUser")
	private List<ClientFatcaReport> clientFatcaReports;

	// bi-directional many-to-one association to ClientMandateRegistration
	@OneToMany(mappedBy = "advisorUser")
	private List<ClientMandateRegistration> clientMandateRegistrations;

	// bi-directional many-to-one association to ClientSWPSTPOrderRegistration
	@OneToMany(mappedBy = "advisorUser")
	private List<ClientSWPOrderRegistration> clientSwpstporderRegistrations;

	// bi-directional many-to-one association to ClientUCCDetailsDraftMode
	@OneToMany(mappedBy = "advisorUser")
	private List<ClientUCCDetailsDraftMode> clientUccdetailsDraftModes;

	// bi-directional many-to-one association to PurchaseOrderEntryParam
	@OneToMany(mappedBy = "advisorUser")
	private List<PurchaseOrderEntryParam> purchaseOrderEntryParams;

	// bi-directional many-to-one association to XsipOrderEntryParam
	@OneToMany(mappedBy = "advisorUser")
	private List<XsipOrderEntryParam> xsipOrderEntryParams;

	// bi-directional many-to-one association to ClientCKYCDetail
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientCKYCDetail> clientCkycdetails;

	// bi-directional many-to-one association to ClientTransactAOFDetail
	@OneToMany(mappedBy = "advisorUser")
	private List<ClientTransactAOFDetail> clientTransactAofdetails;

	// bi-directional many-to-one association to ClientTransactMandateDetail
	@OneToMany(mappedBy = "advisorUser")
	private List<ClientTransactMandateDetail> clientTransactMandateDetails;

	// bi-directional many-to-one association to ClientSwitchOrderEntryParam
	@OneToMany(mappedBy = "advisorUser")
	private List<ClientSwitchOrderEntryParam> clientSwitchOrderEntryParams;

	// bi-directional many-to-one association to ClientTransactRedeemOrder
	@OneToMany(mappedBy = "advisorUser")
	private List<ClientTransactRedeemOrder> clientTransactRedeemOrders;

	// bi-directional many-to-one association to LookupTransactBSEAccessMode
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bseAccessMode")
	private LookupTransactBSEAccessMode lookupTransactBseaccessMode;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userID")
	private User user;
	
	//bi-directional many-to-one association to BranchMasterDetailsBO
	@OneToMany(mappedBy="advisorUser")
	private List<BranchMasterDetailsBO> branchMasterDetailsBos;
	
	//bi-directional many-to-one association to BackOfficeUploadHistory
	@OneToMany(mappedBy="advisorUser")
	private List<BackOfficeUploadHistory> backOfficeUploadHistories;
	
	//bi-directional many-to-one association to AdvisorUserBulkUploadHistory
	@OneToMany(mappedBy="advisorUser")
	private List<AdvisorUserBulkUploadHistory> advisorUserBulkUploadHistories;

	//bi-directional many-to-one association to ClientARNMapping
	@OneToMany(mappedBy="advisorUser")
	private List<ClientARNMapping> clientArnmappings;

	public AdvisorUser() {
	}

	public List<AdvisorUserBulkUploadHistory> getAdvisorUserBulkUploadHistories() {
		return advisorUserBulkUploadHistories;
	}

	public void setAdvisorUserBulkUploadHistories(List<AdvisorUserBulkUploadHistory> advisorUserBulkUploadHistories) {
		this.advisorUserBulkUploadHistories = advisorUserBulkUploadHistories;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmailID() {
		return this.emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getEmployeeCode() {
		return this.employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getLastLogoutTime() {
		return this.lastLogoutTime;
	}

	public void setLastLogoutTime(Date lastLogoutTime) {
		this.lastLogoutTime = lastLogoutTime;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLoginPassword() {
		return this.loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getLoginUsername() {
		return this.loginUsername;
	}

	public void setLoginUsername(String loginUsername) {
		this.loginUsername = loginUsername;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPhoneCountryCode() {
		return this.phoneCountryCode;
	}

	public void setPhoneCountryCode(String phoneCountryCode) {
		this.phoneCountryCode = phoneCountryCode;
	}

	public BigInteger getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(BigInteger phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getSalutation() {
		return this.salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public AdvisorMaster getAdvisorMaster() {
		return this.advisorMaster;
	}

	public void setAdvisorMaster(AdvisorMaster advisorMaster) {
		this.advisorMaster = advisorMaster;
	}

	public LookupCountry getLookupCountry() {
		return this.lookupCountry;
	}

	public void setLookupCountry(LookupCountry lookupCountry) {
		this.lookupCountry = lookupCountry;
	}

	public List<AdvisorUserLoginInfo> getAdvisorUserLoginInfos() {
		return this.advisorUserLoginInfos;
	}

	public void setAdvisorUserLoginInfos(List<AdvisorUserLoginInfo> advisorUserLoginInfos) {
		this.advisorUserLoginInfos = advisorUserLoginInfos;
	}

	public AdvisorUserLoginInfo addAdvisorUserLoginInfo(AdvisorUserLoginInfo advisorUserLoginInfo) {
		getAdvisorUserLoginInfos().add(advisorUserLoginInfo);
		advisorUserLoginInfo.setAdvisorUser(this);

		return advisorUserLoginInfo;
	}

	public AdvisorUserLoginInfo removeAdvisorUserLoginInfo(AdvisorUserLoginInfo advisorUserLoginInfo) {
		getAdvisorUserLoginInfos().remove(advisorUserLoginInfo);
		advisorUserLoginInfo.setAdvisorUser(null);

		return advisorUserLoginInfo;
	}

	public List<AdvisorUserRoleMapping> getAdvisorUserRoleMappings() {
		return this.advisorUserRoleMappings;
	}

	public void setAdvisorUserRoleMappings(List<AdvisorUserRoleMapping> advisorUserRoleMappings) {
		this.advisorUserRoleMappings = advisorUserRoleMappings;
	}

	public AdvisorUserRoleMapping addAdvisorUserRoleMapping(AdvisorUserRoleMapping advisorUserRoleMapping) {
		getAdvisorUserRoleMappings().add(advisorUserRoleMapping);
		advisorUserRoleMapping.setAdvisorUser(this);

		return advisorUserRoleMapping;
	}

	public AdvisorUserRoleMapping removeAdvisorUserRoleMapping(AdvisorUserRoleMapping advisorUserRoleMapping) {
		getAdvisorUserRoleMappings().remove(advisorUserRoleMapping);
		advisorUserRoleMapping.setAdvisorUser(null);

		return advisorUserRoleMapping;
	}

	public List<AdvisorUserSupervisorMapping> getAdvisorUserSupervisorMappings1() {
		return this.advisorUserSupervisorMappings1;
	}

	public void setAdvisorUserSupervisorMappings1(List<AdvisorUserSupervisorMapping> advisorUserSupervisorMappings1) {
		this.advisorUserSupervisorMappings1 = advisorUserSupervisorMappings1;
	}

	public AdvisorUserSupervisorMapping addAdvisorUserSupervisorMappings1(
			AdvisorUserSupervisorMapping advisorUserSupervisorMappings1) {
		getAdvisorUserSupervisorMappings1().add(advisorUserSupervisorMappings1);
		advisorUserSupervisorMappings1.setAdvisorUser1(this);

		return advisorUserSupervisorMappings1;
	}

	public AdvisorUserSupervisorMapping removeAdvisorUserSupervisorMappings1(
			AdvisorUserSupervisorMapping advisorUserSupervisorMappings1) {
		getAdvisorUserSupervisorMappings1().remove(advisorUserSupervisorMappings1);
		advisorUserSupervisorMappings1.setAdvisorUser1(null);

		return advisorUserSupervisorMappings1;
	}

	public List<AdvisorUserSupervisorMapping> getAdvisorUserSupervisorMappings2() {
		return this.advisorUserSupervisorMappings2;
	}

	public void setAdvisorUserSupervisorMappings2(List<AdvisorUserSupervisorMapping> advisorUserSupervisorMappings2) {
		this.advisorUserSupervisorMappings2 = advisorUserSupervisorMappings2;
	}

	public AdvisorUserSupervisorMapping addAdvisorUserSupervisorMappings2(
			AdvisorUserSupervisorMapping advisorUserSupervisorMappings2) {
		getAdvisorUserSupervisorMappings2().add(advisorUserSupervisorMappings2);
		advisorUserSupervisorMappings2.setAdvisorUser2(this);

		return advisorUserSupervisorMappings2;
	}

	public AdvisorUserSupervisorMapping removeAdvisorUserSupervisorMappings2(
			AdvisorUserSupervisorMapping advisorUserSupervisorMappings2) {
		getAdvisorUserSupervisorMappings2().remove(advisorUserSupervisorMappings2);
		advisorUserSupervisorMappings2.setAdvisorUser2(null);

		return advisorUserSupervisorMappings2;
	}

	public List<ClientMaster> getClientMasters() {
		return this.clientMasters;
	}

	public void setClientMasters(List<ClientMaster> clientMasters) {
		this.clientMasters = clientMasters;
	}

	public ClientMaster addClientMaster(ClientMaster clientMaster) {
		getClientMasters().add(clientMaster);
		clientMaster.setAdvisorUser(this);

		return clientMaster;
	}

	public ClientMaster removeClientMaster(ClientMaster clientMaster) {
		getClientMasters().remove(clientMaster);
		clientMaster.setAdvisorUser(null);

		return clientMaster;
	}

	public List<MasterTablesUploadHistory> getMasterTablesUploadHistories() {
		return this.masterTablesUploadHistories;
	}

	public void setMasterTablesUploadHistories(List<MasterTablesUploadHistory> masterTablesUploadHistories) {
		this.masterTablesUploadHistories = masterTablesUploadHistories;
	}

	public MasterTablesUploadHistory addMasterTablesUploadHistory(MasterTablesUploadHistory masterTablesUploadHistory) {
		getMasterTablesUploadHistories().add(masterTablesUploadHistory);
		masterTablesUploadHistory.setAdvisorUser(this);

		return masterTablesUploadHistory;
	}

	public MasterTablesUploadHistory removeMasterTablesUploadHistory(
			MasterTablesUploadHistory masterTablesUploadHistory) {
		getMasterTablesUploadHistories().remove(masterTablesUploadHistory);
		masterTablesUploadHistory.setAdvisorUser(null);

		return masterTablesUploadHistory;
	}

	public List<AdvisorProductReco> getAdvisorProductRecos() {
		return this.advisorProductRecos;
	}

	public void setAdvisorProductRecos(List<AdvisorProductReco> advisorProductRecos) {
		this.advisorProductRecos = advisorProductRecos;
	}

	public AdvisorProductReco addAdvisorProductReco(AdvisorProductReco advisorProductReco) {
		getAdvisorProductRecos().add(advisorProductReco);
		advisorProductReco.setAdvisorUser(this);

		return advisorProductReco;
	}

	public AdvisorProductReco removeAdvisorProductReco(AdvisorProductReco advisorProductReco) {
		getAdvisorProductRecos().remove(advisorProductReco);
		advisorProductReco.setAdvisorUser(null);

		return advisorProductReco;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public List<ClientMeeting> getClientMeetings() {
		return clientMeetings;
	}

	public void setClientMeetings(List<ClientMeeting> clientMeetings) {
		this.clientMeetings = clientMeetings;
	}

	public List<ClientTask> getClientTask() {
		return clientTask;
	}

	public void setClientTask(List<ClientTask> clientTask) {
		this.clientTask = clientTask;
	}

	public List<ClientUCCDetail> getClientUccdetails() {
		return this.clientUccdetails;
	}

	public void setClientUccdetails(List<ClientUCCDetail> clientUccdetails) {
		this.clientUccdetails = clientUccdetails;
	}

	public ClientUCCDetail addClientUccdetail(ClientUCCDetail clientUccdetail) {
		getClientUccdetails().add(clientUccdetail);
		clientUccdetail.setAdvisorUser(this);

		return clientUccdetail;
	}

	public ClientUCCDetail removeClientUccdetail(ClientUCCDetail clientUccdetail) {
		getClientUccdetails().remove(clientUccdetail);
		clientUccdetail.setAdvisorUser(null);

		return clientUccdetail;
	}

	public List<ClientFatcaReport> getClientFatcaReports() {
		return this.clientFatcaReports;
	}

	public void setClientFatcaReports(List<ClientFatcaReport> clientFatcaReports) {
		this.clientFatcaReports = clientFatcaReports;
	}

	public ClientFatcaReport addClientFatcaReport(ClientFatcaReport clientFatcaReport) {
		getClientFatcaReports().add(clientFatcaReport);
		clientFatcaReport.setAdvisorUser(this);

		return clientFatcaReport;
	}

	public ClientFatcaReport removeClientFatcaReport(ClientFatcaReport clientFatcaReport) {
		getClientFatcaReports().remove(clientFatcaReport);
		clientFatcaReport.setAdvisorUser(null);

		return clientFatcaReport;
	}

	public List<ClientMandateRegistration> getClientMandateRegistrations() {
		return this.clientMandateRegistrations;
	}

	public void setClientMandateRegistrations(List<ClientMandateRegistration> clientMandateRegistrations) {
		this.clientMandateRegistrations = clientMandateRegistrations;
	}

	public ClientMandateRegistration addClientMandateRegistration(ClientMandateRegistration clientMandateRegistration) {
		getClientMandateRegistrations().add(clientMandateRegistration);
		clientMandateRegistration.setAdvisorUser(this);

		return clientMandateRegistration;
	}

	public ClientMandateRegistration removeClientMandateRegistration(
			ClientMandateRegistration clientMandateRegistration) {
		getClientMandateRegistrations().remove(clientMandateRegistration);
		clientMandateRegistration.setAdvisorUser(null);

		return clientMandateRegistration;
	}

	public List<ClientSWPOrderRegistration> getClientSwpstporderRegistrations() {
		return this.clientSwpstporderRegistrations;
	}

	public void setClientSwpstporderRegistrations(List<ClientSWPOrderRegistration> clientSwpstporderRegistrations) {
		this.clientSwpstporderRegistrations = clientSwpstporderRegistrations;
	}

	public ClientSWPOrderRegistration addClientSwpstporderRegistration(
			ClientSWPOrderRegistration clientSwpstporderRegistration) {
		getClientSwpstporderRegistrations().add(clientSwpstporderRegistration);
		clientSwpstporderRegistration.setAdvisorUser(this);

		return clientSwpstporderRegistration;
	}

	public ClientSWPOrderRegistration removeClientSwpstporderRegistration(
			ClientSWPOrderRegistration clientSwpstporderRegistration) {
		getClientSwpstporderRegistrations().remove(clientSwpstporderRegistration);
		clientSwpstporderRegistration.setAdvisorUser(null);

		return clientSwpstporderRegistration;
	}

	public List<ClientUCCDetailsDraftMode> getClientUccdetailsDraftModes() {
		return this.clientUccdetailsDraftModes;
	}

	public void setClientUccdetailsDraftModes(List<ClientUCCDetailsDraftMode> clientUccdetailsDraftModes) {
		this.clientUccdetailsDraftModes = clientUccdetailsDraftModes;
	}

	public ClientUCCDetailsDraftMode addClientUccdetailsDraftMode(ClientUCCDetailsDraftMode clientUccdetailsDraftMode) {
		getClientUccdetailsDraftModes().add(clientUccdetailsDraftMode);
		clientUccdetailsDraftMode.setAdvisorUser(this);

		return clientUccdetailsDraftMode;
	}

	public ClientUCCDetailsDraftMode removeClientUccdetailsDraftMode(
			ClientUCCDetailsDraftMode clientUccdetailsDraftMode) {
		getClientUccdetailsDraftModes().remove(clientUccdetailsDraftMode);
		clientUccdetailsDraftMode.setAdvisorUser(null);

		return clientUccdetailsDraftMode;
	}

	public List<PurchaseOrderEntryParam> getPurchaseOrderEntryParams() {
		return this.purchaseOrderEntryParams;
	}

	public void setPurchaseOrderEntryParams(List<PurchaseOrderEntryParam> purchaseOrderEntryParams) {
		this.purchaseOrderEntryParams = purchaseOrderEntryParams;
	}

	public PurchaseOrderEntryParam addPurchaseOrderEntryParam(PurchaseOrderEntryParam purchaseOrderEntryParam) {
		getPurchaseOrderEntryParams().add(purchaseOrderEntryParam);
		purchaseOrderEntryParam.setAdvisorUser(this);

		return purchaseOrderEntryParam;
	}

	public PurchaseOrderEntryParam removePurchaseOrderEntryParam(PurchaseOrderEntryParam purchaseOrderEntryParam) {
		getPurchaseOrderEntryParams().remove(purchaseOrderEntryParam);
		purchaseOrderEntryParam.setAdvisorUser(null);

		return purchaseOrderEntryParam;
	}

	public List<XsipOrderEntryParam> getXsipOrderEntryParams() {
		return this.xsipOrderEntryParams;
	}

	public void setXsipOrderEntryParams(List<XsipOrderEntryParam> xsipOrderEntryParams) {
		this.xsipOrderEntryParams = xsipOrderEntryParams;
	}

	public XsipOrderEntryParam addXsipOrderEntryParam(XsipOrderEntryParam xsipOrderEntryParam) {
		getXsipOrderEntryParams().add(xsipOrderEntryParam);
		xsipOrderEntryParam.setAdvisorUser(this);

		return xsipOrderEntryParam;
	}

	public XsipOrderEntryParam removeXsipOrderEntryParam(XsipOrderEntryParam xsipOrderEntryParam) {
		getXsipOrderEntryParams().remove(xsipOrderEntryParam);
		xsipOrderEntryParam.setAdvisorUser(null);

		return xsipOrderEntryParam;
	}

	public List<ClientCKYCDetail> getClientCkycdetails() {
		return this.clientCkycdetails;
	}

	public void setClientCkycdetails(List<ClientCKYCDetail> clientCkycdetails) {
		this.clientCkycdetails = clientCkycdetails;
	}

	public ClientCKYCDetail addClientCkycdetail(ClientCKYCDetail clientCkycdetail) {
		getClientCkycdetails().add(clientCkycdetail);
		clientCkycdetail.setAdvisorUser(this);

		return clientCkycdetail;
	}

	public ClientCKYCDetail removeClientCkycdetail(ClientCKYCDetail clientCkycdetail) {
		getClientCkycdetails().remove(clientCkycdetail);
		clientCkycdetail.setAdvisorUser(null);

		return clientCkycdetail;
	}

	public List<ClientTransactAOFDetail> getClientTransactAofdetails() {
		return this.clientTransactAofdetails;
	}

	public void setClientTransactAofdetails(List<ClientTransactAOFDetail> clientTransactAofdetails) {
		this.clientTransactAofdetails = clientTransactAofdetails;
	}

	public ClientTransactAOFDetail addClientTransactAofdetail(ClientTransactAOFDetail clientTransactAofdetail) {
		getClientTransactAofdetails().add(clientTransactAofdetail);
		clientTransactAofdetail.setAdvisorUser(this);

		return clientTransactAofdetail;
	}

	public ClientTransactAOFDetail removeClientTransactAofdetail(ClientTransactAOFDetail clientTransactAofdetail) {
		getClientTransactAofdetails().remove(clientTransactAofdetail);
		clientTransactAofdetail.setAdvisorUser(null);

		return clientTransactAofdetail;
	}

	public List<ClientTransactMandateDetail> getClientTransactMandateDetails() {
		return this.clientTransactMandateDetails;
	}

	public void setClientTransactMandateDetails(List<ClientTransactMandateDetail> clientTransactMandateDetails) {
		this.clientTransactMandateDetails = clientTransactMandateDetails;
	}

	public ClientTransactMandateDetail addClientTransactMandateDetail(
			ClientTransactMandateDetail clientTransactMandateDetail) {
		getClientTransactMandateDetails().add(clientTransactMandateDetail);
		clientTransactMandateDetail.setAdvisorUser(this);

		return clientTransactMandateDetail;
	}

	public ClientTransactMandateDetail removeClientTransactMandateDetail(
			ClientTransactMandateDetail clientTransactMandateDetail) {
		getClientTransactMandateDetails().remove(clientTransactMandateDetail);
		clientTransactMandateDetail.setAdvisorUser(null);

		return clientTransactMandateDetail;
	}

	public List<ClientSwitchOrderEntryParam> getClientSwitchOrderEntryParams() {
		return this.clientSwitchOrderEntryParams;
	}

	public void setClientSwitchOrderEntryParams(List<ClientSwitchOrderEntryParam> clientSwitchOrderEntryParams) {
		this.clientSwitchOrderEntryParams = clientSwitchOrderEntryParams;
	}

	public ClientSwitchOrderEntryParam addClientSwitchOrderEntryParam(
			ClientSwitchOrderEntryParam clientSwitchOrderEntryParam) {
		getClientSwitchOrderEntryParams().add(clientSwitchOrderEntryParam);
		clientSwitchOrderEntryParam.setAdvisorUser(this);

		return clientSwitchOrderEntryParam;
	}

	public ClientSwitchOrderEntryParam removeClientSwitchOrderEntryParam(
			ClientSwitchOrderEntryParam clientSwitchOrderEntryParam) {
		getClientSwitchOrderEntryParams().remove(clientSwitchOrderEntryParam);
		clientSwitchOrderEntryParam.setAdvisorUser(null);

		return clientSwitchOrderEntryParam;
	}

	public List<ClientTransactRedeemOrder> getClientTransactRedeemOrders() {
		return this.clientTransactRedeemOrders;
	}

	public void setClientTransactRedeemOrders(List<ClientTransactRedeemOrder> clientTransactRedeemOrders) {
		this.clientTransactRedeemOrders = clientTransactRedeemOrders;
	}

	public ClientTransactRedeemOrder addClientTransactRedeemOrder(ClientTransactRedeemOrder clientTransactRedeemOrder) {
		getClientTransactRedeemOrders().add(clientTransactRedeemOrder);
		clientTransactRedeemOrder.setAdvisorUser(this);

		return clientTransactRedeemOrder;
	}

	public ClientTransactRedeemOrder removeClientTransactRedeemOrder(
			ClientTransactRedeemOrder clientTransactRedeemOrder) {
		getClientTransactRedeemOrders().remove(clientTransactRedeemOrder);
		clientTransactRedeemOrder.setAdvisorUser(null);

		return clientTransactRedeemOrder;
	}

	public LookupTransactBSEAccessMode getLookupTransactBseaccessMode() {
		return this.lookupTransactBseaccessMode;
	}

	public void setLookupTransactBseaccessMode(LookupTransactBSEAccessMode lookupTransactBseaccessMode) {
		this.lookupTransactBseaccessMode = lookupTransactBseaccessMode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getBseUsername() {
		return bseUsername;
	}

	public void setBseUsername(String bseUsername) {
		this.bseUsername = bseUsername;
	}

	public byte[] getBsePassword() {
		return bsePassword;
	}

	public void setBsePassword(byte[] bsePassword) {
		this.bsePassword = bsePassword;
	}

	public String getBseMemberId() {
		return bseMemberId;
	}

	public void setBseMemberId(String bseMemberId) {
		this.bseMemberId = bseMemberId;
	}
	
	public List<BranchMasterDetailsBO> getBranchMasterDetailsBos() {
		return this.branchMasterDetailsBos;
	}

	public void setBranchMasterDetailsBos(List<BranchMasterDetailsBO> branchMasterDetailsBos) {
		this.branchMasterDetailsBos = branchMasterDetailsBos;
	}

	public BranchMasterDetailsBO addBranchMasterDetailsBo(BranchMasterDetailsBO branchMasterDetailsBo) {
		getBranchMasterDetailsBos().add(branchMasterDetailsBo);
		branchMasterDetailsBo.setAdvisorUser(this);

		return branchMasterDetailsBo;
	}

	public BranchMasterDetailsBO removeBranchMasterDetailsBo(BranchMasterDetailsBO branchMasterDetailsBo) {
		getBranchMasterDetailsBos().remove(branchMasterDetailsBo);
		branchMasterDetailsBo.setAdvisorUser(null);

		return branchMasterDetailsBo;
	}

	public String getLoggedInFlag() {
		return loggedInFlag;
	}

	public void setLoggedInFlag(String loggedInFlag) {
		this.loggedInFlag = loggedInFlag;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public List<BackOfficeUploadHistory> getBackOfficeUploadHistories() {
		return this.backOfficeUploadHistories;
	}

	public void setBackOfficeUploadHistories(List<BackOfficeUploadHistory> backOfficeUploadHistories) {
		this.backOfficeUploadHistories = backOfficeUploadHistories;
	}

	public BackOfficeUploadHistory addBackOfficeUploadHistory(BackOfficeUploadHistory backOfficeUploadHistory) {
		getBackOfficeUploadHistories().add(backOfficeUploadHistory);
		backOfficeUploadHistory.setAdvisorUser(this);

		return backOfficeUploadHistory;
	}

	public BackOfficeUploadHistory removeBackOfficeUploadHistory(BackOfficeUploadHistory backOfficeUploadHistory) {
		getBackOfficeUploadHistories().remove(backOfficeUploadHistory);
		backOfficeUploadHistory.setAdvisorUser(null);

		return backOfficeUploadHistory;
	}

	public List<ClientARNMapping> getClientArnmappings() {
		return this.clientArnmappings;
	}

	public void setClientArnmappings(List<ClientARNMapping> clientArnmappings) {
		this.clientArnmappings = clientArnmappings;
	}

	public ClientARNMapping addClientArnmapping(ClientARNMapping clientArnmapping) {
		getClientArnmappings().add(clientArnmapping);
		clientArnmapping.setAdvisorUser(this);

		return clientArnmapping;
	}

	public ClientARNMapping removeClientArnmapping(ClientARNMapping clientArnmapping) {
		getClientArnmappings().remove(clientArnmapping);
		clientArnmapping.setAdvisorUser(null);

		return clientArnmapping;
	}

	
}