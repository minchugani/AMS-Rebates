package com.walmart.rebates.entities;

import java.io.Serializable;

public class AgrStoresKeys implements Serializable {
	private int agrnum;
	private int storeID;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agrnum;
		result = prime * result + storeID;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AgrStoresKeys other = (AgrStoresKeys) obj;
		if (agrnum != other.agrnum)
			return false;
		if (storeID != other.storeID)
			return false;
		return true;
	}
	
	
}
