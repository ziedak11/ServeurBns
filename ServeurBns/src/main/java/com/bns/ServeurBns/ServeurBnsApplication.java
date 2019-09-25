package com.bns.ServeurBns;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServeurBnsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServeurBnsApplication.class, args);
		/*System.out.println("aaaa"+"  "+ System.currentTimeMillis());
		
		SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy ");
		Date date = new Date(System.currentTimeMillis());
		
		System.out.println(" om"+formatter.format(date));
		
		//System.out.println("xxxx"+date);
		
		//System.out.println();
		
		LocalDateTime dat = LocalDateTime.now();
		System.out.println("loc"+dat);*/
		
		//System.out.println("****"+formatter.format(dat));
		
		
		 DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		   //LocalDate date1 = LocalDate.of(2009, 12, 31);
	       //LocalDate date2 = LocalDate.of(2010, 01, 31);
	       LocalDateTime date3 = LocalDateTime.now();
	       LocalDateTime date4 = LocalDateTime.now().plusMonths(2);
	       
		
	        //System.out.println("date1 : " + sdf.format(date1));
	        //System.out.println("date2 : " + sdf.format(date2));
	        System.out.println("date3 : " + sdf.format(date3));
	        System.out.println("date4 : " + sdf.format(date4));
	        System.out.println("test : " + date4.isAfter(date3));
	     
		
		
	}
		
}
