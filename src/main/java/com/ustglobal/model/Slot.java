package com.ustglobal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"slot\"")
public class Slot {
	
	@Id
	@Column(name = "slot_id")
	private String slotId;
	
	@Column(name = "current_item_nbr")
	private Integer currentItemNbr;

	public String getSlotId() {
		return slotId;
	}

	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}

	public Integer getCurrentItemNbr() {
		return currentItemNbr;
	}

	public void setCurrentItemNbr(Integer currentItemNbr) {
		this.currentItemNbr = currentItemNbr;
	}
	

}
