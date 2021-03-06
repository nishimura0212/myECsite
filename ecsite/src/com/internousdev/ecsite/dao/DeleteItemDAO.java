package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.DeleteItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class DeleteItemDAO {
	public ArrayList<DeleteItemDTO> getDeleteItemInfo(String deleteItemId) throws SQLException {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<DeleteItemDTO> deleteItemDTO = new ArrayList<DeleteItemDTO>();

		String sql = "SELECT ubit.id, iit.item_name, iit.item_image, ubit.total_price, ubit.total_count, ubit.pay, ubit.insert_date FROM user_buy_item_transaction ubit LEFT JOIN item_info_transaction iit ON ubit.item_transaction_id = iit.id WHERE ubit.id = ? ORDER BY insert_date DESC";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, deleteItemId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				DeleteItemDTO dto = new DeleteItemDTO();
				dto.setId(rs.getString("id"));
				dto.setItemImage(rs.getString("item_image"));
				dto.setItem(rs.getString("item_name"));
				dto.setTotalPrice(rs.getString("total_price"));
				dto.setTotalCount(rs.getString("total_count"));
				dto.setPayment(rs.getString("pay"));
				dto.setInsert_date(rs.getString("insert_date"));
				deleteItemDTO.add(dto);
			}

		} catch (Exception e){
			e.printStackTrace();
		} finally {
			con.close();
		}
		return deleteItemDTO;
	}


	public ArrayList<DeleteItemDTO> getAllDeleteItemInfo(String user_master_id) throws SQLException {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<DeleteItemDTO> deleteItemDTO = new ArrayList<DeleteItemDTO>();

		String sql = "SELECT ubit.id, iit.item_name, iit.item_image, ubit.total_price, ubit.total_count, ubit.pay, ubit.insert_date FROM user_buy_item_transaction ubit LEFT JOIN item_info_transaction iit ON ubit.item_transaction_id = iit.id WHERE ubit.user_master_id = ? ORDER BY insert_date DESC";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_master_id);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				DeleteItemDTO dto = new DeleteItemDTO();
				dto.setId(rs.getString("id"));
				dto.setItemImage(rs.getString("item_image"));
				dto.setItem(rs.getString("item_name"));
				dto.setTotalPrice(rs.getString("total_price"));
				dto.setTotalCount(rs.getString("total_count"));
				dto.setPayment(rs.getString("pay"));
				dto.setInsert_date(rs.getString("insert_date"));
				deleteItemDTO.add(dto);
			}

		} catch (Exception e){
			e.printStackTrace();
		} finally {
			con.close();
		}
		return deleteItemDTO;
	}
}
