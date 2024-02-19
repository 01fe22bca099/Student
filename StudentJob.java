public class StudentJob  extends StudentCourses5{

    public static void main(String[] args) {
        StudentCourses5 s=new StudentCourses5();
        // Hardcoded student information
        String name = "divya";
        String department = "BCA";
        String[] courses = {"C#", "Machine learning", "Software testing", "Devops lab"};

        // Displaying student information
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Courses Registered:");

        for (String course : courses) {
            System.out.println(" - " + course);
        }

        s.displayStudentMarks();

}


}