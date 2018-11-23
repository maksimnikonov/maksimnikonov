package sef.ATestTask.FirstActivity;public class Student extends Person{
    private int grade;
    private String school;
    public Student(){
        System.out.println("I'm Student");
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school= school;
    }
    public String announce() {
        super.announce();
        return ("  I am " +getFirstName() + getSecondName()+ "my school" +getSchool()+ "my grade"+getGrade());

    }

}


