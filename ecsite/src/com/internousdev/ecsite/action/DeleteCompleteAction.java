package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.DeleteItemCompleteDAO;
import com.internousdev.ecsite.dto.DeleteItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteCompleteAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	private DeleteItemCompleteDAO deleteItemCompleteDAO = new DeleteItemCompleteDAO();
	private ArrayList<DeleteItemDTO> deleteItemInfo = new ArrayList<DeleteItemDTO>();
	private String deleteFlg;
	private String message;
	public String[] deleteComplete;

	public String execute() throws SQLException {
		String result = ERROR;
		if(deleteFlg.equals("1")) {
			result = SUCCESS;
			delete();
		} else {
			result = ERROR;
		}
		return result;
	}


	public void delete() throws SQLException {
		int result = 0;
		for (String deleteItem : deleteComplete) {
			deleteItemCompleteDAO.deleteItemComplete(deleteItem);
			result++;
		}
		if(result > 0) {
			deleteItemInfo = null;
			setMessage("商品情報を正しく削除しました。");
		} else if (result == 0) {
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

	public String getDeleteFlg() {
		return deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public DeleteItemCompleteDAO getDeleteItemCompleteDAO() {
		return deleteItemCompleteDAO;
	}
	public void setDeleteItemCompleteDAO(DeleteItemCompleteDAO deleteItemCompleteDAO) {
		this.deleteItemCompleteDAO = deleteItemCompleteDAO;
	}

	public ArrayList<DeleteItemDTO> getDeleteItemInfo() {
		return deleteItemInfo;
	}
	public void setDeleteItemInfo(ArrayList<DeleteItemDTO> deleteItemInfo) {
		this.deleteItemInfo = deleteItemInfo;
	}

	public String[] getDeleteComplete() {
		return deleteComplete;
	}
	public void setDeleteComplete(String[] deleteComplete) {
		this.deleteComplete = deleteComplete;
	}




}
