package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ItemCreateCompleteDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private DateUtil dateUtil = new DateUtil();

	public void createItem(String itemCategory,String itemName, int itemPrice, int itemStock, String itemImage) throws SQLException {
		String sql = "INSERT INTO item_info_transaction(item_category,item_name,item_price,item_stock,item_image,insert_date) VALUES(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, itemCategory);
			ps.setString(2, itemName);
			ps.setInt(3, itemPrice);
			ps.setInt(4, itemStock);
			ps.setString(5, itemImage);
			ps.setString(6,dateUtil.getDate());

			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

	}

}
