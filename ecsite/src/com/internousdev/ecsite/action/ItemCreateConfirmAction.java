package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateConfirmAction extends ActionSupport implements SessionAware {
	private String itemCategory;
	private String itemName;
	private int itemPrice;
	private int itemStock;
	private String itemImage;
	public Map<String,Object> session;
	private String errorMessage;

	public String execute() {
	// 文字列 result をSUCCESS で初期化する。
		String result = SUCCESS;

	/* どの項目も間違った値が入っていなければ、キーに値を入れる。
		このsessionに入った値は「オブジェクト型」なので、取得する時はデータ型（toStringなど）を決めること。*/
	if (!(itemCategory.equals("")) && !(itemName.equals("")) && !(itemPrice < 0) && !(itemStock < 0)) {
		session.put("itemCategory", itemCategory);
		session.put("itemName",itemName);
		session.put("itemPrice", itemPrice);
		session.put("itemStock", itemStock);
		session.put("itemImage", itemImage);
	} else {
		// どこかの項目が間違っていれば result に ERROR を入れる。
		setErrorMessage("入力内容に間違いがあります。");
		result = ERROR;
	}
	return result;//SUCCESS か ERROR を返す。
	}


	public String getItemCategory(){
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemStock() {
		return itemStock;
	}
	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getItemImage() {
		return itemImage;
	}
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}


}
