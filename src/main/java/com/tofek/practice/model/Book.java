/**
 * 
 */
package com.tofek.practice.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tofekkhan
 *
 */

public class Book implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String title;
	private String auther;
	private int year;
	
	
	/**
	 * @param id
	 * @param title
	 * @param auther
	 * @param year
	 */
	public Book(String id, String title, String auther, int year) {
		super();
		this.id = id;
		this.title = title;
		this.auther = auther;
		this.year = year;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the auther
	 */
	public String getAuther() {
		return auther;
	}
	/**
	 * @param auther the auther to set
	 */
	public void setAuther(String auther) {
		this.auther = auther;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
}
