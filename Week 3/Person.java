class Person{
	String name;
	int age;
	String Address;

	Person(){
		name="Hemanth";
		age=10;
		Address="Chennai";
	}
	Person(Person other){
		this.name=other.name;
		this.age=other.age;
		this.Address=other.Address;
	}
	void display(){
		System.out.println("Name of the person is: "+name);
		System.out.println("Age of the person is: "+age);
		System.out.println("Address of the person is: "+Address);
	}
	public static void main(String[] args){
		Person p1=new Person();
		p1.display();
		System.out.println();
		
		Person p2=new Person(p1);
		p2.display();
	}
}
		
		
	