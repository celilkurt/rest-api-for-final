package com.example.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.entity.Book;
import com.example.web.entity.User;

@RestController

public class TestController {

	static ArrayList<User> users;
	static ArrayList<Book> books;
	
	
	
	@GetMapping("/")
	public Map<String, Object> greeting() {
		return Collections.singletonMap("message", "getFuckYourself");
	}
	
	@GetMapping("/users/")
	public List<User> getUsers(@RequestParam(value = "name", defaultValue = " ")String name) {
		
		users = new ArrayList<>();
		users.add(new User(1,"Veli","Kut"));
		users.add(new User(2,"Ali","Yut"));
		users.add(new User(4,"Ayşe","Yet"));
		
		return users;
		
		
	}
	
	@GetMapping("/books/")
	public List<Book> getBooks() {
	
		books = new ArrayList<>();
		books.add(new Book("Savaşma ***","Tolstoy"));
		books.add(new Book("Çok büyük umutlar","Dick Dickens"));
		books.add(new Book("Berekli topaklar","Orhan kemal"));
		
		return books;
	}
	
	
	
}
