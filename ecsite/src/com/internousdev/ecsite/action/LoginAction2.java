package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.LoginDAO2;
import com.internousdev.ecsite.dto.LoginDTO2;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction2 extends ActionSupport implements SessionAware {
	private String loginMasterId;
	private String loginPassword;
	public Map<String,Object> session;
	private LoginDAO2 loginDAO = new LoginDAO2();
	private LoginDTO2 loginDTO = new LoginDTO2();
	private String errorMessage;

	public String execute() throws SQLException {
		String result = ERROR;

		if((loginMasterId.equals(""))&&(loginPassword.equals(""))) {
			setErrorMessage("マスターIDおよびパスワードを入力してください。");
		} else if ((loginMasterId.equals(""))) {
			setErrorMessage("マスターIDが未入力です。");
		} else if ((loginPassword.equals(""))) {
			setErrorMessage("パスワードが未入力です。");
		}

		loginDTO = loginDAO.getLoginMasterInfo(loginMasterId,loginPassword);
		session.put("loginMaster",loginDTO);

		if(((LoginDTO2)session.get("loginMaster")).getLoginFlg()) {
			result = SUCCESS;
			session.put("login_master_id",loginDTO.getLoginId());

			return result;
		}
		return result;
	}



	public void setLoginMasterId(String loginMasterId) {
		this.loginMasterId = loginMasterId;
	}
	public String getLoginMasterId() {
		return loginMasterId;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getLoginPassword() {
		return loginPassword;
	}

	public Map<String,Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


}
