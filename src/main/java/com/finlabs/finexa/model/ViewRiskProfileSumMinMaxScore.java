package com.finlabs.finexa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="viewRiskProfileSumMinMaxScore")
public class ViewRiskProfileSumMinMaxScore {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="advisorID", unique=true, nullable=false)
	private int advisorID;
	
	@Column
	private int totalMinScore;
	@Column
	private int totalMaxScore;
	@Column
	private double scoreInterval;
	public int getAdvisorID() {
		return advisorID;
	}
	public void setAdvisorID(int advisorID) {
		this.advisorID = advisorID;
	}
	public int getTotalMinScore() {
		return totalMinScore;
	}
	public void setTotalMinScore(int totalMinScore) {
		this.totalMinScore = totalMinScore;
	}
	public int getTotalMaxScore() {
		return totalMaxScore;
	}
	public void setTotalMaxScore(int totalMaxScore) {
		this.totalMaxScore = totalMaxScore;
	}
	public double getScoreInterval() {
		return scoreInterval;
	}
	public void setScoreInterval(double scoreInterval) {
		this.scoreInterval = scoreInterval;
	}
	
	
}
