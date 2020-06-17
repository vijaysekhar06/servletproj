package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.ContactEntity;

import com.example.repository.ContactMasterRepo;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {ConfigurableApplicationContext cf=SpringApplication.run(SpringDataJpaApplication.class, args);
		
						ContactMasterRepo cme=cf.getBean(ContactMasterRepo.class);
		
		/*ContactEntity contactEntity=new ContactEntity();
		contactEntity.setContactId(103);
		contactEntity.setContactName("dumdi");
		contactEntity.setContactNumber(6303111656L);
		ContactEntity contactEntity1=new ContactEntity();
		contactEntity1.setContactId(104);
		contactEntity1.setContactName("vijay");
		contactEntity1.setContactNumber(6303111656L);
	
		List<ContactEntity> list=new ArrayList<>();
		list.add(contactEntity);
		list.add(contactEntity1);
			cme.saveAll(list);
	
		
		System.out.println(cme.count());
		Optional<ContactEntity> ce=	cme.findById(101);
		ContactEntity cEntity=ce.get();
		System.out.println(cEntity.getContactId()+"   "+cEntity.getContactName()+"   "+cEntity.getContactNumber());
		System.out.println(cme.existsById(109));
	
	Iterable<ContactEntity> it=	cme.findAll();
	
	Iterator <ContactEntity>it1=it.iterator();
		while(it1.hasNext())
		{
		 	ContactEntity	cEntity=it1.next();
		 	System.out.println(cEntity.getContactId()+"   "+cEntity.getContactName()+"   "+cEntity.getContactNumber());
		 	
		}
	*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Hello*********************************************************");
		
		
		
		
		
		
		
		
		
		
		cf.close();
	}

}
