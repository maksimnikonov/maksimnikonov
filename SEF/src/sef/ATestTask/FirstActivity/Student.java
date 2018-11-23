package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {

    private String schoolName;

    // constructors
    public Student (String firstName, String secondName, int age, String schoolName){
        super(firstName, secondName, age);
        this.schoolName = schoolName;
    }
    public Student() {}

    // getters and setters

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // announce method
    @Override
    public String announce () {
        return "I am study in university " + getSchoolName() + ".";
    }
}
