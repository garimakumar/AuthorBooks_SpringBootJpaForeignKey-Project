package com.example.demo;

import java.rmi.StubNotFoundException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

@Autowired
	AuthorRepo repo;

@PostMapping("/insert")
public Author createAuthor(@RequestBody Author a) {
	Books book=new Books();
	book.setBookid(1);
	book.setBookname("Chetan Bhagat");
	book.setAuthor(a);
	a.setBook(book);
	return repo.save(a);
}

@GetMapping("/getauthorbyid/{aid}")
public Optional<Author> getauthorbyid(@PathVariable("aid") int aid) {
	return repo.findById(aid);	
}
}
