package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyItemDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private BuyItemDTO buyItemDTO = new BuyItemDTO();

	public BuyItemDTO getBuyItemInfo(String selectItemName) throws SQLException {
		String sql ="SELECT id, item_category, item_name, item_price, item_stock, item_image FROM item_info_transaction WHERE item_name = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, selectItemName);
			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				buyItemDTO.setId(rs.getInt("id"));
				buyItemDTO.setItemCategory(rs.getString("item_category"));
				buyItemDTO.setItemName(rs.getString("item_name"));
				buyItemDTO.setItemPrice(rs.getString("item_price"));
				buyItemDTO.setItemStock(rs.getInt("item_stock"));
				buyItemDTO.setItemImage(rs.getString("item_image"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return buyItemDTO;
	}


}
