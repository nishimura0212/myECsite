package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	private ItemListDAO iLDAO = new ItemListDAO();
	private ArrayList<ItemInfoDTO> itemInfoDTO = new ArrayList<ItemInfoDTO>();

	public String execute() throws SQLException {
		String result = SUCCESS;
		itemInfoDTO = iLDAO.getAllItem();
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ItemListDAO getILDAO() {
		return iLDAO;
	}
	public void setILDAO(ItemListDAO iLDAO) {
		this.iLDAO = iLDAO;
	}

	public ArrayList<ItemInfoDTO> getItemInfoDTO() {
		return itemInfoDTO;
	}
	public void setItemInfoDTO(ArrayList<ItemInfoDTO> itemInfoDTO) {
		this.itemInfoDTO = itemInfoDTO;
	}


}
