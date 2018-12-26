package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.DeleteItemDAO;
import com.internousdev.ecsite.dto.DeleteItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteConfirmAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	private DeleteItemDAO deleteItemDAO = new DeleteItemDAO();
	private ArrayList<DeleteItemDTO> deleteItemList = new ArrayList<DeleteItemDTO>();
	public String[] delete;
	ArrayList<DeleteItemDTO> deleteItemInfo = deleteItemList; //チェックした項目分の配列"deleteItemInfo"を作成。

	public String execute() throws SQLException {
		String result = ERROR;
		if (!session.containsKey("login_user_id")) {
			result = ERROR;
		} else if (session.containsKey("login_user_id")) {
			result = SUCCESS;
			if (delete != null) {
				// List をさらにリストへ
				for (String deleteItem : delete) {  // 配列delete の要素をすべて順番に取得。
					deleteItemList = deleteItemDAO.getDeleteItemInfo(deleteItem); //SQL文のselect文で取得した値を"deleteItemList"に格納。
					for (DeleteItemDTO strs : deleteItemList){  //配列deleteItemList(1つしか入っていない)の要素をすべて取得。
						deleteItemInfo.add(strs);   //配列"deleteItemInfo"に要素を追加
					}
				}
			}
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

	public DeleteItemDAO getDeleteItemDAO() {
		return deleteItemDAO;
	}
	public void setDeleteItemDAO(DeleteItemDAO deleteItemDAO) {
		this.deleteItemDAO = deleteItemDAO;
	}

	public ArrayList<DeleteItemDTO> getDeleteItemList() {
		return deleteItemList;
	}
	public void setDeleteItemList(ArrayList<DeleteItemDTO> deleteItemList) {
		this.deleteItemList = deleteItemList;
	}

	public String[] getDelete() {
		return delete;
	}
	public void setDelete(String[] delete) {
		this.delete = delete;
	}

	public ArrayList<DeleteItemDTO> getDeleteItemInfo() {
		return deleteItemInfo;
	}
	public void setDeleteItemInfo(ArrayList<DeleteItemDTO> deleteItemInfo) {
		this.deleteItemInfo = deleteItemInfo;
	}

}
