package com.walmart.rebates.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "\"AgreementHeader\"")
public class AgreementHeader implements Serializable {
	@Id
// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_generator")
// @SequenceGenerator(name="book_generator", sequenceName = "book_seq", allocationSize=50)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "\"AgreementNum\"")
	private int agrNum;

	@Column(name = "\"AgreementType\"")
	private String agrType;

	@Column(name = "\"ValidFrom\"")
	@Temporal(TemporalType.DATE)
	private Date validFrom;

	@Column(name = "\"ValidTo\"")
	@Temporal(TemporalType.DATE)
	private Date validTo;

	@Column(name = "\"AgreementDesc\"")
	private String agrDesc;

	@Column(name = "\"Country\"")
	private String country;

	@Column(name = "\"SettlPartner\"")
	private String settlPartner;

	@Column(name = "\"SettlCalender\"")
	private String settlCalender;

	@Column(name = "\"SettlCurrency\"")
	private String settlCurrency;

	@Column(name = "\"CalcBasis\"")
	private String calcBasis;

	@Column(name = "\"PaymentTerms\"")
	private String paymentTerms;

	

	public int getAgrNum() {
		return agrNum;
	}

	public void setAgrNum(int agrNum) {
		this.agrNum = agrNum;
	}

	public String getAgrType() {
	return agrType;
	}

	public void setAgrType(String agrType) {
	this.agrType = agrType;
	}

	public Date getValidFrom() {
	return validFrom;
	}

	public void setValidFrom(Date validFrom) {
	this.validFrom = validFrom;
	}

	public Date getValidTo() {
	return validTo;
	}

	public void setValidTo(Date validTo) {
	this.validTo = validTo;
	}


public String getAgrDesc() {
	return agrDesc;
	}

	public void setAgrDesc(String agrDesc) {
	this.agrDesc = agrDesc;
	}

	public String getCountry() {
	return country;
	}

	public void setCountry(String country) {
	this.country = country;
	}

	public String getSettlPartner() {
	return settlPartner;
	}

	public void setSettlPartner(String settlPartner) {
	this.settlPartner = settlPartner;
	}

	public String getSettlCalender() {
	return settlCalender;
	}

	public void setSettlCalender(String settlCalender) {
	this.settlCalender = settlCalender;
	}

	public String getSettlCurrency() {
	return settlCurrency;
	}

	public void setSettlCurrency(String settlCurrency) {
	this.settlCurrency = settlCurrency;
	}

	public String getCalcBasis() {
	return calcBasis;
	}

	public void setCalcBasis(String calcBasis) {
	this.calcBasis = calcBasis;
	}

	public String getPaymentTerms() {
	return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
	this.paymentTerms = paymentTerms;
	}


}