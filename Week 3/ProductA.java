class ProductA{
	String ProductName;
	int Price;
	int Quantity;
	static double Discount=10;
	final int ProductId;
	
	ProductA(String ProductName,int Price,int Quantity,int ProductId){
		this.ProductName=ProductName;
		this.Price=Price;
		this.ProductId=ProductId;
		this.Quantity=Quantity;
	}
	static void updateDiscount(){
		System.out.println("Discount: "+Discount);
	}
	
	void display(){
		if (this instanceof ProductA){
			System.out.println("ProductName: "+ProductName);
			System.out.println("Price: "+Price);
			System.out.println("ID: "+ProductId);
			System.out.println("ProductName: "+ProductName);
			System.out.println("Quantity: "+Quantity);
		}else{
			System.out.println("Invalid");
		}
	}
	
	public static void main(String[] args){
		ProductA P1=new ProductA("Lays",100,5,10234);
		P1.display();
		ProductA P2=new ProductA("kurukuraa",120,5,10235);
		P2.display();
		
		ProductA.updateDiscount();
	}
}
	



			

	
		