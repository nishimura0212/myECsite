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
		String sql ="SELECT ubit.id, iit.item_name, iit.item_image, ubit.total_price, ubit.total_count, ubit.insert_date"
				+ " FROM user_buy_item_transaction ubit"
				+ " LEFT JOIN item_info_transaction iit"
				+ " ON ubit.item_transaction_id = iit.id"
				+ " WHERE ubit.user_master_id = ?"
				+ " ORDER BY insert_date DESC";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_master_id);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				CartDTO dto = new CartDTO();
				dto.setId(rs.getString("id"));
				dto.setItemImage(rs.getString("item_image"));
				dto.setItem(rs.getString("item_name"));
				dto.setTotalPrice(rs.getString("total_price"));
				dto.setTotalCount(rs.getString("total_count"));
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
