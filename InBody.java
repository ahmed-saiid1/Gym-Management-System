package Project;
import java.time.LocalDate;
import java.util.Scanner;

public class InBody {
	static Scanner sc = new Scanner (System.in);
	
	LocalDate  date;
	double Weight ;
	double Height ;
	double BodyfatMass ;
	double Minerals ;
	double ToyalBodyWater ;
	double Protein ;
	int noOfInBody = 1;
	public InBody() {
		
	}

	public InBody(LocalDate D, double W, double H, double BFM, double M, double TBW, double PR) {
			
		
		date = D;
		Weight = W;
		Height = H;
		BodyfatMass = BFM;
		Minerals = M;
		ToyalBodyWater = TBW;
		Protein = PR;
	}

	void reducedkilos() {
		double averageBMI = (20+24)/2 ;
		double Exactweight =averageBMI*(Height*Height) ;
		System.out.println("You need to reduce : " + (Weight-Exactweight) + " kg");
	}
		
	static void inbody_history() {
		System.out.println("please choose:\n1.ahmed\n2.amr\n3.malak\n4.marina \n");			
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
	 		System.out.println("before:" + LocalDate.of(202, 3, 13) + " [80 kg, 1.75 m , 10 kg, 5 kg, 20 kg, 20 kg]");
	 		System.out.println("after:" + LocalDate.now()+ " [75 kg , 1.77 m , 9 kg , 7 kg , 17 kg , 17 kg]");
			break;
		case 2:
			System.out.println("before:" + LocalDate.of(202, 3, 13) + " [90 kg ,1.8 m ,15 kg ,9 kg ,25 kg ,25 kg]");
	 		System.out.println("after:" + LocalDate.now()+ " [85 kg , 1.82 m , 13 kg , 7 kg , 22 kg , 22 kg]");
			break;
		case 3:
			System.out.println("before:" +  LocalDate.of(202, 3, 13) +" [85kg , 1.67 m , 12 kg , 7 v ,22 kg , 22 kg]");
	 		System.out.println("after:" + LocalDate.now() +" [80 kg ,1.69 m ,10 kg , 5 kg ,20 kg ,20 kg ]");
			break;
		case 4:
			System.out.println("before:" +  LocalDate.of(202, 3, 13) + " [70 kg , 1.65 m ,10 kg ,5 kg ,19 kg ,19 kg]");
	 		System.out.println("after:" + LocalDate.now() + "[67 kg , 1.66 m , 9 kg , 6 kg , 17 kg , 17 kg]");
			break;
		default:	}
		}

	
	
	
	
	@Override
	public String toString() {
		return "InBody [date=" + date + ", Weight=" + Weight + ", Height=" + Height + ", BodyfatMass=" + BodyfatMass
				+ ", Minerals=" + Minerals + ", ToyalBodyWater=" + ToyalBodyWater + ", Protein=" + Protein + "]";
	}

	
}
