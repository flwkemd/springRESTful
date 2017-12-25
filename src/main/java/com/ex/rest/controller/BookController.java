package com.ex.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ex.rest.model.Book;
import com.ex.rest.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	/* Add new book */
	@PostMapping("/book")
	public ResponseEntity<?> save(@RequestBody Book book){
		long id = bookService.save(book);
		return ResponseEntity.ok().body("New Book has been saved with ID:" +id);
	}

}