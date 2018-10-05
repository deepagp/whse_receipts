package com.ustglobal.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"received_items\"")
public class ReceivedItem {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "po_num")
	private int poNum;

	@Column(name = "item_nbr")
	private int itemNbr;

	@Column(name = "received_qty")
	private int receivedQty;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public LocalDateTime getReceivedTs() {
		return receivedTs;
	}

	public void setReceivedTs(LocalDateTime receivedTs) {
		this.receivedTs = receivedTs;
	}

	public String getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getMovementStatus() {
		return movementStatus;
	}

	public void setMovementStatus(String movementStatus) {
		this.movementStatus = movementStatus;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Column(name = "received_ts")
	private LocalDateTime receivedTs;

	@Column(name = "storage_location")
	private String storageLocation;

	@Column(name = "current_location")
	private String currentLocation;

	@Column(name = "movement_status")
	private String movementStatus;

	@Column(name = "comments")
	private String comments;

}
