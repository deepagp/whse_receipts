package com.ustglobal.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.constants.LocationConstants;
import com.ustglobal.constants.MovementStatus;
import com.ustglobal.forms.FormPOItem;
import com.ustglobal.model.POItem;
import com.ustglobal.model.ReceivedItem;
import com.ustglobal.model.UserPOAssignment;
import com.ustglobal.repository.AssignedPoRepository;
import com.ustglobal.repository.POItemsRepository;
import com.ustglobal.repository.ReceivedItemRepository;

@Service
public class ReceiptService {

	@Autowired
	POItemsRepository poItemsRepository;

	@Autowired
	AssignedPoRepository assignedPoRepository;

	@Autowired
	ReceivedItemRepository receivedItemRepository;

	@Autowired
	SlotService slotService;

	public List<POItem> getAssignedPOItems(int userId) {
		UserPOAssignment userPOAssignment = assignedPoRepository.findById(userId).get();
		return poItemsRepository.findByPONum(userPOAssignment.getPoNum()).collect(Collectors.toList());

	}

	public void receiveToWareHouse(List<FormPOItem> poItems) {
		for (FormPOItem poItem : poItems) {
			ReceivedItem receivedItem = mapToReceivedItem(poItem);
			receivedItem.setCurrentLocation(LocationConstants.DOOR);
			receivedItem.setMovementStatus(MovementStatus.PENDING.toString());
			receivedItem.setReceivedTs(LocalDateTime.now());
			receivedItem.setStorageLocation(slotService.getSlot(poItem.getItemNbr()));
			receivedItemRepository.save(receivedItem);
		}
	}

	private ReceivedItem mapToReceivedItem(FormPOItem item) {
		ReceivedItem receivedItem = new ReceivedItem();
		receivedItem.setItemNbr(item.getItemNbr());
		receivedItem.setPoNum(item.getPoNum());
		receivedItem.setComments(item.getComments());
		receivedItem.setReceivedQty(item.getReceivedQty());
		return receivedItem;
	}

}
