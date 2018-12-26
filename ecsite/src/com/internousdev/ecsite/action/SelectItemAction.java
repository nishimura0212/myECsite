package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SelectItemAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	private BuyItemDAO buyItemDAO = new BuyItemDAO();
	private BuyItemDTO buyItemDTO = new BuyItemDTO();
	private String errorMessage;
	private String selectItemName;
	public String itemImage;
	private String back;


	public String execute() throws SQLException {
		String result;

		if (selectItemName != null) {
			 result = SUCCESS;
			 buyItemDTO = buyItemDAO.getBuyItemInfo(selectItemName);

			 	if(buyItemDTO.getItemName() != null) {
			 		session.put("id",buyItemDTO.getId());
			 		session.put("buyItem_category",buyItemDTO.getItemCategory());
			 		session.put("buyItem_name",buyItemDTO.getItemName());
			 		session.put("buyItem_price",buyItemDTO.getItemPrice());
			 		session.put("buyItem_stock", buyItemDTO.getItemStock());
			 		session.put("buyItem_image",buyItemDTO.getItemImage());

			 		itemImage = session.get("buyItem_image").toString();
			 	}
			 return result;

		} else if (back.equals("1")){
			result = SUCCESS;
			String itemName = session.get("buyItem_name").toString();
			buyItemDTO = buyItemDAO.getBuyItemInfo(itemName);
				if(buyItemDTO.getItemName() != null) {
					session.put("id",buyItemDTO.getId());
					session.put("buyItem_category",buyItemDTO.getItemCategory());
					session.put("buyItem_name",buyItemDTO.getItemName());
					session.put("buyItem_price",buyItemDTO.getItemPrice());
					session.put("buyItem_stock", buyItemDTO.getItemStock());
					session.put("buyItem_image",buyItemDTO.getItemImage());

					itemImage = session.get("buyItem_image").toString();
				return result;
			}
		} else {
			 result = ERROR;
			 return result;
		}
		return result;
	}

		/*
		if (back == null) {
			buyItemDTO = buyItemDAO.getBuyItemInfo(selectItemName);
			if(buyItemDTO.getItemName() != null) {
				session.put("id",buyItemDTO.getId());
				session.put("buyItem_name",buyItemDTO.getItemName());
				session.put("buyItem_price",buyItemDTO.getItemPrice());
				session.put("buyItem_stock", buyItemDTO.getItemStock());
			} else if(buyItemDTO.getItemName() == null) {
				result = ERROR;
			}
		} else if (back.equals("1")) {
			Item = session.get("buyItem_name").toString();
			buyItemDTO = buyItemDAO.getBuyItemInfo(Item);
			session.put("id",buyItemDTO.getId());
			session.put("buyItem_name",buyItemDTO.getItemName());
			session.put("buyItem_price",buyItemDTO.getItemPrice());
			session.put("buyItem_stock", buyItemDTO.getItemStock());
			}
		*/



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

	public String getSelectItemName() {
		return selectItemName;
	}
	public void setSelectItemName(String selectItemName) {
		this.selectItemName = selectItemName;
	}

	public String getBack() {
		return back;
	}
	public void setBack(String back) {
		this.back = back;
	}

}
