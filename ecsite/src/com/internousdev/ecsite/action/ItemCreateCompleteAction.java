package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	private ItemCreateCompleteDAO iCCDAO = new ItemCreateCompleteDAO();

	public String execute() throws SQLException {
		String result = SUCCESS;

		int intItemPrice = Integer.parseInt(session.get("itemPrice").toString());
		int intItemStock = Integer.parseInt(session.get("itemStock").toString());
		iCCDAO.createItem(session.get("itemCategory").toString(), session.get("itemName").toString(), intItemPrice, intItemStock, session.get("itemImage").toString());

		return result;
	}


	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
