package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {
    private String schoollName;


    //constructors
    public Student() {
        this.schoollName = "Gymnasium";
    }
    //getters setters
    public String getSchoollName() {
        return schoollName;
    }

    public void setSchoollName(String schoollName) {
        this.schoollName = schoollName;
    }

    @Override
    public String announce() {
        return "I am study in university " + getSchoollName() + " .";
    }


}