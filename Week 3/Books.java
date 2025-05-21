class Books{
	String Title;
	String author;
	final int isbn;
	static String LibraryName="vbnm";
	
	
	Books(String Title,String author,int isbn){
		this.Title=Title;
		this.author=author;
		this.isbn=isbn;
	}
	
	static void displayLibraryName(){
		System.out.println("LibraryName: "+LibraryName);
	}
	
	void display(){
		if (this instanceof Books){
			System.out.println("LibraryName: "+LibraryName);
			System.out.println("Title: "+Title);
			System.out.println("Author: "+author);
			System.out.println("Isbn: "+isbn);
		}else{
			System.out.println("Invalid");
		}
	}
	public static void main(String[] args){
		Books b1=new Books("Bio","Nama",101);
		b1.display();
		Books b2=new Books("Bi","Na",102);
		b2.display();
		
		Books.displayLibraryName();
	}
	
	
	
}
		
	


		
	
	