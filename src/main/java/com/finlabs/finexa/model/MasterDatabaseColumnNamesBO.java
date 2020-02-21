package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the masterDatabaseColumnNamesBO database table.
 * 
 */
@Entity
@Table(name="masterDatabaseColumnNamesBO")
@NamedQuery(name="MasterDatabaseColumnNamesBO.findAll", query="SELECT m FROM MasterDatabaseColumnNamesBO m")
public class MasterDatabaseColumnNamesBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String columnName;

	//bi-directional many-to-one association to LookupRTAMasterFileDetailsBO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="feedTypeID")
	private LookupRTAMasterFileDetailsBO lookupRtamasterFileDetailsBo;

	//bi-directional many-to-one association to MasterFeedColumnNamesBO
	@OneToMany(mappedBy="masterDatabaseColumnNamesBo")
	private List<MasterFeedColumnNamesBO> masterFeedColumnNamesBos;

	public MasterDatabaseColumnNamesBO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public LookupRTAMasterFileDetailsBO getLookupRtamasterFileDetailsBo() {
		return this.lookupRtamasterFileDetailsBo;
	}

	public void setLookupRtamasterFileDetailsBo(LookupRTAMasterFileDetailsBO lookupRtamasterFileDetailsBo) {
		this.lookupRtamasterFileDetailsBo = lookupRtamasterFileDetailsBo;
	}

	public List<MasterFeedColumnNamesBO> getMasterFeedColumnNamesBos() {
		return this.masterFeedColumnNamesBos;
	}

	public void setMasterFeedColumnNamesBos(List<MasterFeedColumnNamesBO> masterFeedColumnNamesBos) {
		this.masterFeedColumnNamesBos = masterFeedColumnNamesBos;
	}

	public MasterFeedColumnNamesBO addMasterFeedColumnNamesBo(MasterFeedColumnNamesBO masterFeedColumnNamesBo) {
		getMasterFeedColumnNamesBos().add(masterFeedColumnNamesBo);
		masterFeedColumnNamesBo.setMasterDatabaseColumnNamesBo(this);

		return masterFeedColumnNamesBo;
	}

	public MasterFeedColumnNamesBO removeMasterFeedColumnNamesBo(MasterFeedColumnNamesBO masterFeedColumnNamesBo) {
		getMasterFeedColumnNamesBos().remove(masterFeedColumnNamesBo);
		masterFeedColumnNamesBo.setMasterDatabaseColumnNamesBo(null);

		return masterFeedColumnNamesBo;
	}

}