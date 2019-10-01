package com.example.roomServices.model;

public class roomServiceModel {
	private double cost;
	private String [] services;
	
	public roomServiceModel() {
		super();
		this.cost = 0;
		this.services = null;
	}
	
	public roomServiceModel(double cost, String[] services) {
		super();
		this.cost = cost;
		this.services = services;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String[] getServices() {
		return services;
	}
	public void setServices(String[] services) {
		this.services = services;
	}
	
}
