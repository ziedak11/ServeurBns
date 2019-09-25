package com.bns.ServeurBns.controller;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bns.ServeurBns.dao.ReferenceDao;
import com.bns.ServeurBns.model.Reference;

@RestController
@RequestMapping("/")
@CrossOrigin
//@CrossOrigin(origins = "http://localhost:9090")
public class ReferenceController {
	@Autowired
	private ReferenceDao rdao;
	
	
	@PostMapping("/ajouterReferences")
	public void ajouterReferences(@RequestBody List<Reference> reference ) {
		for(Reference ref : reference) {
		rdao.save(ref);
		}
			}
	

	@PostMapping("/ajouterReference")
	public void ajouterReference(@RequestBody Reference reference ) {	
		
	    /* File image = new File("D:/logo.gif");
	      reference.setLogo (new FileInputStream(image)) ;*/
		rdao.save(reference);
					}
	
	
	@GetMapping("/afficherReferences")
	public List<Reference> afficherReferences(){
		return(List<Reference>)rdao.findAll();
		
	}
	/*@PutMapping("/modifierReference")
	public void modifierReference(@RequestBody Reference reference) {
		rdao.delete(reference);
		rdao.save(reference);
		
	}*/
	
	@PutMapping("/modifierReference")
	public void modifierReference(@RequestBody Reference reference) {
		
		rdao.save(reference);
		
	}
	
	@PostMapping("/supprimerReference")
	public void supprimerReference(@RequestBody Reference reference) {
		rdao.delete(reference);
		
	}

	@DeleteMapping("/supprimerReferenceById")	
	public void supprimerReferenceById(@RequestBody Integer id) {
		rdao.deleteById(id);
		
	}
	
	
	@GetMapping("/afficherReferenceByPayT")
	public   List<Reference> afficherReferenceByPayT() {
		return (List<Reference>) rdao.findByPayT();
	}
	
	@GetMapping("/afficherReferenceByPay")
	public   List<Reference> afficherReferenceByPay() {
		return (List<Reference>) rdao.findByPay();
	}
	
	
}
