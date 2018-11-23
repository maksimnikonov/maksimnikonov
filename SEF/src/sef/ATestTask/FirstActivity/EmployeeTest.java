package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class EmployeeTest extends TestCase {

    private Employee employee;

    protected void setUp() throws Exception {
        employee = new Employee();
    }

        //TODO 1 try to get 100% of test coverage
    //Example
    @Test
    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }
    @Test
    public void testSetAndGetNameEmpty() {
        String testFirstName = "";
        assertNull(employee.getFirstName());
        employee.setFirstName(testFirstName);
        assertEquals(testFirstName, employee.getFirstName());
        }
    @Test
    public void testSetAndGetNameFilled() {
        String testFirstName = "Alex";
        assertNull(employee.getFirstName());
        employee.setFirstName(testFirstName);
        assertEquals(testFirstName, employee.getFirstName());
    }
    @Test
    public void testSetAndGetSecondName() {
        String testSecondName = "Black";
        assertNull(employee.getSecondName());
        employee.setSecondName(testSecondName);
        assertEquals(testSecondName, employee.getSecondName());
    }
    @Test
    public void testSetAndGetSecondNameEmply() {
        String testSecondName = "";
        assertNull(employee.getSecondName());
        employee.setSecondName(testSecondName);
        assertEquals(testSecondName, employee.getSecondName());
    }
    @Test
    public void testSetAndGetAge(){
        int testAge = 10;
        employee.setAge(testAge);
        assertEquals(testAge, employee.getAge());
    }
    @Test
    public void testSetAndGetEmpId(){
        int testEmpId = 512356;
        employee.setEmpId(testEmpId);
        assertEquals(testEmpId, employee.getEmpId());
    }
    @Test
    public void testSetAndGetSalary(){
        double testSalary = 2000.57;
        employee.setSalary(testSalary);
        assertEquals(testSalary, employee.getSalary());
    }
    @Test
    public void testSetAndGetCompanyName() {
        String testCompanyName = "Accenture";
        assertNull(employee.getCompanyName());
        employee.setCompanyName(testCompanyName);
        assertEquals(testCompanyName, employee.getCompanyName());
    }
    @Test
    public void testSetAndGetJobTitle() {
        String testJobTitle = "Tester";
        assertNull(employee.getJobTitle());
        employee.setJobTitle(testJobTitle);
        assertEquals(testJobTitle, employee.getJobTitle());
    }



}