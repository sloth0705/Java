package com.shop.db;

public class SQL {
	// customer
	public static final String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custId` = ?";
	public static final String INSERT_CUSTOMER = "INSERT INTO `Customer` VALUES(?, ?, ?, ?, now())";

	// order
	public static final String SELECT_ORDERS = "SELECT a.*, "
												+ "b.name, "
												+ "c.prodName "
												+ "FROM `Order` AS a "
												+ "JOIN `Customer` AS b ON a.`orderId` = b.`custId` "
												+ "JOIN `Product` AS c ON a.`orderProduct` = c.`prodNo` "
												+ "WHERE a.`orderId` = ?";
	public static final String INSERT_ORDER = "INSERT INTO `Order` (`orderId`, `orderProduct`, `orderCount`, `orderDate`) VALUES (?, ?, ?, now())";
	
	// product
	public static final String SELECT_PRODUCT = "SELECT * FROM `Product` WHERE `prodNo` = ?";
	public static final String SELECT_PRODUCTS = "SELECT * FROM `Product` WHERE `stock` > 0";
	public static final String UPDATE_PRODUCT_STOCK = "UPDATE `Product` SET `stock` = `stock` - ? WHERE `prodNo` = ?";
}