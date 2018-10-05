package com.ustglobal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"user_po_assignment\"")
public class UserPOAssignment {
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPoNum() {
		return poNum;
	}

	public void setPoNum(int poNum) {
		this.poNum = poNum;
	}

	@Id
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "po_num")
	private int poNum;
	
	

}
