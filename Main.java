package Project;
import java.util.*;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
	static Scanner sc=new Scanner(System.in);
	
     static Equipment [] equipmentlist = new Equipment [5];
     
	 public static void main(String[] args) {		 
		
		 
		 	
		   System.out.println("please choose:\n1.customer\n2.coach\n3.admin\n");
		   int ch=sc.nextInt();
		   if(ch==1)
		 	  for_customers();
		   else if(ch==2)
		 	  for_coach();
		   else if(ch==3)
		 	  for_admin();
		   else {
		 	  System.out.println("error in selection");
		 	  int sh=sc.nextInt();
		   }
		      } 
		 static void for_customers() {
			 GYM g = new GYM ();   
			 Coach co2 = new Coach ( 5 , "amrrr" , "dd" , "kf" , "dmd" , 010012 , 6 ) ;
			 Equipment EQ = new Equipment ();
			 MembershipPlan m1 = new MembershipPlan (LocalDate.now(), " 3 days per weak" , 6, 300 );
			 InBody ib = new InBody ( LocalDate.now() ,83 , 1.74 , 30 ,8,60,40 );
		 	System.out.println("please choose:\n1.coach info\n2.the gym equipment\n3.the membership's plan\n4.the in-body information\n5. how many kilos need to be reduced \n");
		 	int ch=sc.nextInt();
		 	switch(ch) {
		 	case 1:
		 	co2.coachinfo();
		 		break;
		 	case 2:
		         g.getgymrequirments();;        //	EQ.getequipment();
		 		break;
		 	case 3:
		 		System.out.println( m1.toString()) ; m1.MembershipPlanDetails(); 
		 		break;
		 	case 4:
		 		System.out.println(ib.toString());   
		 		break;
		 	case 5:
		 		 ib.reducedkilos();
		 		break;
		 	default:	
		 	}
		 
		 }
		 static void for_coach() {
			 Customer c = new Customer ();
			 InBody b = new InBody ();
/* InBody b1 = new InBody (LocalDate.now(),80,1.75,10,5,20,20); Customer c1 = new Customer ( 1,"Ahmed","Male", "Zaiton" , "ahmed@gmail" , 01001212401  ,  b1 ) ; 
   
 InBody b2 = new InBody (LocalDate.now(),90,1.8,15,9,25,25);  Customer c2 = new Customer (2 , "Amr" , "Male" , "Nasr City" , "amr@gmail" , 01165454255 ,b2) ; 
 InBody b3 = new InBody (LocalDate.now(),85,1.67,12,7,22,22); Customer c3 = new Customer (3 , "Malak" , "Female" , "shoubra" , "malak@gmail" , 01126526565 , b3) ;
 InBody b4 = new InBody (LocalDate.now(),70,1.65,10,5,19,19); Customer c4 = new Customer (4 , "Marina" , "Female" , "Haram" , "marina@gmail" ,012656255653 ,b4) ;*/
			 
		 	System.out.println("please choose:\n1.the list of customers\n2.the inbody\n3.the details of the customers\n4.the male and female\n "); 
		 	int ch=sc.nextInt();
		 	switch(ch) {
		 	case 1:
		 		c.listOfCustomers();
		 		break;
		 	case 2:
		 		b.inbody_history();
		 		break;
		 	case 3:
		 		 c.list();
		 		break;
		 	case 4:
		 		c.gender_list();
		 		break;
		 	default:
		 	}
		 	}
		 static void for_admin() {
			 Subscription s1 = new Subscription ();
			 
		 	System.out.println("please choose:\n1.edit\n2.subscription history\n3.customers that subscribed\n4.customers with specific coach\n5.the gym income in month\n6.the most assigned number of customers to the coaches \n");			
		 	int ch=sc.nextInt();
		 	switch(ch) {
		 	case 1:
		 		break;
		 	case 2:
		 		break;
		 	case 3:
		 		break;
		 	case 4:
		 		break;
		 	case 5:
		 		break;
		 	case 6:
		 		break;
		 	default:	
		      }
		 	}
		 	
		 	
		 	
		 	    
		 	}
		 
		 
		 
		 


		    
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	/*	 MembershipPlan m1 = new MembershipPlan (LocalDate.now(), " 3 days per weak" , 6, 300 );
		 
		 Equipment  eq = new Equipment ("treadmill" , 4142 ,10);
		 Coach co2 = new Coach ( 5 , "f" , "dd" , "kf" , "dmd" , 5 , 6 ) ;
		// System.out.println(c2.toString());
     co2.calcmaxnoofcustomer(1);
				 
		 
		InBody b1 = new InBody ( LocalDate.now() ,83 , 1.74 , 30 ,8,60,40 );
		Personalinfo c1 = new Coach (510 , "helmyt el zaiton", "youssef" , "youssef@gmail" , "ww" , 01001212401 ,45 );
		// System.out.println( c1.getcaochinfo( co2));
		 eq.print();
		System.out.println(m1.toString()); System.out.println( m1.CalcDisscount() );
		System.out.println(b1.toString());    System.out.println(b1.reducedkilos()); */
		
		
	 
		
 
