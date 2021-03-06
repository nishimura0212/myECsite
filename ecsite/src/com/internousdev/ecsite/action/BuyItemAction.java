package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemCompleteDAO;
import com.internousdev.ecsite.dao.CartDAO;
import com.internousdev.ecsite.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	private String pay;
	private String errorMessage;
	private BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
	private CartDAO cartDAO = new CartDAO();
	private ArrayList<CartDTO> cartList2 = new ArrayList<CartDTO>();

	public String execute() throws SQLException{
		String result = ERROR;
		int intStock = Integer.parseInt(session.get("Bstock").toString());
		int intCount = Integer.parseInt(session.get("Tcount").toString());
		if(intStock == 0){
			 setErrorMessage("この商品は現在在庫切れです。");
			 return result;
		 }else if(intStock < intCount){
			setErrorMessage("購入可能数は"+intStock+"個です。");
			return result;
		 }

		result = SUCCESS;
		String payment;
		if(pay.equals("1")){
			payment = "現金払い";
			session.put("pay",payment);
		}else{
			payment = "クレジットカード";
			session.put("pay",payment);
		}

		String user_master_id = session.get("login_user_id").toString();
		cartList2 = cartDAO.getCartInfo(user_master_id);
		for(CartDTO cartDTO : cartList2){
			buyItemCompleteDAO.buyItemInfo(
				cartDTO.getItemTransactionId(),
				session.get("login_user_id").toString(),
				cartDTO.getTotalPrice(),
				cartDTO.getTotalCount(),
				session.get("pay").toString()
				);
			buyItemCompleteDAO.updateItemInfo(
				cartDTO.getItem(),
				intStock,
				intCount
				);
			buyItemCompleteDAO.deleteCartInfo(
				cartDTO.getItemTransactionId()
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
