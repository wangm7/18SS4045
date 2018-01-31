package com.plantplaces.ui;

import com.plantplaces.dto.Plant;

import java.awt.List;
import java.util.ArrayList;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;


import org.springframework.context.annotation.Scope;



@Named
@ManagedBean
@Scope("session")

public class searchPlants {
	@Inject
	private Plant plant;
	
	public Plant getPlant() { 
		return plant; 
	}  
	
	public void setPlant(Plant plant) { 
		this.plant = plant;  		 
	} 

		
	public String execute() {
		if (plant != null && plant.getName().equalsIgnoreCase("ross")) {
			return "search";
			
		}else {
			return "noresults";
			}
	}
	/*
	public List<Plant> completPlants(String query){
		ArrayList<Plant> allPlants = new ArrayList<Plant>();
		Plant ross = new Plant();
		ross.setName("Eastern Ross");
		addPlants.add(ross);
	}
*/

}
