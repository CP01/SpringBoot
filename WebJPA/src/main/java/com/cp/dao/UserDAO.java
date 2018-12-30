package com.cp.dao;

import org.springframework.data.repository.CrudRepository;

import com.cp.model.User;

public interface UserDAO extends CrudRepository<User, Integer> {

}
