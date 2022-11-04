package Entity;


import java.util.Random;
import java.util.Scanner;

public class Reservation {
	
	String source,dest,date;
	
	Random random = new Random(); 
	
	
	
	private int id=random.nextInt(1000);
	public Reservation(){
		
	}
	
	public Reservation(int id,String source,String dest,String date) {
		this.id=id;
		this.source=source;
		this.dest=dest;
		this.date=date;
		
	}
	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}


	public Reservation insert() {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Your city");
	 source=sc.next();
	System.out.println("Enter your destination");
	 dest=sc.next();
	 System.out.println("Enter preferred date");
	 date=sc.next();
	 Reservation e1=new Reservation(id,source, dest, date);
	return e1;
	}
	
	
	public void display() { 
        System.out.println("Booking ID: "+id+"\n"+"Source: "+source+"\n"+"Destination: "+dest+"\n"+"Date Of Travel "+date); 
 
	}
}

