package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EmployeeTest {

    //try to get 100% of test coverage
    //Example
    @Test
    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        employee.setSecondName("Test2");
        employee.setCompanyName("Accenture");
        employee.setSalary(100);
        assertEquals("Name is not correct", "Test1", employee.getFirstName());
        assertEquals("Surname is not correct", "Test2", employee.getSecondName());
        assertEquals("CompanyName is not correct", "Accenture", employee.getCompanyName());
        assertEquals("Salary is not correct", 100, employee.getSalary());
    }

}
