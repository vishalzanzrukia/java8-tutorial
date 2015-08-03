package com.java8.learn.domain;

/**
 * @author Vishal.Zanzrukia
 *
 */
public class Standard extends BaseEntiry {

	private Integer standard;

	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStandard() {
		return standard;
	}

	public void setStandard(Integer standard) {
		this.standard = standard;
	}
}
