package Project;
import java.util.*;
public class Equipment {
	
	static String [] equipmentlist = new String [5];
	 
	String Name ;
	String Code ;
	int Quantity ;
	
	
	public Equipment() {
	}

	public Equipment(String N , String C , int Q) {
    Name = N ;  
    Code = C ;
    Quantity = Q ;
  
	}
	
 	    
    
	/*void getequipment () {
		 equipmentlist[0]= new String ("(Leg Press , 4140 , 3 )");
		 equipmentlist[1]= new String ("(Squat , 4141 , 2 )");
		 equipmentlist[2]= new String ("(Rowing Machine , 4142 , 4 ) ");
		 equipmentlist[3]= new String ("(Leg Curl , 4143 , 2 ) ");
		 equipmentlist[4]= new String ("(Treadmill , 4144 , 8 )");
		 for (int i =0 ; i<5 ; i++) {
			 System.out.println(equipmentlist[i]);
		 }}*/
		
	

	@Override
	public String toString() {
		return "Equipment [Name=" + Name + ", Code=" + Code + ", Quantity=" + Quantity + "]";
	}

	
	}
	
	 

