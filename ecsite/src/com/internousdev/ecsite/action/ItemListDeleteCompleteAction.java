package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDeleteCompleteDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteCompleteAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	private ItemListDeleteCompleteDAO iLDCDAO = new ItemListDeleteCompleteDAO();
	private ArrayList<ItemInfoDTO> itemInfoDTO = new ArrayList<ItemInfoDTO>();
	private String message;


	public String execute() throws SQLException {
		String result = SUCCESS;
		delete();
		return result;
	}


	public void delete() throws SQLException {
		int res = iLDCDAO.allItemDelete();

		if (res > 0) {
			itemInfoDTO = null;
			setMessage("商品情報を正しく削除しました。");
		} else if (res == 0) {
			setMessage("商品情報の削除に失敗しました。");
		}
	}


	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ItemListDeleteCompleteDAO getILDCDAO() {
		return iLDCDAO;
	}
	public void setILDCDAO(ItemListDeleteCompleteDAO iLDCDAO) {
		this.iLDCDAO = iLDCDAO;
	}

	public ArrayList<ItemInfoDTO> getItemInfoDTO() {
		return itemInfoDTO;
	}
	public void setItemInfoDTO(ArrayList<ItemInfoDTO> itemInfoDTO) {
		this.itemInfoDTO = itemInfoDTO;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}


}
