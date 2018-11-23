package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class EmployeeTest extends TestCase {
    Employee employee = new Employee();
    //TODO 1 try to get 100% of test coverage
    //Example

    public void testcheckEmployeeCreatedProperly() {
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }

    public void testSetAndGetEmpId() {
        int empId = 45;
        employee.setEmpId(empId);
        assertEquals(empId, employee.getEmpId());
    }

    public void testSetAndGetJobTitle() {
        String jobTitle = "Good";
        employee.setJobTitle(jobTitle);
        assertEquals(jobTitle, employee.getJobTitle());
    }

    public void testSetAndGetCompanyName() {
        String companyName = "hohoho";
        employee.setCompanyName(companyName);
        assertEquals(companyName, employee.getCompanyName());

    }

    public void testSetAndGetSalary() {
        double salary = 50.8;
        employee.setSalary(salary);
        assertEquals(salary, employee.getSalary());
    }
}