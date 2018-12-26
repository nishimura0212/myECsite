package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.SelectCategoryDTO;
import com.internousdev.ecsite.util.DBConnector;

public class SelectCategoryDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	public ArrayList<SelectCategoryDTO> getCategoryInfo(String itemCategoryName) throws SQLException {
		ArrayList<SelectCategoryDTO> sCDTO = new ArrayList<SelectCategoryDTO>();

		String sql ="SELECT id, item_name, item_price, item_stock, item_image FROM item_info_transaction WHERE item_category = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, itemCategoryName);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				SelectCategoryDTO dto = new SelectCategoryDTO();
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getString("item_price"));
				dto.setItemStock(rs.getInt("item_stock"));
				dto.setItemImage(rs.getString("item_image"));
				sCDTO.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return sCDTO;
	}


}
