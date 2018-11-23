package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {

    private String schoolName;

    public Student() {
        this.schoolName = "Riga Technical University";
    }

    public Student(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String announce() {
        return "My name is " + getFirstName() + getSecondName() + ". I am a student from" + getSchoolName() + " in Latvia.";
    }

}

