package com.plantplaces.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.plantplaces.dao.IPlantDAO;
import com.plantplaces.dto.Plant;

@Named

public class PlantService implements IPlantService {
	@Inject
	IPlantDAO plantDAO;
	private List<Plant> allPlants;
	
	@Override
	public List<Plant> filterPlants(String filter) {
		
		if (allPlants == null) {
		
			allPlants = plantDAO.fetchPlants();
		
		}
		
		List<Plant> returnPlants = new ArrayList<Plant>();
		
		for (Plant plant : allPlants) {
			if (plant.toString().contains(filter)) {
				returnPlants.add(plant);
			}
		}
		return returnPlants;
	}

}
