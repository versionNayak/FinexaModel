package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the clientCKYCDetails database table.
 * 
 */
@Entity
@Table(name="clientCKYCDetails")
@NamedQuery(name="ClientCKYCDetail.findAll", query="SELECT c FROM ClientCKYCDetail c")
public class ClientCKYCDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private String bseResponse;

	private String bseResponseCode;

	private BigInteger ckycGuardian;

	private BigInteger ckycNumberFirst;

	private BigInteger ckycNumberSecond;

	private BigInteger ckycNumberThird;

	private String clientCode;

	private String clientPan;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	@Temporal(TemporalType.DATE)
	private Date guardianDOB;

	@Temporal(TemporalType.DATE)
	private Date jointHolderDOB1;

	@Temporal(TemporalType.DATE)
	private Date jointHolderDOB2;

	private Timestamp lastUpdatedOn;

	private String saveMode;

	//bi-directional many-to-one association to LookupTransactKYCType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="kycTypeFirst")
	private LookupTransactKYCType lookupTransactKyctype1;

	//bi-directional many-to-one association to LookupTransactKYCType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="kycTypeSecond")
	private LookupTransactKYCType lookupTransactKyctype2;

	//bi-directional many-to-one association to LookupTransactKYCType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="kycTypeThird")
	private LookupTransactKYCType lookupTransactKyctype3;

	//bi-directional many-to-one association to LookupTransactKYCType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="kycTypeGuardian")
	private LookupTransactKYCType lookupTransactKyctype4;

	//bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="advisorId")
	private AdvisorUser advisorUser;

	//bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientId")
	private ClientMaster clientMaster;

	public ClientCKYCDetail() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBseResponse() {
		return this.bseResponse;
	}

	public void setBseResponse(String bseResponse) {
		this.bseResponse = bseResponse;
	}

	public String getBseResponseCode() {
		return this.bseResponseCode;
	}

	public void setBseResponseCode(String bseResponseCode) {
		this.bseResponseCode = bseResponseCode;
	}

	public BigInteger getCkycGuardian() {
		return this.ckycGuardian;
	}

	public void setCkycGuardian(BigInteger ckycGuardian) {
		this.ckycGuardian = ckycGuardian;
	}

	public BigInteger getCkycNumberFirst() {
		return this.ckycNumberFirst;
	}

	public void setCkycNumberFirst(BigInteger ckycNumberFirst) {
		this.ckycNumberFirst = ckycNumberFirst;
	}

	public BigInteger getCkycNumberSecond() {
		return this.ckycNumberSecond;
	}

	public void setCkycNumberSecond(BigInteger ckycNumberSecond) {
		this.ckycNumberSecond = ckycNumberSecond;
	}

	public BigInteger getCkycNumberThird() {
		return this.ckycNumberThird;
	}

	public void setCkycNumberThird(BigInteger ckycNumberThird) {
		this.ckycNumberThird = ckycNumberThird;
	}

	public String getClientCode() {
		return this.clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public String getClientPan() {
		return this.clientPan;
	}

	public void setClientPan(String clientPan) {
		this.clientPan = clientPan;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getGuardianDOB() {
		return this.guardianDOB;
	}

	public void setGuardianDOB(Date guardianDOB) {
		this.guardianDOB = guardianDOB;
	}

	public Date getJointHolderDOB1() {
		return this.jointHolderDOB1;
	}

	public void setJointHolderDOB1(Date jointHolderDOB1) {
		this.jointHolderDOB1 = jointHolderDOB1;
	}

	public Date getJointHolderDOB2() {
		return this.jointHolderDOB2;
	}

	public void setJointHolderDOB2(Date jointHolderDOB2) {
		this.jointHolderDOB2 = jointHolderDOB2;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public String getSaveMode() {
		return this.saveMode;
	}

	public void setSaveMode(String saveMode) {
		this.saveMode = saveMode;
	}

	public LookupTransactKYCType getLookupTransactKyctype1() {
		return this.lookupTransactKyctype1;
	}

	public void setLookupTransactKyctype1(LookupTransactKYCType lookupTransactKyctype1) {
		this.lookupTransactKyctype1 = lookupTransactKyctype1;
	}

	public LookupTransactKYCType getLookupTransactKyctype2() {
		return this.lookupTransactKyctype2;
	}

	public void setLookupTransactKyctype2(LookupTransactKYCType lookupTransactKyctype2) {
		this.lookupTransactKyctype2 = lookupTransactKyctype2;
	}

	public LookupTransactKYCType getLookupTransactKyctype3() {
		return this.lookupTransactKyctype3;
	}

	public void setLookupTransactKyctype3(LookupTransactKYCType lookupTransactKyctype3) {
		this.lookupTransactKyctype3 = lookupTransactKyctype3;
	}

	public LookupTransactKYCType getLookupTransactKyctype4() {
		return this.lookupTransactKyctype4;
	}

	public void setLookupTransactKyctype4(LookupTransactKYCType lookupTransactKyctype4) {
		this.lookupTransactKyctype4 = lookupTransactKyctype4;
	}

	public AdvisorUser getAdvisorUser() {
		return this.advisorUser;
	}

	public void setAdvisorUser(AdvisorUser advisorUser) {
		this.advisorUser = advisorUser;
	}

	public ClientMaster getClientMaster() {
		return this.clientMaster;
	}

	public void setClientMaster(ClientMaster clientMaster) {
		this.clientMaster = clientMaster;
	}

}