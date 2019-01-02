package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ThrowCartDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ThrowCartAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	private int count;
	private String pay;
	private String errorMessage;
	public String itemImage;
	private ThrowCartDAO throwCartDAO = new ThrowCartDAO();

	public String execute() throws SQLException{
		String result = SUCCESS;

		session.put("count",count);
		int intCount = Integer.parseInt(session.get("count").toString());
		int intPrice = Integer.parseInt(session.get("buyItem_price").toString());
		session.put("total_price",intCount * intPrice);

		itemImage = session.get("buyItem_image").toString();

		int intStock = Integer.parseInt(session.get("buyItem_stock").toString());
		if(intStock == 0){
			 result = ERROR;
			 setErrorMessage("この商品は現在在庫切れです。");
		 }else if(intStock < intCount){
			result = ERROR;
			setErrorMessage("購入可能数は"+intStock+"個です。");
		 }else{
			 throwCartDAO.cartItemInfo(
				session.get("id").toString(),
				session.get("login_user_id").toString(),
				session.get("total_price").toString(),
				session.get("count").toString()
				);
		 }
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
