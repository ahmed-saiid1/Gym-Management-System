package Project;

import java.util.*;


public class GYM  {
	    List<Equipment> equipmentList = new ArrayList<Equipment>();
	    List<Coach> coachesList = new ArrayList<>();
	    List<Subscription> listofsubscribtion = new ArrayList<>();
	    

	String Name , Address ;
	int PhoneNumber ;
	Equipment SportsEquipments ;
	Coach Listofcoaches ;
	Subscription ListOfSubscriptions ;
	
	
	public GYM() {	
	}

	public GYM(String N, String Ad, int PN, Equipment SE, Coach LOC , Subscription LOS) {
			
		Name = N;
		Address = Ad;
		PhoneNumber = PN;
		SportsEquipments = SE;
		Listofcoaches = LOC ;
		ListOfSubscriptions = LOS ;
	}
	
        
	void getgymrequirments () {
		
		equipmentList.add(new Equipment("Treadmill", "E001", 5));
        equipmentList.add(new Equipment("Rowing Machine", "E002", 3));
        for (Equipment e : equipmentList) 
        	System.out.println(e); 
        }
	void getCoaches () {
		coachesList.add(new Coach(5150, "Ali",  "Zaiton", "Male", "ali@gym.com", 01200000000, 6));
		coachesList.add(new Coach(5152, "Sara", "Nasr City", "Female", "sara@gym.com", 01000000000, 6));
		for (Coach c : coachesList) 
        	System.out.println(c); 
	}
       
	/*void listofsub () {
		listofsubscribtion.add(new Subscription(1 , 4140 , ) );
	}*/

}
