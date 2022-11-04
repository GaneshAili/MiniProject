package mainclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;



import Entity.LoginPage;
import Entity.Person;
import Entity.Registration;
import Entity.Reservation;


public class Home {

	
	
	static Registration obj=new Registration();
	static LoginPage obj1=new LoginPage();
	static Reservation obj2=new Reservation();
	
	static ArrayList<Registration>  arrList ;
	
	static Collection<Reservation> reservation=new ArrayList<Reservation>();
	  	
	public static void home(){
		
		int option,num,i=0;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			
		
		
		
		  System.out.println(" 1. Registration");
		  System.out.println(" 2. Login");
		  System.out.println(" 3. Exit");
		  
		  option=sc.nextInt();
		  
		  switch(option) {
		  case 1:
			  
			  System.out.println("Welcome to Registration Page:");
				
				arrList = new ArrayList<>(1000);
				
					arrList.add(obj.insert());
					System.out.println("Registration Sucessfully................."+"\n"+"Please goto Login press number 2.");
					System.out.println("----------------------------------------------------------------");
			  
			  break;
			  
		  case 2:
			  
			  System.out.println("Welcome to Login Page...................");
			System.out.println("----------------------------------------------------------------");

			  
			  System.out.println("Email:");
			  String Email = sc.next();
			  
			  System.out.println("Password");
			  String pwd=sc.next();
				
			  Registration  empName = obj.searchByEmailAndPassword(arrList , Email,pwd);
				
				if(empName == null) {
					System.out.println(" No such record found");
					System.out.println("--------------------------");
					break;
				}else {
					obj1.display();
					System.out.println();
					}
				System.out.println("Please Book flight");
				System.out.println("----------------------------------------------------------------");

				
				reservation.add(obj2.insert());
				
				System.out.println("Booking sucessfully................................................");
				System.out.println("----------------------------------------------------------------");

				
				do {
				System.out.println("1.Reservation details");
				System.out.println("2Cancellation");
				System.out.println("3.Booking flight");
				System.out.println("4.Logout");
				
				
				num=sc.nextInt();
				
				switch(num) 
				{
				case 1:
					
					for( i=0;i<reservation.size();i++) {
						obj2.display();
						System.out.println("----------------------------------------------------------------");

					}
					 
					break;
				case 2:
					
					Iterator<Reservation> it= reservation.iterator();
					boolean found=false;
					System.out.println("Enter Booking Id here");
					int id1=sc.nextInt();
					
					while(it.hasNext()) {
						Reservation res=it.next();
						if(res.getId()==id1) 
						{
							it.remove();
							found=true;
						}
						if(!found) {
							System.out.println("No Record Found");
						}else {
							System.out.println("Booking Deleted Successfully.....");
						}
						System.out.println("----------------------------------------------------------------");
					}
					
					break;
				case 3:
					reservation.add(obj2.insert());
					System.out.println("----------------------------------------------------------------");

					break;
			
				case 4:
					obj.exit();
					System.out.println("----------------------------------------------------------------");

					break;
				}	
				}while(num!=4);
		  break;
	
		  case 3:
			  
			  System.out.println("Exit Airline System Application");
			  System.exit(0);
		  } 
		
		}while(option!=4);  
		  
	}



}
