package com.plantplaces.dto;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import org.springframework.context.annotation.Scope;


@Named
@ManagedBean
@Scope("session")

public class Plant {

	private String name;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void addPlant(String name) {
		this.name = name;
	}
	
	public String toSring() {
		return name;
		
	}
}
