package com.restaurant.joaquin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.joaquin.model.Restaurant;
import com.restaurant.joaquin.service.IRestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	private IRestaurantService service;
	

	@GetMapping(value = "/")
	public List<Restaurant> listarRestaurant() {
		return service.listRestaurant();
	}
	
	@GetMapping("/{id}")
	public Optional<Restaurant> buscarRestaurant(@PathVariable("id") Integer id) {
		return service.findRestaurant(id);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteRestaurant(@PathVariable("id") Integer id) {
		service.deleteRestaurant(id);
	}
	
	
	
}
