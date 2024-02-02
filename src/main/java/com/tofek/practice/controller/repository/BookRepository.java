/**
 * 
 */
package com.tofek.practice.controller.repository;

import org.springframework.stereotype.Component;

import com.tofek.practice.model.Book;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author tofekkhan
 *
 */
@Component
public class BookRepository {

	public Flux<Book> getAllBooks() {
		return Flux.just(new Book("1", "Deep Work", "Cal Newport", 2016),
				new Book("2", "Atomic Habits", "James Clear", 2020));
		
	}

	public Mono<Book> getBookById(String id) {
		
		return Mono.just(new Book("1", "Deep Work", "Cal Newport", 2016));
	}

}
