package com.java8.learn.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Vishal.Zanzrukia
 *
 */
public abstract class Person extends BaseEntiry {

	private String name;

	private Address parmenantAddress;

	private Address currentAddress;

	private Set<String> mobileNo;

	private String emailId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getParmenantAddress() {
		return parmenantAddress;
	}

	public void setParmenantAddress(Address parmenantAddress) {
		this.parmenantAddress = parmenantAddress;
	}

	public Address getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Set<String> getMobileNo() {
		return mobileNo;
	}

	public void addMobileNo(String mobileNo) {
		if (this.mobileNo == null) {
			this.mobileNo = new HashSet<>();
		}
		this.mobileNo.add(mobileNo);
	}

}
