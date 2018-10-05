package com.ustglobal.service;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.model.Slot;
import com.ustglobal.model.SlotItemAssignment;
import com.ustglobal.repository.SlotItemAssignmentRepository;
import com.ustglobal.repository.SlotRepository;

@Service
public class SlotService {

	@Autowired
	SlotItemAssignmentRepository itemAssignmentRepository;
	
	@Autowired
	SlotRepository slotRepository;
	
	public String getSlot(int itemNbr) {
		
		Stream<SlotItemAssignment> slotItemAssignment =itemAssignmentRepository.findByItemNum(itemNbr);
		return slotItemAssignment.filter((sa)->{
			Slot s = slotRepository.findById(sa.getSlotId()).get();
			return s.getCurrentItemNbr()==null;
		}).findFirst().get().getSlotId();
		
	}
}
