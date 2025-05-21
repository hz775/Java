class HotelBooking{
	String guestName;
	String roomType;
	int nights;
	
	HotelBooking(){
		guestName="Hemanth";
		roomType="TwoBHK";
		nights=2;
	}
	
	HotelBooking(HotelBooking otherPerson){
		this.guestName=otherPerson.guestName;
		this.roomType=otherPerson.roomType;
		this.nights=otherPerson.nights;
	}
	HotelBooking(String guestName,String roomType,int nights){
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights=nights;
	}
	void display(){
		System.out.println("Guestname: "+guestName);
		System.out.println("RoomType: "+roomType);
		System.out.println("Nights: "+nights);
	}
	public static void main(String[] args){
		HotelBooking h1=new HotelBooking();
		h1.display();
		HotelBooking h2=new HotelBooking("sai","neBHK",1);
		h2.display();
		HotelBooking h3=new HotelBooking(h1);
		h3.display();
	}
}
	
	
		
		