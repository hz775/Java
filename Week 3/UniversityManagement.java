class Student {
    public int rollNumber;
    protected String Name;
    private double CGPA;

    public Student(String Name, int rollNumber, double CGPA) {
        this.rollNumber = rollNumber;
        this.Name = Name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA");
        }
    }

    public void display() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("CGPA is  : " + CGPA);
        System.out.println("Name of the Person is  : " + Name);
    }
}

class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String Name, String specialization, double CGPA) {
        super(Name, rollNumber, CGPA);
        this.specialization = specialization;
    }

    public void displayPostgraduateInfo() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Name: " + Name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("CGPA: " + getCGPA());
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student s1 = new Student("AAAA", 101, 8.5);
        s1.display();
        s1.setCGPA(8.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        System.out.println();

        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", "Computer Science", 9.2);
        pgStudent.displayPostgraduateInfo();
    }
}

	


		
			
			
	