package com.walmart.rebates.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "\"AgreementStores\"")
public class AgreementStores implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "\"AgreementNum\"")
	private int agrnum;
	
	@Column(name = "\"StoreID\"")
	private int storeID;
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "\"AgreementNum\"" , referencedColumnName = "\"AgreementNum\"", insertable = false, updatable = false)
	private AgreementHeader agrHeader ;
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "\"StoreID\"" , referencedColumnName = "\"StoreID\"", insertable = false, updatable = false)
	private StoreMaster storemas ;
	public AgreementHeader getAgrHeader() {
		return agrHeader;
	}

	public void setAgrHeader(AgreementHeader agrHeader) {
		this.agrHeader = agrHeader;
	}

	

	public int getAgrnum() {
		return agrnum;
	}

	public void setAgrnum(int agrnum) {
		this.agrnum = agrnum;
	}

	public int getStoreID() {
		return storeID;
	}

	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}

	public StoreMaster getStoremas() {
		return storemas;
	}

	public void setStoremas(StoreMaster storemas) {
		this.storemas = storemas;
	}
	
}
