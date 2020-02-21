package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;


import java.util.List;


/**
 * The persistent class for the lookupRTAMasterFileDetailsBO database table.
 * 
 */
@Entity
@Table(name="lookupRTAMasterFileDetailsBO")
@NamedQuery(name="LookupRTAMasterFileDetailsBO.findAll", query="SELECT l FROM LookupRTAMasterFileDetailsBO l")
public class LookupRTAMasterFileDetailsBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String fileCode;

	private String masterFileName;

	//bi-directional many-to-one association to MasterFileMappingBO
	@OneToMany(mappedBy="lookupRtamasterFileDetailsBo")
	private List<MasterFileMappingBO> masterFileMappingBos;
	
	//bi-directional many-to-one association to MasterDatabaseColumnNamesBO
	@OneToMany(mappedBy="lookupRtamasterFileDetailsBo")
	private List<MasterDatabaseColumnNamesBO> masterDatabaseColumnNamesBos;

	//bi-directional many-to-one association to MasterFeedColumnNamesBO
	@OneToMany(mappedBy="lookupRtamasterFileDetailsBo")
	private List<MasterFeedColumnNamesBO> masterFeedColumnNamesBos;

	public LookupRTAMasterFileDetailsBO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileCode() {
		return this.fileCode;
	}

	public void setFileCode(String fileCode) {
		this.fileCode = fileCode;
	}

	public String getMasterFileName() {
		return this.masterFileName;
	}

	public void setMasterFileName(String masterFileName) {
		this.masterFileName = masterFileName;
	}

	public List<MasterFileMappingBO> getMasterFileMappingBos() {
		return this.masterFileMappingBos;
	}

	public void setMasterFileMappingBos(List<MasterFileMappingBO> masterFileMappingBos) {
		this.masterFileMappingBos = masterFileMappingBos;
	}

	public MasterFileMappingBO addMasterFileMappingBo(MasterFileMappingBO masterFileMappingBo) {
		getMasterFileMappingBos().add(masterFileMappingBo);
		masterFileMappingBo.setLookupRtamasterFileDetailsBo(this);

		return masterFileMappingBo;
	}

	public MasterFileMappingBO removeMasterFileMappingBo(MasterFileMappingBO masterFileMappingBo) {
		getMasterFileMappingBos().remove(masterFileMappingBo);
		masterFileMappingBo.setLookupRtamasterFileDetailsBo(null);

		return masterFileMappingBo;
	}

	public List<MasterDatabaseColumnNamesBO> getMasterDatabaseColumnNamesBos() {
		return this.masterDatabaseColumnNamesBos;
	}

	public void setMasterDatabaseColumnNamesBos(List<MasterDatabaseColumnNamesBO> masterDatabaseColumnNamesBos) {
		this.masterDatabaseColumnNamesBos = masterDatabaseColumnNamesBos;
	}

	public MasterDatabaseColumnNamesBO addMasterDatabaseColumnNamesBo(MasterDatabaseColumnNamesBO masterDatabaseColumnNamesBo) {
		getMasterDatabaseColumnNamesBos().add(masterDatabaseColumnNamesBo);
		masterDatabaseColumnNamesBo.setLookupRtamasterFileDetailsBo(this);

		return masterDatabaseColumnNamesBo;
	}

	public MasterDatabaseColumnNamesBO removeMasterDatabaseColumnNamesBo(MasterDatabaseColumnNamesBO masterDatabaseColumnNamesBo) {
		getMasterDatabaseColumnNamesBos().remove(masterDatabaseColumnNamesBo);
		masterDatabaseColumnNamesBo.setLookupRtamasterFileDetailsBo(null);

		return masterDatabaseColumnNamesBo;
	}

	public List<MasterFeedColumnNamesBO> getMasterFeedColumnNamesBos() {
		return this.masterFeedColumnNamesBos;
	}

	public void setMasterFeedColumnNamesBos(List<MasterFeedColumnNamesBO> masterFeedColumnNamesBos) {
		this.masterFeedColumnNamesBos = masterFeedColumnNamesBos;
	}

	public MasterFeedColumnNamesBO addMasterFeedColumnNamesBo(MasterFeedColumnNamesBO masterFeedColumnNamesBo) {
		getMasterFeedColumnNamesBos().add(masterFeedColumnNamesBo);
		masterFeedColumnNamesBo.setLookupRtamasterFileDetailsBo(this);

		return masterFeedColumnNamesBo;
	}

	public MasterFeedColumnNamesBO removeMasterFeedColumnNamesBo(MasterFeedColumnNamesBO masterFeedColumnNamesBo) {
		getMasterFeedColumnNamesBos().remove(masterFeedColumnNamesBo);
		masterFeedColumnNamesBo.setLookupRtamasterFileDetailsBo(null);

		return masterFeedColumnNamesBo;
	}

}