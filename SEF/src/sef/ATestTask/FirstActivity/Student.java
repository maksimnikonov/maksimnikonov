package sef.ATestTask.FirstActivity;

public class Student extends Person {
    private String schoolName;

    public Student(){
        this.schoolName = "unknown";
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

    public void announce(){

        System.out.println("I study in " + schoolName);
    }
}
