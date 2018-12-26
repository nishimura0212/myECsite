package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.LoginDTO2;
import com.internousdev.ecsite.util.DBConnector;

public class LoginDAO2 {
	private LoginDTO2 loginDTO = new LoginDTO2();

	public LoginDTO2 getLoginMasterInfo(String loginMasterId, String loginPassword) throws SQLException {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "SELECT * FROM login_master_transaction WHERE login_id=? AND login_pass=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginMasterId);
			ps.setString(2, loginPassword);
			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				loginDTO.setLoginId(rs.getString("login_id"));
				loginDTO.setLoginPassword(rs.getString("login_pass"));
				loginDTO.setMasterName(rs.getString("master_name"));
				loginDTO.setLoginFlg(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return loginDTO;

	}
}
