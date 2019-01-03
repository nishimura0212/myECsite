package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ThrowCartDAO {
	private DateUtil dateUtil = new DateUtil();

	public void cartItemInfo(String item_transaction_id,String user_master_id,String total_price,String total_count) throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "INSERT INTO cart_item_transaction(item_transaction_id,total_price,total_count,user_master_id,insert_date) VALUES(?,?,?,?,?)";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, total_price);
			ps.setString(3, total_count);
			ps.setString(4, user_master_id);
			ps.setString(5, dateUtil.getDate());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}
}
