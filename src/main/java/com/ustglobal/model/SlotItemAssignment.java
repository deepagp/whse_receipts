package com.ustglobal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"slot_item_assignment\"")
public class SlotItemAssignment {

	@Id
	@Column(name = "id")
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSlotId() {
		return slotId;
	}

	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}

	public int getItemNbr() {
		return itemNbr;
	}

	public void setItemNbr(int itemNbr) {
		this.itemNbr = itemNbr;
	}

	@Column(name = "slot_id")
	private String slotId;
	
	@Column(name = "item_nbr")
	private int itemNbr;
}
