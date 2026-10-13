package labweek4;

public class Student {
    
    String studentID;
    String name;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }
    
    public void printInformation() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentID);
    }
    
}
