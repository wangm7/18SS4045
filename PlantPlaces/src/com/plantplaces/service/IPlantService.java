package com.plantplaces.service;

import java.util.List;

import com.plantplaces.dto.Plant;

public interface IPlantService {


	public List<Plant> filterPlants(String filter);
}
