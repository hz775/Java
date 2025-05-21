class Course{
	String CourseName;
	int duration;
	int fee;
	
	private static String instituteName = "Default Institute";

	public Course(String CourseName,int duration,int fee){
		this.CourseName=CourseName;
		this.duration=duration;
		this.fee=fee;
	}
	public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + CourseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
	}
	public static void updateInstitute(String newInstituteName){
		instituteName=newInstituteName;
	}
	public static void main(String[] args){
		Course.updateInstitute("Tech Academy");
		Course c1 = new Course("Java Programming", 12, 4999);
        Course c2 = new Course("Web Development", 10, 3999);

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
