package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest extends TestCase {


    private Employee employee;

    protected void setup() throws Exception {
        employee = new Employee();
    }
    //TODO 1 try to get 100% of test coverage

    //Name checked properly
    public void testSetAndGetName() {
        String testName = "Irina";
        employee.setFirstName(testName);
        assertEquals(testName, employee.getFirstName());
    }

    public void testSetAndGetNameBlankValue() {
        String testName = "";
        employee.setFirstName(testName);
        assertEquals(testName, employee.getFirstName());
    }


    //Test Employee Information
    public void testEmployeeInformation() {
        employee.setSalary(1000);
        employee.setCompanyName("CCC");
        employee.setJobtitle("CTO");
        employee.setEmpId(2);
        assertEquals(1000, employee.getSalary());
    }


    {
        employee.setSalary(3000);
        employee.setCompanyName("DCC");
        employee.setJobtitle("CEO");
        employee.setEmpId(3);
        assertEquals(3000, employee.getSalary());
    }
    //Test age
    public void checkEmployeeAge() {
        int testAge = 15;
        employee.setAge(23);
        assertEquals(testAge, employee.getAge());
    }

    {
        int testAge = 25;
        employee.setAge(23);
        assertEquals(testAge, employee.getAge());
    }
    {
        employee.setSalary(-10000);
        employee.setCompanyName("DCC");
        employee.setJobtitle("CEO");
        employee.setEmpId(3);
        assertEquals(-10000, employee.getSalary());
    }
    public void checkEmployeeAgeNegative() {
        int testAge = -15;
        employee.setAge(testAge);
        assertEquals(testAge, employee.getAge());
    }


    //Test job title
    public void testSetAndGetJobTitle() {
        Employee employee = new Employee();
        String testJobTitle = "CTO";
        employee.setJobtitle("Manager");
        assertEquals("Manager", employee.getJobtitle());
    }

    public void testJobTitleBlank() {
        String testJobTitleBlank = "";
        employee.setJobtitle(testJobTitleBlank);
        assertEquals(testJobTitleBlank, employee.getJobtitle());
    }

    //Test employee ID
    public void testEmployeetId() {
        int testId = 15;
        employee.setEmpId(testId);
        assertEquals(testId, employee.getEmpId());
    }

    public void testEmployeeIdBlank() {
        int testEmployeeID = 15;
        employee.setEmpId(testEmployeeID);
        assertEquals(testEmployeeID, employee.getEmpId());
    }
    {
        public void testEmployeeIdBlank(1) {
        int testEmployeeID = 15;
        employee.setEmpId(3);
        assertEquals(3, employee.getEmpId());}
}

    //Test Company Name
    public void testCompanyName() {
        String testCompanyName = "CCC";
        employee.setCompanyName(testCompanyName);
        assertEquals("CCC", employee.getCompanyName());
    }

    public void testCompanyNameBlank() {
        String testName = "";
        employee.setCompanyName(testName);
        assertEquals("Unknown", employee.getCompanyName());
