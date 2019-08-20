package com.walmart.rebates.entities;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name = "\"AgreementTiers\"")
@IdClass(AgrTiersKeys.class)
public class AgreementTiers implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "\"AgreementNum\"")
	private int agrNum;

	@Id
	@Column(name = "\"TierSequence\"")
	private Integer tierSequence;

	@Column(name = "\"TierFrom\"")
	private float tierFrom;

	@Column(name = "\"TierTo\"")
	private float tierTo;

	@Column(name = "\"TierRate\"")
	private String tierRate;

	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "\"AgreementNum\"" , referencedColumnName = "\"AgreementNum\"", insertable = false, updatable = false)
	private AgreementHeader agrHeader;

	

	public int getAgrNum() {
		return agrNum;
	}

	public void setAgrNum(int agrNum) {
		this.agrNum = agrNum;
	}

	public Integer getTierSequence() {
	return tierSequence;
	}

	public void setTierSequence(Integer tierSequence) {
	this.tierSequence = tierSequence;
	}

	public float getTierFrom() {
	return tierFrom;
	}

	public void setTierFrom(float tierFrom) {
	this.tierFrom = tierFrom;
	}

	public float getTierTo() {
	return tierTo;
	}

	public void setTierTo(float tierTo) {
	this.tierTo = tierTo;
	}

	public String getTierRate() {
	return tierRate;
	}

	public void setTierRate(String tierRate) {
	this.tierRate = tierRate;
	}

	public AgreementHeader getAgrHeader() {
	return agrHeader;
	}

	public void setAgrHeader(AgreementHeader agrHeader) {
	this.agrHeader = agrHeader;
	}
}