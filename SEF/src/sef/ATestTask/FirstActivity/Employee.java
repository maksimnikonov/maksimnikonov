package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName ="Gravity";
    private double salary;
    private  String firstName ;
    private  String secondName ;
    private int age;

    //TODO 1 create different constructors
    public Employee(){
         // This is just an example for a constructor i didnt use it in my code
    }
    public Employee(int empId , String jobTitle){
        // This is just an example for a constructor i didnt use it in my code
    }
    public  Employee(int empId ,  String firstName , String jobTitle  ,double salary ){
        this.setEmpId(empId);
        this.setJobTitle(jobTitle);
        this.setSalary(salary);
        this.setFirstName(firstName);
    }

    //TODO 2 add getters and setters

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public  int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (!(companyName.equals("")))this.companyName = companyName;
        else this.companyName = "Unknown";
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    //TODO 3 override method announce()

    @Override
    public String announce() {
        return super.announce();
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        if (!(firstName.equals("")))this.firstName = firstName;
        else this.firstName = "Unknown";

    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
      if(age>0 )  this.age = age;
      else System.out.println(" Please enter a valide age  ");
    }

    @Override
    public String getSecondName() {
        return secondName;
    }

    @Override
    public void setSecondName(String secondName) {
        if (!(secondName.equals("")))this.secondName = secondName;
        else this.secondName = "Unknown";
    }
}