package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.SelectCategoryDAO;
import com.internousdev.ecsite.dto.SelectCategoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoSelectItemAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	private SelectCategoryDAO sCDAO = new SelectCategoryDAO();
	private ArrayList<SelectCategoryDTO> sCDTO = new ArrayList<SelectCategoryDTO>();
	private String errorMessage;
	private String itemCategoryName;
	private String category;


	public String execute() throws SQLException {
		String result = SUCCESS;

		if (category == null) {
			sCDTO = sCDAO.getCategoryInfo(itemCategoryName);
		} else if (category.equals("1")) {
			String Category = session.get("buyItem_category").toString();
			sCDTO = sCDAO.getCategoryInfo(Category);
		}

		return result;
	}



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

	public String getItemCategoryName() {
		return itemCategoryName;
	}
	public void setItemCategoryName(String itemCategoryName) {
		this.itemCategoryName = itemCategoryName;
	}

	public ArrayList<SelectCategoryDTO> getsCDTO() {
		return sCDTO;
	}
	public void setsCDTO(ArrayList<SelectCategoryDTO> sCDTO) {
		this.sCDTO = sCDTO;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}
