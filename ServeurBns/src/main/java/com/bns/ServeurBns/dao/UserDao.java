package com.bns.ServeurBns.dao;

import org.springframework.data.repository.CrudRepository;

import com.bns.ServeurBns.model.User;


public interface UserDao extends CrudRepository<User, Integer> {

}
