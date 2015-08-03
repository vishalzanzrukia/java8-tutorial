package com.java8.learn.domain;

/**
 * @author Vishal.Zanzrukia
 *
 */
public class Address extends BaseEntiry {

	private String line1;
	private String line2;
	private String pincode;

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
