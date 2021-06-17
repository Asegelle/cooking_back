package fr.persoproject.cookingwebsite.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.persoproject.cookingwebsite.beans.User;
import fr.persoproject.cookingwebsite.services.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private UserService userService;

	
	// ------------------------ CRUD of movies -----------------------------
	
	/**
	 * function getAllMovies :
	 * @return List<User>
	 */
	@GetMapping("/user")
	public List<User> getAllMovies() {
		return userService.getAllUsers();
	}
	
	
	
	
	
	
	
}
