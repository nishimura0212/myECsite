package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	private String loginUserId;
	private String loginPassword;
	public Map<String,Object> session;
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();
	private String errorMessage;

	public String execute() throws SQLException {
		String result = ERROR;

		if((loginUserId.equals(""))&&(loginPassword.equals(""))) {
			setErrorMessage("ユーザーIDおよびパスワードを入力してください。");
		} else if ((loginUserId.equals(""))) {
			setErrorMessage("ユーザーIDが未入力です。");
		} else if ((loginPassword.equals(""))) {
			setErrorMessage("パスワードが未入力です。");
		}

		loginDTO = loginDAO.getLoginUserInfo(loginUserId,loginPassword);
		session.put("loginUser",loginDTO);

		if(((LoginDTO)session.get("loginUser")).getLoginFlg()) {
			result = SUCCESS;
			session.put("login_user_id",loginDTO.getLoginId());
			session.put("user", loginDTO.getUserName());
			return result;
		}
		return result;
	}


	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}
	public String getLoginUserId() {
		return loginUserId;
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
