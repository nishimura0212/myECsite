package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyHistoryDAO;
import com.internousdev.ecsite.dto.BuyHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyHistoryAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	private BuyHistoryDAO buyHistoryDAO = new BuyHistoryDAO();
	private ArrayList<BuyHistoryDTO> buyHistoryList = new ArrayList<BuyHistoryDTO>();

	public String execute() throws SQLException {
		String result = ERROR;
		if (!session.containsKey("login_user_id")) {
			return ERROR;
		} else {
			result = SUCCESS;
			String user_master_id = session.get("login_user_id").toString();
			buyHistoryList = buyHistoryDAO.getHistoryUserInfo(user_master_id);
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

	public BuyHistoryDAO getBuyHistoryDAO() {
		return buyHistoryDAO;
	}

	public void setBuyHistoryDAO(BuyHistoryDAO buyHistoryDAO) {
		this.buyHistoryDAO = buyHistoryDAO;
	}

	public ArrayList<BuyHistoryDTO> getBuyHistoryList() {
		return buyHistoryList;
	}
	public void setMyBuyHistoryList(ArrayList<BuyHistoryDTO> buyHistoryList) {
		this.buyHistoryList = buyHistoryList;
	}


}
