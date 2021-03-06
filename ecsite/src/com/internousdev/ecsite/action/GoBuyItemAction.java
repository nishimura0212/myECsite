package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.CartDAO;
import com.internousdev.ecsite.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoBuyItemAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	private CartDAO cartDAO = new CartDAO();
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();

	public String execute() throws SQLException{
		String result = ERROR;
		if (!session.containsKey("login_user_id")) {
			return result;
		} else {
			String user_master_id = session.get("login_user_id").toString();
			cartList = cartDAO.getCartInfo(user_master_id);
			for(CartDTO cartDTO:cartList){
				session.put("Bid", cartDTO.getId());
				session.put("Bstock", cartDTO.getItemStock());
				session.put("Tprice", cartDTO.getTotalPrice());
				session.put("Tcount", cartDTO.getTotalCount());
				session.put("Bname", cartDTO.getItem());
			}
			result = SUCCESS;
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

	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}
	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}
}
