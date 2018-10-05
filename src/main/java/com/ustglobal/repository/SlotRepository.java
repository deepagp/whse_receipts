package com.ustglobal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ustglobal.model.Slot;

@Repository
public interface  SlotRepository extends CrudRepository<Slot, String> {

}
