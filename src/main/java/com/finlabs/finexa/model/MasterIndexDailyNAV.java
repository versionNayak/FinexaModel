package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the masterIndexDailyNAV database table.
 * 
 */
@Entity
@Table(name = "masterIndexDailyNAV")
@NamedQuery(name = "MasterIndexDailyNAV.findAll", query = "SELECT m FROM MasterIndexDailyNAV m")
public class MasterIndexDailyNAV implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MasterIndexDailyNAVPK id;

	@Column(name = "NAV")
	private BigDecimal nav;

	public MasterIndexDailyNAV() {
	}

	public MasterIndexDailyNAVPK getId() {
		return this.id;
	}

	public void setId(MasterIndexDailyNAVPK id) {
		this.id = id;
	}

	public BigDecimal getNav() {
		return this.nav;
	}

	public void setNav(BigDecimal nav) {
		this.nav = nav;
	}

}