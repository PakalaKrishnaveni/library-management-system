package com.base;

import com.business_layer.Book_Business;

public class Book 
{
    private String bookId;;
	private String bookName;
	private String author;
	private String genre;
	private String language;
	private double price;

	public Book(String bookName, String author, String gernre, String language, double price) 
	{
		this.bookId = Book_Business.generateBookId(bookName, author,language);
		this.bookName = bookName;
		this.author = author;
		this.genre = gernre;
		this.language = language;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", gernre=" + genre
				+ ", language=" + language + ", price=" + price + "]";
	}

	public String getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}

	public String getLanguage() {
		return language;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}

}
