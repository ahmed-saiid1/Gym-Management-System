package Project;

import java.util.Scanner;

public class Customer extends Personalinfo {
	static Scanner sc = new Scanner (System.in);
	static String [] listofcustomers = new String [4];
	
	Subscription subscription ;
	InBody ListofInbodies ;
	

	public Customer() {
	}

	public Customer(int id, String Na, String Ad, String Ge, String Em, int Ph , InBody LOIB ) {
		super(id, Na, Ad, Ge, Em, Ph);
		
		ListofInbodies = LOIB ;
	}
	void listOfCustomers () {
	listofcustomers[0]= new String ("Ahmed");
	listofcustomers[1]= new String ("Amr");
	listofcustomers[2]= new String ("Malak");
	listofcustomers[3]= new String ("Marina");
	
	 for (int i =0 ; i<4 ; i++) { 
		 System.out.println(listofcustomers[i]);
	 }
	}
	 static void gender_list() {
	 	    System.out.println("please choose:\n1.male\n2.female\n");			
	 	    int ch=sc.nextInt();
	 	    switch(ch) {
	 		case 1:
	 			System.out.println("amr,ahmed");
	 			break;
	 		case 2:
	 			System.out.println("marina,malak");
	 			break;
	 		default:	
	 	}
	}
	 static void list() {
 	     System.out.println("please choose:\n1.amr\n2.ahmed\n3.malak\n4.marina \n");			
 	     int ch=sc.nextInt();
 	     switch(ch) {
 	 	case 1:
 	 		System.out.println("1,amr,male,nasr city,amr@gmail,01154973433");
 	 		break;
 	 	case 2:
 	 		System.out.println("2,ahmed,male,elzatone,ahmed@gmail,01008467333");
 	 		break;
 	 	case 3:
 	 		System.out.println("3,malak,female,shoubra,malak@gmail,01545443433");
 	 		break;
 	 	case 4:
 	 		System.out.println("4,marina,female,haram,marina@gmail,01253486591");
 	 		break;
 	 	default:	
 	      }
 	     } 
}
