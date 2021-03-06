package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class BuyItemCompleteDAO {
	private DateUtil dateUtil = new DateUtil();

	public void buyItemInfo(int item_transaction_id, String user_master_id, int total_price, int total_count, String pay) throws SQLException {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "INSERT INTO user_buy_item_transaction(item_transaction_id, total_price, total_count, user_master_id, pay, insert_date) VALUES(?,?,?,?,?,?)";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, item_transaction_id);
			ps.setInt(2, total_price);
			ps.setInt(3, total_count);
			ps.setString(4, user_master_id);
			ps.setString(5, pay);
			ps.setString(6, dateUtil.getDate());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}

	public void deleteCartInfo(int item_transaction_id) throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "Delete From cart_item_transaction WHERE item_transaction_id=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, item_transaction_id);
			ps.executeUpdate();
		} catch (Exception e){
			e.printStackTrace();
		} finally{
			con.close();
		}
	}

	public void updateItemInfo(String name, int stock, int count) throws SQLException {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql ="UPDATE item_info_transaction SET item_stock=? WHERE item_name=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, stock-count);
			ps.setString(2, name);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}
}
