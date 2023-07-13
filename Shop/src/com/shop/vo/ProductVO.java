package com.shop.vo;

public class ProductVO {
	private int prodNo;
	private String prdoName;
	private int stock;
	private int price;
	private String company;

	public int getProdNo() {
		return prodNo;
	}

	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}

	public String getPrdoName() {
		return prdoName;
	}

	public void setPrdoName(String prdoName) {
		this.prdoName = prdoName;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}