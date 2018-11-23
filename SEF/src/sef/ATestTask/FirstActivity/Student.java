package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {

       private String schoolName;

       public Student () {
           this.schoolName = "Unknown";
       }

    public Student(String schoolName) {
        this.schoolName = schoolName;

    }

    public Student(String firstName, String secondName, int age, String schoolName) {
        super(firstName, secondName, age);
        this.schoolName = schoolName;

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void announce() {
           System.out.println("I am study in university " + getSchoolName());
    }
}
