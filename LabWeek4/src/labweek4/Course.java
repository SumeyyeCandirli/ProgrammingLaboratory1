package labweek4;

public class Course {
    
    String courseName;
    int capacity;
    Student[] enrolledStudents;
    int count = 0;

    public Course(String courseName, int capacity) {
        this.courseName = courseName;
        this.capacity = capacity;
        enrolledStudents = new Student[capacity];
    }
    
     public void display() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Capacity: " + capacity);
        System.out.println("Enrolled Students: " + count);

        for (int i = 0; i < count; i++) {
            enrolledStudents[i].printInformation();
        }
    }
    
    
    
}
