package com.java8.learn.domain;

/**
 * @author Vishal.Zanzrukia
 *
 */
public class Subject extends BaseEntiry {

	private String name;

	private String description;
	
	public Subject(){
		
	}
	
	public Subject(Integer id, String name){
		super(id);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
