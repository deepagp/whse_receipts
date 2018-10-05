package com.ustglobal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ustglobal.model.UserPOAssignment;

@Repository
public interface  AssignedPoRepository extends CrudRepository<UserPOAssignment, Integer> {

}
