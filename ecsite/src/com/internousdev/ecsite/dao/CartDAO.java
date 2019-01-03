package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.CartDTO;
import com.internousdev.ecsite.util.DBConnector;

public class CartDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	public ArrayList<CartDTO> getCartInfo(String user_master_id) throws SQLException {
		ArrayList<CartDTO> cartDTO = new ArrayList<CartDTO>();
		String sql ="SELECT cit.id, cit.item_transaction_id, iit.item_name, iit.item_stock, iit.item_image, cit.total_price, cit.total_count, cit.insert_date"
				+ " FROM cart_item_transaction as cit"
				+ " LEFT JOIN item_info_transaction as iit"
				+ " ON cit.item_transaction_id = iit.id"
				+ " WHERE cit.user_master_id = ?"
				+ " ORDER BY insert_date DESC";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_master_id);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				CartDTO dto = new CartDTO();
				dto.setId(rs.getInt("id"));
				dto.setItemTransactionId(rs.getInt("item_transaction_id"));
				dto.setItem(rs.getString("item_name"));
				dto.setItemStock(rs.getInt("item_stock"));
				dto.setItemImage(rs.getString("item_image"));
				dto.setTotalPrice(rs.getInt("total_price"));
				dto.setTotalCount(rs.getInt("total_count"));
				dto.setInsert_date(rs.getString("insert_date"));
				cartDTO.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return cartDTO;
	}
}
