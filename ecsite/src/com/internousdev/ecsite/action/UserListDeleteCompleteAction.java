package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDeleteCompleteDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	private UserListDeleteCompleteDAO uLDCDAO = new UserListDeleteCompleteDAO();
	private ArrayList<UserInfoDTO> userInfoDTO = new ArrayList<UserInfoDTO>();
	private String message;


	public String execute() throws SQLException {
		String result = SUCCESS;
		delete();
		return result;
	}


	public void delete() throws SQLException {
		int res = uLDCDAO.allUserDelete();

		if (res > 0) {
			userInfoDTO = null;
			setMessage("ユーザー情報を正しく削除しました。");
		} else if (res == 0) {
			setMessage("ユーザー情報の削除に失敗しました。");
		}
	}


	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public UserListDeleteCompleteDAO getULDCDAO() {
		return uLDCDAO;
	}
	public void setULDCDAO(UserListDeleteCompleteDAO uLDCDAO) {
		this.uLDCDAO = uLDCDAO;
	}

	public ArrayList<UserInfoDTO> getUserInfoDTO() {
		return userInfoDTO;
	}
	public void setUserInfoDTO(ArrayList<UserInfoDTO> userInfoDTO) {
		this.userInfoDTO = userInfoDTO;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}


}
