package fr.persoproject.cookingwebsite.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.persoproject.cookingwebsite.beans.User;
import fr.persoproject.cookingwebsite.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService {

	
		
	
	// -------------------------------------------------------------------------------
	// ------------------ autowired ----------------------
	
	@Autowired
	UserDAO userDAO;
	
	
	
	// -------------------------------------------------------------------------------
	// ------------------ Methods ----------------------
	
	@Override
	public List<User> getAllUsers() {
		return (List<User>) userDAO.findAll();
	}

	
	
	
}
