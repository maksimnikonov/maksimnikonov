package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    // 1 try to get 100% of test coverage
    //Example
    @Test
     public void checkPersonCreatedProperly() {
        Employee employee = new Employee();
        employee.setFirstName("Alina");
        assertEquals("I am an error message", "Alina", employee.getFirstName());
    }
    @Test
    public void checkPersonWithoutName() {
      Employee employee = new Employee();
      employee.setFirstName("");
      assertEquals("I am an error message", "Unknown", employee.getFirstName());
    }

    @Test
    public void checkAgeCreatedNegative() {
        Employee employee = new Employee();
        employee.setAge(-5);
        assertEquals("I am an error message", 0, employee.getAge());
    }
    @Test
    public void checkAgeCreatedPositive() {
        Employee employee = new Employee();
        employee.setAge(15);
        assertEquals("I am an error message", 15, employee.getAge());
    }
    @Test
    public void checkEmployeeCreatedProperlySecondName() {
        Employee employee = new Employee();
        employee.setSecondName("Test1");
        assertEquals("I am an error message", "Test1", employee.getSecondName());
    }
    @Test
    public void checkEmployeeWithoutSecondName() {
        Employee employee = new Employee();
        employee.setSecondName("");
        assertEquals("I am an error message", "Unknown", employee.getSecondName());
    }
   @Test
   public void checkEmployeeCreatedWithoutName(){
        Employee employee = new Employee();
        employee.setName("");
        assertEquals("I don't know the name","Unknown",employee.getFirstName());
    }
    @Test
    public void testSetAndGetId(){
        Employee employee = new Employee();
        int testId = 10;
        employee.setEmpId(testId);
        assertEquals("Uncorrect ID",testId, employee.getEmpId());}
    @Test
    public void testCompanyName(){
        Employee employee = new Employee();
        String companyName = "Accenture";
        employee.setCompanyName("Accenture");
        assertEquals("I don't work in Accenture, I have another company", "Accenture", employee.getCompanyName());
    }
    @Test
    public void testTitle(){
        Employee employee = new Employee();
        String jobTitle = "Developer";
        employee.setJobTitle("Developer");
        assertEquals("I am not a developer", "Developer", employee.getJobTitle());}
    @Test
    public void testSalary (){
        Employee employee = new Employee();
        double salary = 7000.00;
        employee.setSalary(7000.00);
        assertEquals("I have another salary",salary, employee.getSalary(),0);
    }
}