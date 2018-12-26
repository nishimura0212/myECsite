package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class MasterCreateConfirmAction extends ActionSupport implements SessionAware {
	private String loginMasterId;
	private String loginPassword;
	private String masterName;
	public Map<String,Object> session;
	private String errorMessage;

	public String execute() {
		String result = SUCCESS;

		if(!(loginMasterId.equals(""))&&!(loginPassword.equals(""))&&!(masterName.equals(""))) {
			session.put("loginMasterId",loginMasterId);
			session.put("loginPassword",loginPassword);
			session.put("masterName",masterName);
		} else {
			setErrorMessage("未入力の項目があります。");
			result = ERROR;
		}
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

	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}




}
