package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    //TODO 1 try to get 100% of test coverage
    //Example
    @Test
    public void checkEmployeeCreatedProperly() {
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }
    @Test
    public void CheckEmployeeCeatedProperlySecondName(){
        Employee employee = new Employee();
        employee.setSecondName("Real");
        assertEquals("SN works" , "Real" , employee.getSecondName());
    }
    @Test
    public void checkEmployeeCreatedProperlyEmpID(){
        Employee employee = new Employee();
        employee.setEmpId(20);
        assertEquals("This is an error", 20 , employee.getEmpId());
    }
    @Test
    public void checkjobTitle(){
        Employee employee = new Employee();
        employee.setJobTitle("Lobster");
        assertEquals("jobTitle", "Lobster" , employee.getJobTitle());
    }
    @Test
    public void checkCreatedCompanyName(){
        Employee employee = new Employee();
        employee.setCompanyName("R2D2");
        assertEquals("Company name" , "R2D2" , employee.getCompanyName());
    }
    @Test
    public void checkCreatedSallary(){
        Employee employee = new Employee();
        employee.setSalary(100.3);
        assertEquals(100.3 , 100.3 , employee.getSalary());
    }

}