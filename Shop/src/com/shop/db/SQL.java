package com.shop.db;

public class SQL {
	// customer
	public static final String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custId` = ?";
	public static final String INSERT_CUSTOMER = "INSERT INTO `Customer` VALUES(?, ?, ?, ?, now())";

	// order

	// product
}