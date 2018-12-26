package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	private BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
	private String back;

	public String execute() throws SQLException {
		String result = SUCCESS;

		buyItemCompleteDAO.buyItemInfo(
				session.get("id").toString(),
				session.get("login_user_id").toString(),
				session.get("total_price").toString(),
				session.get("count").toString(),
				session.get("pay").toString()
				);

		int intCount = Integer.parseInt(session.get("count").toString());
		int intStock = Integer.parseInt(session.get("buyItem_stock").toString());
		String name  = session.get("buyItem_name").toString();

		buyItemCompleteDAO.updateItemInfo(name, intStock, intCount);

		return result;
	}


	public Map<String,Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getBack() {
		return back;
	}

	public void setBack(String back) {
		this.back = back;
	}


}
