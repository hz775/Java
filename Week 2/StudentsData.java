class Student {
    String name; 
    int age;    
    int rollNo; 

    // Constructor to initialize student details
    public Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
}

public class StudentsData {
    public static void main(String[] args) {
        Student[] students = storeStudents(); 
        System.out.println("Student Details Stored Successfully");
    }

    public static Student[] storeStudents() {
        Student[] students = new Student[20]; 

        students[0] = new Student("Alice", 20, 1);
        students[1] = new Student("Bob", 21, 2);
        students[2] = new Student("Charlie", 22, 3);
        students[3] = new Student("David", 23, 4);
        students[4] = new Student("Eve", 20, 5);
        students[5] = new Student("Frank", 21, 6);
        students[6] = new Student("Grace", 22, 7);
        students[7] = new Student("Hannah", 23, 8);
        students[8] = new Student("Isaac", 20, 9);
        students[9] = new Student("Jack", 21, 10);
        students[10] = new Student("Kathy", 22, 11);
        students[11] = new Student("Liam", 23, 12);
        students[12] = new Student("Mia", 20, 13);
        students[13] = new Student("Nina", 21, 14);
        students[14] = new Student("Oscar", 22, 15);
        students[15] = new Student("Paul", 23, 16);
        students[16] = new Student("Quincy", 20, 17);
        students[17] = new Student("Rachel", 21, 18);
        students[18] = new Student("Sam", 22, 19);
        students[19] = new Student("Tina", 23, 20);

        return students; 
    }
}
