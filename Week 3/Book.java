class Book{
	String Title;
	String Author;
	int Price;
	
	Book(){
		Title="EXCHANGE OF MONEY";
		Author="Linconl";
		Price=2000;
	}
	Book(String Title,String Author,int Price){
		this.Title=Title;
		this.Author=Author;
		this.Price=Price;
	}
	void display(){
		System.out.println("Title: "+Title);
		System.out.println("Author: "+Author);
		System.out.println("Price: "+Price);
	}
public static void main(String[] args){
	Book book1=new Book();
	book1.display();
	System.out.println();
	Book book2=new Book("1947","George well",499);
	book2.display();
	}
}
	
		
	