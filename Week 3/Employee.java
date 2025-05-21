class Employee{
	String name;
	final int id;
	String designation;
	static String CompanyName="LT mindsprint";
	
	Employee(String name,String designation,int id){
		this.name=name;
		this.designation=designation;
		this.id=id;
	}
	
	static void displayTotalEmployees(){
		System.out.println("CompanyName: "+CompanyName);
	}
	
	void displayEmployee(){
		if (this instanceof Employee){
			System.out.println("Name of the company: "+CompanyName);
			System.out.println("Name of the employee: "+name);
			System.out.println("Id: "+id);
			System.out.println("Designation: "+designation);
		}else{
			System.out.println("Invalid");
		}
	}
	
	public static void main(String[] args){
		Employee E1=new Employee("EER","CHC",101);
		E1.displayEmployee();
		Employee E2=new Employee("rrr","heo",102);
		E2.displayEmployee();
		Employee.displayTotalEmployees();
	}
}

		
		