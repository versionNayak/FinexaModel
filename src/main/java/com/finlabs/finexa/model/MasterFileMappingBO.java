package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the masterFileMappingBO database table.
 * 
 */
@Entity
@Table(name="masterFileMappingBO")
@NamedQuery(name="MasterFileMappingBO.findAll", query="SELECT m FROM MasterFileMappingBO m")
public class MasterFileMappingBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String extension;

	//bi-directional many-to-one association to LookupRTABO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="RTAId")
	private LookupRTABO lookupRtabo;

	//bi-directional many-to-one association to LookupRTAMasterFileDetailsBO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="masterId")
	private LookupRTAMasterFileDetailsBO lookupRtamasterFileDetailsBo;

	//bi-directional many-to-one association to LookupRTAFileName
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fileNameId")
	private LookupRTAFileName lookupRtafileName;

	public MasterFileMappingBO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public LookupRTABO getLookupRtabo() {
		return this.lookupRtabo;
	}

	public void setLookupRtabo(LookupRTABO lookupRtabo) {
		this.lookupRtabo = lookupRtabo;
	}

	public LookupRTAMasterFileDetailsBO getLookupRtamasterFileDetailsBo() {
		return this.lookupRtamasterFileDetailsBo;
	}

	public void setLookupRtamasterFileDetailsBo(LookupRTAMasterFileDetailsBO lookupRtamasterFileDetailsBo) {
		this.lookupRtamasterFileDetailsBo = lookupRtamasterFileDetailsBo;
	}

	public LookupRTAFileName getLookupRtafileName() {
		return this.lookupRtafileName;
	}

	public void setLookupRtafileName(LookupRTAFileName lookupRtafileName) {
		this.lookupRtafileName = lookupRtafileName;
	}

}