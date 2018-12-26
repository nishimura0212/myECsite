package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.MasterCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterCreateCompleteAction extends ActionSupport implements SessionAware {
	private String loginMasterId;
	private String loginPassword;
	private String masterName;
	public Map<String,Object> session;
	private MasterCreateCompleteDAO masterCreateCompleteDAO = new MasterCreateCompleteDAO();

	public String execute() throws SQLException {
		masterCreateCompleteDAO.createMaster(session.get("loginMasterId").toString(),session.get("loginPassword").toString(),session.get("masterName").toString());

		String result = SUCCESS;
		return result;
	}


	public String getLoginMasterId() {
		return loginMasterId;
	}
	public void setLoginMasterId(String loginMasterId) {
		this.loginMasterId = loginMasterId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getMasterName() {
		return masterName;
	}
	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}




}
