package com.restaurant.joaquin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TableTypes")
public class TableTypes {

	@Id
	@Column(name = "id_mesa")
	private Integer id_mesa;
	private String name;
	private Integer id_restaurant;



	public Integer getId_mesa() {
		return id_mesa;
	}

	public void setId_mesa(Integer id_mesa) {
		this.id_mesa = id_mesa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId_restaurant() {
		return id_restaurant;
	}

	public void setId_restaurant(Integer id_restaurant) {
		this.id_restaurant = id_restaurant;
	}

	
}
