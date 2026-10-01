package Project;

import java.util.Scanner;

public class Coach extends Personalinfo {
	static Scanner sc=new Scanner(System.in);
	static int Workinghours ;
    
    
	public Coach() {
		
	}

	public Coach(int id, String Na, String Ad, String Ge, String Em, int Ph , int WH ) {
		
		super(id, Na, Ad, Ge, Em, Ph);
		Workinghours = WH ;
		
	}
	
	void calcmaxnoofcustomer (int NoOfCustomers ) {
		int maxcustomer = 10 ;
		if (NoOfCustomers<maxcustomer) {
			System.out.println("The number of customers is:" + "  " +NoOfCustomers);
		}
		else 
			System.out.println("You reach the maximum number of customers");
	}

	static void coachinfo () {
		System.out.println(Name);
		System.out.println(PhoneNumber);
		System.out.println(Workinghours);
	}

	
	
	
	
	
	
	
		

	 }

	
	
	

