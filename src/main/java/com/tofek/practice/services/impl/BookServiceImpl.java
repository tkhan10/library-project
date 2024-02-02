package com.tofek.practice.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tofek.practice.controller.repository.BookRepository;
import com.tofek.practice.model.Book;
import com.tofek.practice.services.BookService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Flux<Book> getBooks() {
		return bookRepository.getAllBooks();
	}

	@Override
	public Mono<Book> getBookById(String id) {
		return bookRepository.getBookById(id);
	}

	@Override
	public Mono<Book> addBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<Book> searchBookByTitle() {
		// TODO Auto-generated method stub
		return null;
	}

}
