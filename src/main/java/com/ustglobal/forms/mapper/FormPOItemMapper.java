package com.ustglobal.forms.mapper;

import java.util.ArrayList;
import java.util.List;

import com.ustglobal.forms.FormPOItem;
import com.ustglobal.model.POItem;

public class FormPOItemMapper {
	
	public static List<FormPOItem> map(List<POItem> poItems) {
		List<FormPOItem> formPOItems = new ArrayList<>();
		for(POItem poItem : poItems) {
			FormPOItem formPOItem = new FormPOItem();
			formPOItem.setItemNbr(poItem.getItemNbr());
			formPOItem.setPoNum(poItem.getPoNum());
			formPOItem.setOrderedQty(poItem.getQty());
			formPOItems.add(formPOItem);
		}
		return formPOItems;
		
	}
	
	
	
}
