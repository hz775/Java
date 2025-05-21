class Product{
	String ProductName;
	int price;
	static int totalProducts=0;
	
	public Product(String ProductName,int price){
		this.ProductName=ProductName;
		this.price=price;
		totalProducts++;
	}
	public void display(){
		System.out.println("Product Name: "+ProductName);
		System.out.println("Price: "+price);
	}
	
	public static void TotalProductdisplay(){
		System.out.println(" Total Products Created : "+totalProducts);
	}
	
	public static void main(String[] args){
		Product p1=new Product("Laptop",999);
		Product p2=new Product("Pc",555);
		
		p1.display();
		p2.display();
		TotalProductdisplay();
	}
}
		

		
	