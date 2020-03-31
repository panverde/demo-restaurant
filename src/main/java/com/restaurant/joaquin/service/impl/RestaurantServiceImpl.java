package com.restaurant.joaquin.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.joaquin.model.Restaurant;
import com.restaurant.joaquin.repository.IRestaurantRepository;
import com.restaurant.joaquin.service.IRestaurantService;

@Service
public class RestaurantServiceImpl implements IRestaurantService {

	@Autowired
	private IRestaurantRepository repositoryRestaurant;

	@Override
	public List<Restaurant> listRestaurant() {
		// TODO Auto-generated method stub
		return repositoryRestaurant.findAll();
	}

	@Override
	public Restaurant createRestaurant(Restaurant res) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Restaurant> findRestaurant(Integer id) {
		return repositoryRestaurant.findById(id);
	}

	@Override
	public void updateRestaurant(Restaurant res, Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteRestaurant(Integer id) {
		
		repositoryRestaurant.deleteById(id);

	}
	
//	public Optional<RestaurantResponse> findRestaurantId(Integer id){
		
		
	//}
	
	public List<Restaurant> listarRestaurant(){
		
		return null;
	}

}
