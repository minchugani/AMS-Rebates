package com.walmart.rebates.entities;

import java.io.Serializable;

public class AgrTiersKeys implements Serializable{

	private int agrNum;
	private String tierSequence;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agrNum;
		result = prime * result + ((tierSequence == null) ? 0 : tierSequence.hashCode());
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
		AgrTiersKeys other = (AgrTiersKeys) obj;
		if (agrNum != other.agrNum)
			return false;
		if (tierSequence == null) {
			if (other.tierSequence != null)
				return false;
		} else if (!tierSequence.equals(other.tierSequence))
			return false;
		return true;
	}
	
	

}