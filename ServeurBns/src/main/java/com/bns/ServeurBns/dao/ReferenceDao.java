package com.bns.ServeurBns.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bns.ServeurBns.model.Reference;

public interface ReferenceDao extends CrudRepository<Reference, Integer>{
	
	@Query("SELECT r FROM Reference r  where r.pay='Tunisie'")
    public List<Reference> findByPayT();
	
	@Query("SELECT r FROM Reference r  where r.pay LIKE '%i%'")
    public List<Reference> findByPay();
	

}
