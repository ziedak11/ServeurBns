package com.bns.ServeurBns.dao;

import org.springframework.data.repository.CrudRepository;

import com.bns.ServeurBns.model.Message;



public interface MessageDao extends CrudRepository<Message,Integer>  {

}
