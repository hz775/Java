public class TravelTime{
	public static void main(String[] args){
	String name="Hemanth";
	String fromCity = "Chennai", viaCity = "Vellore", toCity = "Bangalore";
	double distancefromTovia=156.6;
	double timefromtovia=4*60+4;
	double distanceviaTocity=211.8;
	double timeviaTocity=4*60+25;
	double TotalDistance=distancefromTovia + distanceviaTocity;
	double TravelTimetaken=timefromtovia + timeviaTocity;
	System.out.println("The distance travelled by "+name+"From"+fromCity+"to"+viaCity+"via"+viaCity+"is"+TotalDistance+"km and "+"the total time taken is "+TravelTimetaken+"in mins");
	}
}

	

		