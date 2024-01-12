package com.example.demo.entity;

public class Laptop {
	String srNo;
	String brand;
	int cost;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String srNo, String brand, int cost) {
		super();
		this.srNo = srNo;
		this.brand = brand;
		this.cost = cost;
	}
	public String getSrNo() {
		return srNo;
	}
	public void setSrNo(String srNo) {
		this.srNo = srNo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop [srNo=" + srNo + ", brand=" + brand + ", cost=" + cost + "]";
	}

}
