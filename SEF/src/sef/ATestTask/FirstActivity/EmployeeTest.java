package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest extends TestCase {

    private Employee employee;

    protected void setUp() throws Exception {
        employee = new Employee();
    }

    //TODO 1 try to get 100% of test coverage
    //Example
    @Test

    //Name checked properly
    public void testSetAndGetName(){
        String testName = "Olja";
        employee.setFirstName(testName);
        assertEquals(testName, employee.getFirstName());
    }
    public void testSetAndGetNameBlankValue(){
        String testName = "";
        employee.setFirstName(testName);
        assertEquals(testName, employee.getFirstName());
    }


    //Test Employee Information
    public void testEmployeeInformation() {
        employee.setSalary(750);
        employee.setCompanyName("MMM");
        employee.setJobTitle("CEO");
        employee.setEmpId(2);
        assertEquals("Employee with id: 2 and job title: CEO Company name: MMMand salary is : 750.0", employee.getProductInrofmation() );
    }

    //Test age
    public void checkEmployeeAge() {
        int testAge = 15;
        employee.setAge(23);
        assertEquals(testAge, employee.getAge());
    }

    public void checkEmployeeAgeNegative() {
        int testAge = -15;
        employee.setAge(testAge);
        assertEquals(testAge, employee.getAge());
    }


    //Test job title
    public void testSetAndGetJobTitle() {
        Employee employee = new Employee();
        String testJobTitle = "CEO";
        employee.setJobTitle(testJobTitle);
        assertEquals(testJobTitle, employee.getJobTitle());
    }

    public void testJobTitleBlank(){
        String testJobTitleBlank = "";
        employee.setJobTitle(testJobTitleBlank);
        assertEquals(testJobTitleBlank, employee.getJobTitle());
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


    //Test Company Name
    public void testCompanyName() {
        String testCompanyName = "MMM";
        employee.setCompanyName(testCompanyName);
        assertEquals(testCompanyName, employee.getCompanyName());
    }

    public void testCompanyNameBlank(){
        String testName = "";
        employee.setCompanyName(testName);
        assertEquals("Unknown", employee.getCompanyName());
    }
}
