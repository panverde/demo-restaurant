package com.restaurant.joaquin.dto.response;

import java.util.List;

public class RestaurantResponse {
	
	private String name;
	private String description;
	private String openingTime;
	private String closingTime;
	private String imageUrl;
	List<TableTypeResponse> tableTypes;
	
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
	public List<TableTypeResponse> getTableTypes() {
		return tableTypes;
	}
	public void setTableTypes(List<TableTypeResponse> tableTypes) {
		this.tableTypes = tableTypes;
	}
	
	

}
