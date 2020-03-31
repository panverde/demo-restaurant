package com.restaurant.joaquin.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Restaurant")
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "parent_id")
	private Integer restaurantId;
	
	@Column(name = "name", length = 20, nullable = false)
	private String name;
	@Column(name = "description", length = 20, nullable = false)
	private String description;
	@Column(name = "opening_time", length = 20, nullable = false)
	private String openingTime;
	@Column(name = "closing_time", length = 20, nullable = false)
	private String closingTime;
	@Column(name = "image_url", length = 50, nullable = false)
	private String imageUrl;

	@OneToMany(mappedBy = "id_restaurant", fetch = FetchType.EAGER)
	private List<TableTypes> tableTypes;

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

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

	public String getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}

	public String getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(String closingTime) {
		this.closingTime = closingTime;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public List<TableTypes> getTableTypes() {
		return tableTypes;
	}

	public void setTableTypes(List<TableTypes> tableTypes) {
		this.tableTypes = tableTypes;
	}

}
