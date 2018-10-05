package com.ustglobal.repository;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ustglobal.model.POItem;

@Repository
public interface POItemsRepository extends CrudRepository<POItem, Integer> {
	
	// custom query example and return a stream
    @Query("select p from PO_Items p where p.po_num = :po_num")
    Stream<POItem> findByPONum(@Param("po_num") int po_num);

}
