package com.restaurant.joaquin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.joaquin.model.Restaurant;

public interface IRestaurantRepository extends JpaRepository<Restaurant, Integer>{

}
