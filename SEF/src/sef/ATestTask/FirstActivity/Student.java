package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {

    String schoolName;

    public Student(){

    }
    public Student(String firstName, String secondName, int age, String schoolName){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public String announce(){
        return "I am " + getFirstName() + " " + getSecondName() + " and my age is: " + getAge() + " years old. " + "I learn in" + getSchoolName();
    }
}
