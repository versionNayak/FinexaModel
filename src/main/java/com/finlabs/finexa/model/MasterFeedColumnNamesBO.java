package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the masterFeedColumnNamesBO database table.
 * 
 */
@Entity
@Table(name="masterFeedColumnNamesBO")
@NamedQuery(name="MasterFeedColumnNamesBO.findAll", query="SELECT m FROM MasterFeedColumnNamesBO m")
public class MasterFeedColumnNamesBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String feedFileColumnName;

	//bi-directional many-to-one association to LookupRTAMasterFileDetailsBO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="feedTypeID")
	private LookupRTAMasterFileDetailsBO lookupRtamasterFileDetailsBo;

	//bi-directional many-to-one association to MasterDatabaseColumnNamesBO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="databaseColumnID")
	private MasterDatabaseColumnNamesBO masterDatabaseColumnNamesBo;

	public MasterFeedColumnNamesBO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFeedFileColumnName() {
		return this.feedFileColumnName;
	}

	public void setFeedFileColumnName(String feedFileColumnName) {
		this.feedFileColumnName = feedFileColumnName;
	}

	public LookupRTAMasterFileDetailsBO getLookupRtamasterFileDetailsBo() {
		return this.lookupRtamasterFileDetailsBo;
	}

	public void setLookupRtamasterFileDetailsBo(LookupRTAMasterFileDetailsBO lookupRtamasterFileDetailsBo) {
		this.lookupRtamasterFileDetailsBo = lookupRtamasterFileDetailsBo;
	}

	public MasterDatabaseColumnNamesBO getMasterDatabaseColumnNamesBo() {
		return this.masterDatabaseColumnNamesBo;
	}

	public void setMasterDatabaseColumnNamesBo(MasterDatabaseColumnNamesBO masterDatabaseColumnNamesBo) {
		this.masterDatabaseColumnNamesBo = masterDatabaseColumnNamesBo;
	}

}