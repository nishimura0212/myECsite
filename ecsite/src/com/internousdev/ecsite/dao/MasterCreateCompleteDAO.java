package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class MasterCreateCompleteDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO login_master_transaction (login_id,login_pass,master_name,insert_date) VALUES(?,?,?,?)";

	public void createMaster(String loginMasterId,String loginMasterPassword,String masterName) throws SQLException {
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginMasterId);
			ps.setString(2, loginMasterPassword);
			ps.setString(3, masterName);
			ps.setString(4, dateUtil.getDate());

			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}
}
