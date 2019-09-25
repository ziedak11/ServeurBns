package com.bns.ServeurBns.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bns.ServeurBns.dao.MessageDao;
import com.bns.ServeurBns.model.Message;

@RestController
@RequestMapping("/")
@CrossOrigin
public class MessageController {
	
	@Autowired
	private MessageDao mdao;
	@PostMapping("/ajouterMessages")
	public void ajouterMessages(@RequestBody List<Message> message) {
		for(Message m: message ) {
			mdao.save(m);
		}
	}
	
	@PostMapping("/ajouterMessage")
	public void ajouterMessage(@RequestBody Message message) {
		 SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy 'at' HH:mm:ss z");
			Date dat = new Date(System.currentTimeMillis());
			System.out.println(formatter.format(dat));
		    message.setDate(dat);
			mdao.save(message);
		
	}
	
	@GetMapping("/afficherMessages")
    public List<Message> afficherMessages(){
	 return(List<Message>) mdao.findAll();
	}
	
	@PostMapping("/supprimerMessage")
	public void  supprimerMessage(@RequestBody Message message) {
		mdao.delete(message);
		
	}
	
	@PostMapping("/supprimerMessageById")
	public void  supprimerMessageById(@RequestParam Integer id) {
		mdao.deleteById(id);
		
	}
	@DeleteMapping("/supprimerMessages")
	public void  supprimerMessages() {
		mdao.deleteAll();
		
	}
	
 
}
