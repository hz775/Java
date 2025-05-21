class CarRental{
	String customerName;
	String carModel;
	int rentalDays;
	double CostPerDay;
	
	CarRental(){
	customerName="hemanth";
	carModel="BMW";
	rentalDays=5;
	CostPerDay=50.0;
	}
	
	CarRental(String customerName,String carModel,int rentalDays,double CostPerDay){
		this.customerName=customerName;
		this.rentalDays=rentalDays;
		this.carModel=carModel;
		this.CostPerDay=CostPerDay;
	}
	double CalculateTotalCost(){
		return rentalDays*CostPerDay;
	}
	void display(){
		System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost Per Day: $" + CostPerDay);
        System.out.println("Total Cost: $" + CalculateTotalCost());
    }
	public static void main(String[] args){
		CarRental car1=new CarRental();
		car1.display();
		System.out.println();
		
		CarRental car2=new CarRental("SAI","AUDI",6,100);
		car2.display();
	}
}