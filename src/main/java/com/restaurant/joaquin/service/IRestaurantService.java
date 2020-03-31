package com.restaurant.joaquin.service;

import java.util.List;
import java.util.Optional;

import com.restaurant.joaquin.model.Restaurant;

public interface IRestaurantService {

	  List<Restaurant> listRestaurant();

	  Restaurant createRestaurant(Restaurant res);

	  Optional<Restaurant> findRestaurant(Integer id);

	  void updateRestaurant(Restaurant res, Integer id);

	  void deleteRestaurant(Integer id);
	
}
