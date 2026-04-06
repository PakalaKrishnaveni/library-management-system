package com.business_layer;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import com.base.Book;

public class Book_Business 
{
	static Scanner sc=new Scanner(System.in);
	static Map<String,Book> bookList=new HashMap<>();
	
	public static int generateOTP()
	{
		Random r=new Random();
		int genOTP=r.nextInt(99999);
		return genOTP;		
	}
	public static String generateBookId(String bookName,String author,String language)
	{
		String bn=bookName.substring(0,3);
		String an=author.substring(0,3);
		String ln=language.substring(0,2);
		
		Random r=new Random();
		int rn=r.nextInt(100,999);
		
		return (bn+rn+an+ln).toUpperCase();
	}
	
	public static void addBook()
	{
		System.out.println("\u001B[1m"+"Enter the Book Name"+"\u001B[0m");
		String bookName=sc.nextLine();
		
		System.out.println("\u001B[1m"+"Enter the Author Name"+"\u001B[0m");
		String author=sc.nextLine();
		
		System.out.println("\u001B[1m"+"Enter the Genre"+"\u001B[0m");
		String genre=sc.nextLine();
		
		System.out.println("\u001B[1m"+"Enter the Language"+"\u001B[0m");
		String language=sc.nextLine();
		
		System.out.println("\u001B[1m"+"Enter the Price"+"\u001B[0m");
		double price=sc.nextDouble();
		sc.nextLine();
		
		Book book=new Book(bookName,author,genre,language,price);
		bookList.put(book.getBookId(),book);

		System.out.println("\u001B[1;32m"+"Book Added Successfully!"+"\u001B[0m");		
	}
	
	public static void searchBook()
	{
		System.out.println("\u001B[1m"+"Enter Book ID to search "+"\u001B[0m");
		String bookId=sc.next();
		
		if(bookList.containsKey(bookId))
		   System.out.println(bookList.get(bookId));
		else
		{
			System.out.println("\u001B[1;31m"+"Book not found"+"\u001B[0m");
		}
	}
		
	public static void removeBook()
	{
		System.out.println("\u001B[1m"+"Enter the Book ID to remove"+"\u001B[0m");
		String bookId=sc.next();
		
		if(bookList.containsKey(bookId))
		{
			bookList.remove(bookId);
			System.out.println("\u001B[1;32m"+"Book removed successfully"+"\u001B[0m");
		}else {
			System.out.println("\u001B[1;31m"+"Book not found"+"\u001B[0m");
		}		
	}
	
	public static void updateBook()
	{
		System.out.println("\u001B[1m"+"Enter Book ID to update"+"\u001B[0m");
		String bookId=sc.next();
		
		if(bookList.containsKey(bookId))
		{
			Book oldBook=bookList.get(bookId);
			if(oldBook!=null) 
			{
			     System.out.println("Current Price : "+oldBook.getPrice());	
			
			     System.out.println("\u001B[1m"+"Enter new price"+"\u001B[0m");
		         double newPrice=sc.nextDouble();
			     sc.nextLine();
			
                 Book updatedBook = new Book(oldBook.getBookName(),oldBook.getAuthor(),oldBook.getGenre(),oldBook.getLanguage(),newPrice);
           
                 bookList.put(bookId, updatedBook);
                 System.out.println("\u001B[1;32m"+"Book updated sucessfully"+"\u001B[0m");
			}
		}else 
			System.out.println("\u001B[1;31m"+"Book not found"+"\u001B[0m");
	}
	
	public static void viewAll()
	{
		if(bookList.isEmpty())
			System.out.println("\u001B[1;31m"+"No books available"+"\u001B[0m");
		else
		{
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
    		System.out.printf("\u001B[1;35m"+"| %-15s | %-25s | %-15s | %-15s | %-16s | %-16s | %n"+"\u001B[0m","Book ID",
			          "Book Name","Author Name","Genre","Language","Book Price");
    		System.out.println("-------------------------------------------------------------------------------------------------------------------------");

			for(Book b:bookList.values())
			{
	    		   System.out.printf("| %-15s | %-25s | %-15s | %-15s | %-16s | %-16s | %n"
                           ,b.getBookId(),b.getBookName(),b.getAuthor(),b.getGenre(),b.getLanguage(),b.getPrice());			
			}
		}		
	}
	
	 public static void animateString(String st) throws InterruptedException
	 {
	    	for(int i=0;i<=st.length()-1;i++)
	    	{
	    		System.out.print("\u001B[1;35;5;208m"+st.charAt(i));
	    		Thread.sleep(150);
	    	}
	    	System.out.println("\u001B[0m");
	 }
}
