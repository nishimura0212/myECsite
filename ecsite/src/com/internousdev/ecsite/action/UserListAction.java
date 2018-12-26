package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	private UserListDAO uLDAO = new UserListDAO();
	private ArrayList<UserInfoDTO> userInfoDTO = new ArrayList<UserInfoDTO>();

	public String execute() throws SQLException {
		String result = SUCCESS;
		userInfoDTO = uLDAO.getAllUser();
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public UserListDAO getULDAO() {
		return uLDAO;
	}
	public void setULDAO(UserListDAO uLDAO) {
		this.uLDAO = uLDAO;
	}

	public ArrayList<UserInfoDTO> getUserInfoDTO() {
		return userInfoDTO;
	}
	public void setUserInfoDTO(ArrayList<UserInfoDTO> userInfoDTO) {
		this.userInfoDTO = userInfoDTO;
	}


}
