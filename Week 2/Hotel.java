class Hotel{
	String hotelname;
	int hotelrating;
	String Location;
	
	public void display(){
		System.out.println(hotelname);
		System.out.println(hotelrating);
		System.out.println(Location);
	}
	public static void main(String[] args){
		Hotel h1=new Hotel();
		h1.hotelname="SSS";
		h1.hotelrating=5;
		h1.Location="chennai";
		
		h1.display();
	}
}
	
		