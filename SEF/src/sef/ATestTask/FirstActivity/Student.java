package sef.ATestTask.FirstActivity;

//Implement class Student with parent Person

public class Student extends Person {
    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public Student(String aygul, String ismayilova, int i, String rims_school) {
    }

    {

        public void setSchoolName (String schoolName){
        this.schoolName = schoolName;
    }

    public Student(String firstName, String secondName, int age, String schoolName){

        super(firstName, secondName, age);

        this.schoolName = schoolName;
    }

    public Student(String schoolName)
        {
            this.schoolName = schoolName;
        }

        public String announce ()
        {
            return "I am study in " + getSchoolName() + ".";
        }
    }

}
