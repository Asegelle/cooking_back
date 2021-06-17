package fr.persoproject.cookingwebsite.dao;

import org.springframework.data.repository.CrudRepository;

import fr.persoproject.cookingwebsite.beans.User;


public interface UserDAO extends CrudRepository <User, Integer> {

}
