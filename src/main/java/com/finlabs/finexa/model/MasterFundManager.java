package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the masterFundManager database table.
 * 
 */
@Entity
@Table(name = "masterFundManager")
@NamedQuery(name = "MasterFundManager.findAll", query = "SELECT m FROM MasterFundManager m")
public class MasterFundManager implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int managerCode;

	@Lob
	private String education;

	@Lob
	private String experience;

	private String managerName;

	// bi-directional many-to-one association to MasterMutualFundETF
	@OneToMany(mappedBy = "masterFundManager")
	private List<MasterMutualFundETF> masterMutualFundEtfs;

	public MasterFundManager() {
	}

	public int getManagerCode() {
		return this.managerCode;
	}

	public void setManagerCode(int managerCode) {
		this.managerCode = managerCode;
	}

	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getExperience() {
		return this.experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getManagerName() {
		return this.managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public List<MasterMutualFundETF> getMasterMutualFundEtfs() {
		return this.masterMutualFundEtfs;
	}

	public void setMasterMutualFundEtfs(List<MasterMutualFundETF> masterMutualFundEtfs) {
		this.masterMutualFundEtfs = masterMutualFundEtfs;
	}

	public MasterMutualFundETF addMasterMutualFundEtf(MasterMutualFundETF masterMutualFundEtf) {
		getMasterMutualFundEtfs().add(masterMutualFundEtf);
		masterMutualFundEtf.setMasterFundManager(this);

		return masterMutualFundEtf;
	}

	public MasterMutualFundETF removeMasterMutualFundEtf(MasterMutualFundETF masterMutualFundEtf) {
		getMasterMutualFundEtfs().remove(masterMutualFundEtf);
		masterMutualFundEtf.setMasterFundManager(null);

		return masterMutualFundEtf;
	}

}