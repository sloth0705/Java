package com.shop.dao;

import java.util.ArrayList;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.ProductVO;

public class ProductDAO extends DBHelper {
	private static ProductDAO instance = new ProductDAO();

	public static ProductDAO getInstance() {
		return instance;
	}

	private ProductDAO() {

	}

	public int insertProduct(ProductVO vo) {
		return 0;
	}

	public ProductVO selectProduct(int prodNo) {
		ProductVO vo = null;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_PRODUCT);
			psmt.setInt(1, prodNo);
			rs = psmt.executeQuery();
			if (rs.next()) {
				vo = new ProductVO();
				vo.setProdNo(rs.getInt("prodNo"));
				vo.setProdName(rs.getString("prodName"));
				vo.setStock(rs.getInt("stock"));
				vo.setPrice(rs.getInt("price"));
				vo.setCompany(rs.getString("company"));
			}
			close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}

	public List<ProductVO> selectProducts() {
		List<ProductVO> products = new ArrayList<>();
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
			while (rs.next()) {
				ProductVO vo = new ProductVO();
				vo.setProdNo(rs.getInt("prodNo"));
				vo.setProdName(rs.getString("prodName"));
				vo.setStock(rs.getInt("stock"));
				vo.setPrice(rs.getInt("price"));
				vo.setCompany(rs.getString("company"));
				products.add(vo);
			}
			close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	public int updateProduct(ProductVO vo) {
		return 0;
	}

	public void updateProductStock(int prodNo, int count) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_PRODUCT_STOCK);
			psmt.setInt(1, count);
			psmt.setInt(2, prodNo);
			psmt.executeUpdate();
			close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int deleteProduct(int prodNo) {
		return 0;
	}
}