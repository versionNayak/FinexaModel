package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the lookupRTAFileName database table.
 * 
 */
@Entity
@Table(name="lookupRTAFileName")
@NamedQuery(name="LookupRTAFileName.findAll", query="SELECT l FROM LookupRTAFileName l")
public class LookupRTAFileName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;
	
	//bi-directional many-to-one association to BackOfficeUploadHistory
		@OneToMany(mappedBy="lookupRtafileName")
		private List<BackOfficeUploadHistory> backOfficeUploadHistories;


	//bi-directional many-to-one association to MasterFileMappingBO
	@OneToMany(mappedBy="lookupRtafileName")
	private List<MasterFileMappingBO> masterFileMappingBos;

	public LookupRTAFileName() {
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

	public MasterFileMappingBO addMasterFileMappingBo(MasterFileMappingBO masterFileMappingBo) {
		getMasterFileMappingBos().add(masterFileMappingBo);
		masterFileMappingBo.setLookupRtafileName(this);

		return masterFileMappingBo;
	}

	public MasterFileMappingBO removeMasterFileMappingBo(MasterFileMappingBO masterFileMappingBo) {
		getMasterFileMappingBos().remove(masterFileMappingBo);
		masterFileMappingBo.setLookupRtafileName(null);

		return masterFileMappingBo;
	}
	public List<BackOfficeUploadHistory> getBackOfficeUploadHistories() {
		return this.backOfficeUploadHistories;
	}

	public void setBackOfficeUploadHistories(List<BackOfficeUploadHistory> backOfficeUploadHistories) {
		this.backOfficeUploadHistories = backOfficeUploadHistories;
	}

	public BackOfficeUploadHistory addBackOfficeUploadHistory(BackOfficeUploadHistory backOfficeUploadHistory) {
		getBackOfficeUploadHistories().add(backOfficeUploadHistory);
		backOfficeUploadHistory.setLookupRtafileName(this);

		return backOfficeUploadHistory;
	}

	public BackOfficeUploadHistory removeBackOfficeUploadHistory(BackOfficeUploadHistory backOfficeUploadHistory) {
		getBackOfficeUploadHistories().remove(backOfficeUploadHistory);
		backOfficeUploadHistory.setLookupRtafileName(null);

		return backOfficeUploadHistory;
	}


}