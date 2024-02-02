/**
 * 
 */
package com.tofek.practice.services;

import com.tofek.practice.model.Book;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author tofekkhan
 *
 */
public interface BookService {
	
	public Flux<Book> getBooks();
	
	public Mono<Book> getBookById(String id);
	
	public Mono<Book> addBook();
	
	public Flux<Book> searchBookByTitle();
	

}
