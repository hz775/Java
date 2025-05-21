class StudentManagement{
	String Name;
	final int RollNumber;
	String Grade;
	static String UniversityName="SRM";
	static int TotalStudents=100;
	
	StudentManagement(String Name,int RollNumber,String Grade){
		this.Name=Name;
		this.RollNumber=RollNumber;
		this.Grade=Grade;
	}
	
	static void displayToatalStudents(){
		System.out.println("Total Students: "+TotalStudents);
	}
	
	void display(){
		if (this instanceof StudentManagement){
			System.out.println("Name: "+Name);
			System.out.println("RollNumber: "+RollNumber);
			System.out.println("UniversityName: "+UniversityName);
			System.out.println("TotalStudents: "+TotalStudents);
			System.out.println("Grade: "+Grade);
		}else{
			System.out.println("Invalid");
		}
	}
	
	public static void main(String[] args){
		StudentManagement S1=new StudentManagement("AAA",101,"A");
		S1.display();
		StudentManagement S2=new StudentManagement("BBB",102,"B");
		S2.display();
		
		StudentManagement.displayToatalStudents();
	}
}
		







	
	
	










