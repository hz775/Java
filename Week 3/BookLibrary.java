class BookLibrary{
	String title;
	String author;
	int price;
	boolean availability;
	
	BookLibrary(){
	title="1947";
	author="Gandhi";
	price=1234;
	availability=true;
	}
	
	BookLibrary(String title,String author,int price,boolean availability){
	this.title=title;
	this.author=author;
	this.price=price;
	this.availability=availability;
	}
	void display(){
	System.out.println("Title: "+title);
	System.out.println("Title: "+title);
	System.out.println("Title: "+price);
	System.out.println("Avialability: "+availability);
	}
	void BorrowBook(){
		if(availability){
			System.out.println("You have successfully borrowed"+title);
		}else{
			System.out.println("Sorry"+title+" is not available");
		}
	}
	public static void main(String[] args){
	BookLibrary b1=new BookLibrary();
	b1.display();
	b1.BorrowBook();
	b1.BorrowBook();
	System.out.println();
    BookLibrary b2 = new BookLibrary("The Great Gatsby", "F. Scott Fitzgerald", 1500, true);
    b2.display();
    b2.BorrowBook();
    }
}
	

	
	
	
	