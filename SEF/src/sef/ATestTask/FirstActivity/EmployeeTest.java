package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import sef.ATestTask.ThirdActivity.CustomExceptionActivity;

public class EmployeeTest extends TestCase {

    //TODO 1 try to get 100% of test coverage
    //Example

    private Employee employee;

    protected void setUp() throws Exception {
        employee = new Employee();
    }

    public void testSetAndGetFirstNameCreatedProperly() {
        String testFirstName = "Jana";
        assertNull(employee.getFirstName());
        try {
            employee.setFirstName(testFirstName);
        } catch (CustomExceptionActivity customExceptionActivity) {
            customExceptionActivity.printStackTrace();
        }
        assertEquals(testFirstName, employee.getFirstName());
    }


    public void testSetAndGetSecondNameCreatedProperly() {
        String testSecondName = "Logunova";
        assertNull(employee.getSecondName());
        employee.setSecondName(testSecondName);
        assertEquals(testSecondName, employee.getSecondName());
    }

    public void testSetAndGetAge() {
        int testAge = 30;
      //  assertNull(employee.getAge());
        employee.setAge(testAge);
        assertEquals(testAge, employee.getAge());
    }

    public void testSetAndGetId() {
        int testId = 10;
        // assertNull(employee.getEmpID());
        employee.setEmpID(testId);
        assertEquals(testId, employee.getEmpID());
    }

    public void testSetAndGetJobTitle() {
        String testJobTitle = "Tester";
        assertNull(employee.getJobTitle());
        employee.setJobTitle(testJobTitle);
        assertEquals(testJobTitle, employee.getJobTitle());
    }

    public void testSetAndGetCompanyName() {
        String testCompanyName = "Accenture";
        assertNull(employee.getCompanyName());
        employee.setCompanyName(testCompanyName);
        assertEquals(testCompanyName, employee.getCompanyName());
    }

    public void testSetAndGetSalary() {
        double testSalary = 100000.0;
        // assertNull(employee.getSalary());
        employee.setSalary(testSalary);
        assertEquals(testSalary, employee.getSalary());
    }
}