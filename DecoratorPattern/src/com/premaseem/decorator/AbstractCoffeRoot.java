package com.premaseem.decorator;


// this is for merge 1 

// this is change 1


public abstract class AbstractCoffeRoot {

	String description = " Coffee root ";
	String name = "undefined ";

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

	public abstract Double getCost(); 
}
// sirni is makes some chages here 
