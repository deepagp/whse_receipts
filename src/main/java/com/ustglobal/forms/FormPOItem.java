package com.ustglobal.forms;

public class FormPOItem {

	private int poNum;

	private int itemNbr;

	private int receivedQty;
	private int orderedQty;

	public int getOrderedQty() {
		return orderedQty;
	}

	public void setOrderedQty(int orderedQty) {
		this.orderedQty = orderedQty;
	}

	private String comments;

	public int getPoNum() {
		return poNum;
	}

	public void setPoNum(int poNum) {
		this.poNum = poNum;
	}

	public int getItemNbr() {
		return itemNbr;
	}

	public void setItemNbr(int itemNbr) {
		this.itemNbr = itemNbr;
	}

	public int getReceivedQty() {
		return receivedQty;
	}

	public void setReceivedQty(int receivedQty) {
		this.receivedQty = receivedQty;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
