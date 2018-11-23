package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {


    /// Attributes
    private String SchoolName;
    private int Grade;
    private String ClassName;


    public Student() {
        System.out.println("I am study in University" + SchoolName);
    }

    ///constructors

    Student(String SchoolName, int Grade, String ClassName) {
        this.SchoolName = "Medical College";
        this.Grade = 2;
        this.ClassName = "Teeth Doctors";


    }
    //TODO 2 add getters and setters
// getter for schoolName

    public String getSchoolName() {
        return SchoolName;
    }

    // setter for SchoolName
    public void setSchoolName() {
        this.SchoolName = SchoolName;
    }

    ///getter for Grade

    public int getGrade() {
        return Grade;
    }

/// setter for Grade

    public void setGrade() {
        this.Grade = Grade;
    }


    ///setter for ClassName
    public void setClassName() {
        this.ClassName = ClassName;
    }

    ///getter for ClassName

    public String getClassName() {
        return ClassName;
    }


    public void announce() {
        super.announce();
        System.out.println("I am study in university" + SchoolName);
    }
}




