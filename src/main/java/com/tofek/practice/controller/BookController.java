/**
 * 
 */
package com.tofek.practice.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tofek.practice.model.Book;
import com.tofek.practice.services.BookService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author tofekkhan
 *
 */

@RestController
@RequestMapping("/library-project")
public class BookController {

	@Autowired
	private BookService bookService;
	
	
	@GetMapping("/books")
	public Flux<Book> getAllBooks(){
		return bookService.getBooks();
	}
	
	@GetMapping("/books/{id}")
	public Mono<Book> getBookByid(@PathVariable String id){
		return bookService.getBookById(id);
	}
}
