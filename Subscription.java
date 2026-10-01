package Project;

public class Subscription {

 int CustomerID ;
 int CoachID;
 MembershipPlan MemberShipPlan ;
 
public Subscription() {
}

public Subscription(int CID, int COID, MembershipPlan MSP) {

	CustomerID = CID;
	CoachID = COID;
	MemberShipPlan = MSP;
}

}
