package fr.persoproject.cookingwebsite.demodata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import fr.persoproject.cookingwebsite.beans.User;
import fr.persoproject.cookingwebsite.dao.UserDAO;

@Component
public class DemoData {

	
	// ------------------------------------------------------------------------------------------------
	// --------------------- Autowired --------------------
	@Autowired
	private UserDAO userDAO;
	

	
	// ------------------------------------------------------------------------------------------------
	// --------------------- generation of DemoData --------------------
	@EventListener
	public void appReady (ApplicationReadyEvent event) {
	
		User user1 = new User ("Alexandre","Segelle","asegelle@gmail.com");
		User user2 = new User ("Caroline","Colin","ccolin@gmail.com");
		User user3 = new User ("Rio","Segelle","rsegelle@gmail.com");
		userDAO.save(user1);
		userDAO.save(user2);
		userDAO.save(user3);

		
		
		
	}
	
	
}
