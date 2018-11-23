
package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {

    private int klass;
    private String highSchool;

    public int getKlass() { return klass; }

    public void setKlass(int klass) { this.klass = klass; }

    public String getHighSchool() {return highSchool; }

    public void setHighSchool(String highSchool) { this.highSchool = highSchool; }

    public String announce(){
        super.announce();
        return(" I'm " + getFirstName() + getSecondName() + " and I learn in " + getHighSchool() + getKlass()
        + " class.");
    }
}
