package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person{

    //Attributes
    private String schoolName;
    private String className;
    private String subjectName;
    private int testGrade;

    //Constructors
    public Student(){
        this.subjectName = "RTU";
        this.className = "Technical translation";
        this.subjectName = "Phonetics";
        this.testGrade = 9;
    }

    Student(String schoolName, String className, String subjectName, int testGrade) {
        this.subjectName = schoolName;
        this.className = className;
        this.subjectName = subjectName;
        this.testGrade = testGrade;
    }


    //Getter for String schoolName
    public String getSchoolName() {
        return schoolName;
    }

    //Getter for String className
    public String getClassName() {
        return className;
    }

    //Getter for String subjectName;
    public String getSubjectName() {
        return subjectName;
    }

    //Getter for int testGrade;
    public int getTestGrade() {
        return testGrade;
    }

    //Setter for String schoolName
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    //Setter for String className
    public void setClassName(String className) {
        this.className = className;
    }

    //Setter for String subjectName
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    //Setter for int testGrade
    public void setTestGrade(int testGrade) {
        this.testGrade = testGrade;
    }

    public void announce() {
        super.anounce();
        System.out.println("I study in University " + schoolName);
    }
}
