package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the advisorForgotPassword database table.
 * 
 */
@Entity
@Table(name="advisorForgotPassword")
@NamedQuery(name="AdvisorForgotPassword.findAll", query="SELECT a FROM AdvisorForgotPassword a")
public class AdvisorForgotPassword implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	private Double timestamp;

	@Column(name="UUID")
	private String uUID;

	//bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="advisorID")
	private AdvisorUser advisorUser;

	public AdvisorForgotPassword() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Double timestamp) {
		this.timestamp = timestamp;
	}

	public String getUuid() {
		return this.uUID;
	}

	public void setUuid(String uuid) {
		this.uUID = uuid;
	}

	public AdvisorUser getAdvisorUser() {
		return this.advisorUser;
	}

	public void setAdvisorUser(AdvisorUser advisorUser) {
		this.advisorUser = advisorUser;
	}

	public AdvisorForgotPassword findbyUUID(String uuid2) {
		// TODO Auto-generated method stub
		return null;
	}

}