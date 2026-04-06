package com.service_layer;

import java.util.Scanner;

import com.business_layer.Book_Business;
import com.validtaion_layer.Data_validation;

public class Book_Main 
{
	public static void main(String[] args) throws InterruptedException 
	{
        Scanner sc=new Scanner(System.in);
        
        System.out.println("\u001B[1;35m"+"📖.....Welcome to Library Management System.....📖"+"\u001B[0m");
        System.out.println("\u001B[1;32m"+"Login to Library..."+"\u001B[0m");
        while(true)
        {
        System.out.println("\u001B[1m"+"Enter the Mobile Number"+"\u001B[0m");
        long mobileNumber=sc.nextLong();
        
        if(Data_validation.validateMobileNumber(mobileNumber)) 
        {      
        	System.out.println("\u001B[1;32m"+"Login Successfully..."+"\u001B[0m");
             while(true)
             {
        	    System.out.println("\n1.Add a Book");
        	    System.out.println("2.Search a Book");
        	    System.out.println("3.Remove a Book");
        	    System.out.println("4.Update a Book");
        	    System.out.println("5.View All Books");
        	    System.out.println("6.Exit");
        	
        	System.out.println("\u001B[1;35m"+"Enter choice: "+"\u001B[0m");
        	int choice=sc.nextInt();
        	sc.nextLine();
        	
        	switch(choice)
        	{
        	case 1:{
        		Book_Business.addBook();
        	       break;
        	}
        	case 2:{
        		Book_Business.searchBook();
        		break;
        	}
        	case 3:{
        		Book_Business.removeBook();
        		break;
        	}
        	case 4:{
        		Book_Business.updateBook();
        		break;
        	}
        	case 5:{
        		Book_Business.viewAll();
        		break;
        	}
        	case 6:{
        		System.out.println("\u001B[1;32m"+"Thankyou...🙏🙏"+"\u001B[0m");
        		System.exit(0);
        	}
        	default:System.out.println("\u001B[1;31m"+"Invalid choice"+"\u001B[0m");
            }        	
	      }
 
   }else {
	   System.out.println("\u001B[1;31m"+"Invalid Mobile Number..."+"\u001b[0m");
   }
        }
}
}