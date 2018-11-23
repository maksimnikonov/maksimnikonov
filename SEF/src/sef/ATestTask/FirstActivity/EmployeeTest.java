package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    //TODO 1 try to get 100% of test coverage
    //Example
    Employee employee = new Employee();

    @Test
    public void checkEmployeeFirstName() {

        employee.setFirstName("Jana");
        assertEquals("I am an error message", "Jana", employee.getFirstName());
    }

    @Test
    public void checkEmployeeSecondName() {
        employee.setSecondName("Silina");
        assertEquals("I am an error message", "Silina", employee.getSecondName());
    }

    @Test
    public void checkEmployeeAge() {
        employee.setAge(23);
        assertEquals("I am an error message", 23, employee.getAge());

    }

    @Test
    public void checkEmployeeId() {
        employee.setEmpId(90);
        assertEquals("I am an error message", 90, employee.getEmpId());
    }

    @Test
    public void checkEmployeeJobTitle() {
        employee.setJobTitle("Developer");
        assertEquals("I am an error message", "Developer", employee.getJobTitle());
    }

    @Test
    public void checkEmployeeCompanyName() {
        employee.setCompanyName("LMT");
        assertEquals("I am an error message", "LMT", employee.getCompanyName());
    }

    @Test
    public void checkEmployeeSalary() {
        employee.setSalary(1200.00);
        assertEquals("I am an error message", 1200, employee.getSalary(),0);

    }

    @Test
    public void checkConstructorOne() {
        Employee employee = new Employee (95, "Manager", "HM", 700);
        assertEquals("I am an error message", 95, employee.getEmpId());
        assertEquals("I am an error message", "Manager", employee.getJobTitle());
        assertEquals("I am an error message", "HM", employee.getCompanyName());
        assertEquals("I am an error message", 700, employee.getSalary(),0);
    }

    @Test
    public void checkConstructorTwo() {
        Employee employee = new Employee ("Josh", "Allans", 25, 95, "Manager", "HM", 700);
        assertEquals("I am an error message", "Josh", employee.getFirstName());
        assertEquals("I am an error message", "Allans", employee.getSecondName());
        assertEquals("I am an error message", 25, employee.getAge());
        assertEquals("I am an error message", 95, employee.getEmpId());
        assertEquals("I am an error message", "Manager", employee.getJobTitle());
        assertEquals("I am an error message", "HM", employee.getCompanyName());
        assertEquals("I am an error message", 700, employee.getSalary(),0);
    }

    @Test
    public void checkConstructorThree() {
        Employee employee = new Employee ("Josh", "Allans", 25, "Manager", "HM");
        assertEquals("I am an error message", "Josh", employee.getFirstName());
        assertEquals("I am an error message", "Allans", employee.getSecondName());
        assertEquals("I am an error message", 25, employee.getAge());
        assertEquals("I am an error message", "Manager", employee.getJobTitle());
        assertEquals("I am an error message", "HM", employee.getCompanyName());

            }

    //@Test
    //public void checkEmployeeAnnounce(){
        //employee.setFirstName("Jana");
       // employee.setSecondName("Ivanova");
     //   employee.setAge(20);
      //  employee.setEmpId(90);
       // employee.setJobTitle("Teacher");
     //  employee.setCompanyName("School");
       // employee.setSalary(700);
      //  assertEquals(" ", employee.announce());
    //}
}