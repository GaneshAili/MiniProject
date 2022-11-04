package Entity;



import java.util.ArrayList;
import java.util.Scanner;



public class Registration extends Person{
	


	
		  
		  Registration(String firstName,String lastName,String email,String city,String Gender,String password){
				
				this.setFirstName(firstName);
				this.setLastName(lastName);
				this.setEmail(email);
				
				this.setCity(city);
				this.setGender(Gender);
				
				this.setPassword(password);
				
				
			}



		public Registration(String email, String password) {
			this.setEmail(email);
			  this.setPassword(password);
		}


		public Registration() {
			
		}



		public  Registration insert() {
			  Scanner sc=new Scanner(System.in);
			  
			  System.out.println("Enter FirstName:");
			  setFirstName(sc.next());
			  
			  System.out.println("Enter LastName:");
			  setLastName(sc.next());
			  
			  System.out.println("Enter Email id:");
			  setEmail(sc.next());
			  
			  System.out.println("Enter pasword:");
			  setPassword(sc.next());
			  
			  System.out.println("Enter City:");
			  setCity(sc.next()); 
			  
			  System.out.println("Enter Gender:");
			  setGender(sc.next());
			  
			  
			  
			  Registration e=new Registration(getFirstName(),getLastName(),getEmail(),getCity(),getGender(),getPassword());
			  return e;
			  
		  }

	

		public void display() {
			  System.out.println("First Name "+getFirstName()+"\n"
					  +"Last Name "+getLastName()+"\n"+"Email Id "+getEmail()+"\n"+"\n"+"Gender "+getGender()+"\n"
					  +"City "+getCity()+"\n"+"Password "+getPassword());
		  }
		
		
		
		public Registration searchByEmailAndPassword(ArrayList<Registration> arrList, String Email, String pwd) {
			

	    	
			  for(int i = 0 ; i< arrList.size(); i++) {
				   
					if(arrList.get(i).getEmail().equals(Email) && arrList.get(i).getPassword().equals(pwd)){					
						return arrList.get(i);
						}
				}  
			  
			  return null;
		}



		public void exit() {
			System.out.println("Logout successfully..............");
		}
		
		  

}
