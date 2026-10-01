package Project;
import java.time.LocalDate;

public class MembershipPlan {
 LocalDate StartDate ;
 String MonthlyPlan ;
 int NumberOfMonths ;
 int MonthPrice ;
 
 //double Disscount = 0.1;
 
public MembershipPlan() {
}

public MembershipPlan(LocalDate SD, String MP, int NOM, int POMSP) {
	super();
	StartDate = SD;
	MonthlyPlan = MP;
	NumberOfMonths = NOM;
	MonthPrice = POMSP ;
	
}
	void MembershipPlanDetails() {
		int PriceOfMemberShipPlan = NumberOfMonths*MonthPrice ;
		if (NumberOfMonths >= 3) {
			System.out.println( "your price of the membership plan after discount : " + PriceOfMemberShipPlan*0.9) ;
	}
		else 
			System.out.println("your price of the membership plan : "+ PriceOfMemberShipPlan );
		}

	@Override
	public String toString() {
		return "MembershipPlan [StartDate=" + StartDate + ", MonthlyPlan=" + MonthlyPlan + ", NumberOfMonths="
				+ NumberOfMonths + "]";
	}
	
	
}
