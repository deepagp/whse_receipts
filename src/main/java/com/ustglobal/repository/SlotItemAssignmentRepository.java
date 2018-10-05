package com.ustglobal.repository;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ustglobal.model.SlotItemAssignment;

@Repository
public interface  SlotItemAssignmentRepository extends CrudRepository<SlotItemAssignment, Integer> {

	// custom query example and return a stream
    @Query("select p from SlotItemAssignment p where p.itemNbr = :itemNbr")
    Stream<SlotItemAssignment> findByItemNum(@Param("itemNbr") int itemNbr);
}
