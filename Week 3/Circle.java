class Circle{
	double radius;
	
	Circle(){
		radius=10;
	}
	Circle(double radius){
		this.radius=radius;
	}
	void display(){
		System.out.println("RADIUS: "+radius);
		System.out.println("Area: "+getarea());
	}
	double getarea(){
		return Math.PI*radius*radius;
	}
	public static void main(String[] args){
		Circle Circle1=new Circle();
		Circle1.display();
		System.out.println();
		
		Circle Circle2=new Circle(5);
		Circle2.display();
	}
}