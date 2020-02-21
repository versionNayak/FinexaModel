package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the masterMFRatio database table.
 * 
 */
@Entity
@Table(name = "masterMFRatio")
@NamedQuery(name = "MasterMFRatio.findAll", query = "SELECT m FROM MasterMFRatio m")
public class MasterMFRatio implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MasterMFRatioPK id;

	@Column(name = "avg_x")
	private Float avgX;

	@Column(name = "avg_y")
	private Float avgY;

	@Column(name = "beta_x")
	private Float betaX;

	@Column(name = "beta_y")
	private Float betaY;

	@Column(name = "betacor_x")
	private Float betacorX;

	@Column(name = "betacor_y")
	private Float betacorY;

	@Column(name = "corelation_x")
	private Float corelationX;

	@Column(name = "corelation_y")
	private Float corelationY;

	@Temporal(TemporalType.DATE)
	private Date datefrom;

	@Temporal(TemporalType.DATE)
	private Date dateto;

	@Column(name = "fama_x")
	private Float famaX;

	@Column(name = "fama_y")
	private Float famaY;

	@Column(name = "jalpha_x")
	private Float jalphaX;

	@Column(name = "jalpha_y")
	private Float jalphaY;

	private Integer schemeCode;

	@Column(name = "sd_x")
	private Float sdX;

	@Column(name = "sd_y")
	private Float sdY;

	@Column(name = "semisd_x")
	private Float semisdX;

	@Column(name = "semisd_y")
	private Float semisdY;

	@Column(name = "sharpe_x")
	private Float sharpeX;

	@Column(name = "sharpe_y")
	private Float sharpeY;

	@Column(name = "sortino_x")
	private Float sortinoX;

	@Column(name = "sortino_y")
	private Float sortinoY;

	@Column(name = "treynor_x")
	private Float treynorX;

	@Column(name = "treynor_y")
	private Float treynorY;

	public MasterMFRatio() {
	}

	public MasterMFRatioPK getId() {
		return this.id;
	}

	public void setId(MasterMFRatioPK id) {
		this.id = id;
	}

	public Float getAvgX() {
		return avgX;
	}

	public void setAvgX(Float avgX) {
		this.avgX = avgX;
	}

	public Float getAvgY() {
		return avgY;
	}

	public void setAvgY(Float avgY) {
		this.avgY = avgY;
	}

	public Float getBetaX() {
		return betaX;
	}

	public void setBetaX(Float betaX) {
		this.betaX = betaX;
	}

	public Float getBetaY() {
		return betaY;
	}

	public void setBetaY(Float betaY) {
		this.betaY = betaY;
	}

	public Float getBetacorX() {
		return betacorX;
	}

	public void setBetacorX(Float betacorX) {
		this.betacorX = betacorX;
	}

	public Float getBetacorY() {
		return betacorY;
	}

	public void setBetacorY(Float betacorY) {
		this.betacorY = betacorY;
	}

	public Float getCorelationX() {
		return corelationX;
	}

	public void setCorelationX(Float corelationX) {
		this.corelationX = corelationX;
	}

	public Float getCorelationY() {
		return corelationY;
	}

	public void setCorelationY(Float corelationY) {
		this.corelationY = corelationY;
	}

	public Date getDatefrom() {
		return datefrom;
	}

	public void setDatefrom(Date datefrom) {
		this.datefrom = datefrom;
	}

	public Date getDateto() {
		return dateto;
	}

	public void setDateto(Date dateto) {
		this.dateto = dateto;
	}

	public Float getFamaX() {
		return famaX;
	}

	public void setFamaX(Float famaX) {
		this.famaX = famaX;
	}

	public Float getFamaY() {
		return famaY;
	}

	public void setFamaY(Float famaY) {
		this.famaY = famaY;
	}

	public Float getJalphaX() {
		return jalphaX;
	}

	public void setJalphaX(Float jalphaX) {
		this.jalphaX = jalphaX;
	}

	public Float getJalphaY() {
		return jalphaY;
	}

	public void setJalphaY(Float jalphaY) {
		this.jalphaY = jalphaY;
	}

	public Integer getSchemeCode() {
		return schemeCode;
	}

	public void setSchemeCode(Integer schemeCode) {
		this.schemeCode = schemeCode;
	}

	public Float getSdX() {
		return sdX;
	}

	public void setSdX(Float sdX) {
		this.sdX = sdX;
	}

	public Float getSdY() {
		return sdY;
	}

	public void setSdY(Float sdY) {
		this.sdY = sdY;
	}

	public Float getSemisdX() {
		return semisdX;
	}

	public void setSemisdX(Float semisdX) {
		this.semisdX = semisdX;
	}

	public Float getSemisdY() {
		return semisdY;
	}

	public void setSemisdY(Float semisdY) {
		this.semisdY = semisdY;
	}

	public Float getSharpeX() {
		return sharpeX;
	}

	public void setSharpeX(Float sharpeX) {
		this.sharpeX = sharpeX;
	}

	public Float getSharpeY() {
		return sharpeY;
	}

	public void setSharpeY(Float sharpeY) {
		this.sharpeY = sharpeY;
	}

	public Float getSortinoX() {
		return sortinoX;
	}

	public void setSortinoX(Float sortinoX) {
		this.sortinoX = sortinoX;
	}

	public Float getSortinoY() {
		return sortinoY;
	}

	public void setSortinoY(Float sortinoY) {
		this.sortinoY = sortinoY;
	}

	public Float getTreynorX() {
		return treynorX;
	}

	public void setTreynorX(Float treynorX) {
		this.treynorX = treynorX;
	}

	public Float getTreynorY() {
		return treynorY;
	}

	public void setTreynorY(Float treynorY) {
		this.treynorY = treynorY;
	}

}