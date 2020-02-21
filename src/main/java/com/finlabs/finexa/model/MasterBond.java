package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the masterBond database table.
 * 
 */
@Entity
@Table(name = "masterBond")
@NamedQuery(name = "MasterBond.findAll", query = "SELECT m FROM MasterBond m")
public class MasterBond implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String securityName;

	private String averageMaturity;

	private BigDecimal couponRate;

	private BigDecimal currentYield;

	@Temporal(TemporalType.DATE)
	private Date dateOfMaturity;

	private String duration;

	private String issuerName;

	private String rating;

	private String securityCode;

	public MasterBond() {
	}

	public String getSecurityName() {
		return this.securityName;
	}

	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}

	public String getAverageMaturity() {
		return this.averageMaturity;
	}

	public void setAverageMaturity(String averageMaturity) {
		this.averageMaturity = averageMaturity;
	}

	public BigDecimal getCouponRate() {
		return this.couponRate;
	}

	public void setCouponRate(BigDecimal couponRate) {
		this.couponRate = couponRate;
	}

	public BigDecimal getCurrentYield() {
		return this.currentYield;
	}

	public void setCurrentYield(BigDecimal currentYield) {
		this.currentYield = currentYield;
	}

	public Date getDateOfMaturity() {
		return this.dateOfMaturity;
	}

	public void setDateOfMaturity(Date dateOfMaturity) {
		this.dateOfMaturity = dateOfMaturity;
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getIssuerName() {
		return this.issuerName;
	}

	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSecurityCode() {
		return this.securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

}