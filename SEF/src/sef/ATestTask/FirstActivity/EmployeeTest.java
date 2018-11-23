package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest extends TestCase {

    private Employee employeeT;
    private Person personT;

    protected void setUp() throws Exception {
        employeeT = new Employee();

        personT = new Person();
    }

    //TODO 1 try to get 100% of test coverage
    //Example

    public void testEmployeeId() {
        int testId = 5;
        employeeT.setEmpId(testId);
        assertEquals(testId, employeeT.getEmpId());
    }

    public void testSetAndGetJobTitle() {
        String testTitle = "";
        assertNull(employeeT.getJobTitle());
        employeeT.setJobTitle(testTitle);
        assertEquals("Unknown", employeeT.getJobTitle());
        testTitle = " developer ";
        employeeT.setJobTitle(testTitle);
        assertEquals(testTitle, employeeT.getJobTitle());
    }

    public void testSetAndGetCompanyName() {
        String testCName = "";
        assertNull(employeeT.getCompanyName());
        employeeT.setCompanyName(testCName);
        assertEquals("Unknown", employeeT.getCompanyName());
        testCName = "Accenture";
        employeeT.setCompanyName(testCName);
        assertEquals(testCName, employeeT.getCompanyName());
    }

    public void testSetAndGetSalary() {
        double testSalary = 1000.00;
        employeeT.setSalary(testSalary);
        assertEquals(1000.0, employeeT.getSalary(), 0);
    }

    public void testSetAndGetFName() {
        String testFName = "";
        assertNull(employeeT.getFirstName());
        employeeT.setFirstName(testFName);
        assertEquals("Unknown", employeeT.getFirstName());
        testFName = "Mark";
        employeeT.setCompanyName(testFName);
        assertEquals(testFName, employeeT.getFirstName());
    }

    public void testSetAndGetSecondName() {
        String testSName = "";
        assertNull(employeeT.getSecondName());
        employeeT.setSecondName(testSName);
        assertEquals("Unknown", employeeT.getSecondName());
        testSName = "Mark";
        employeeT.setSecondName(testSName);
        assertEquals(testSName, employeeT.getSecondName());
    }

    public void testStringToString() {
        employeeT.setEmpId(5);
        employeeT.setJobTitle("developer");
        employeeT.setCompanyName("Accenture");
        employeeT.setSalary(1000.00);
        employeeT.setFirstName("Mark");
        employeeT.setSecondName("Deen");

        assertEquals("Employee ID:5 name: Mark surname: Deen company name: Accenture salary: 1000.0",
                employeeT.toString());
    }

    public void testAnnounceToString() {
        employeeT.setEmpId(5);
        employeeT.setJobTitle("developer");
        employeeT.setCompanyName("Accenture");
        employeeT.setSalary(1000.00);
        employeeT.setFirstName("Mark");
        employeeT.setSecondName("Deen");

        assertEquals("Employee ID:5 name: Mark surname: Deen company name: Accenture salary: 1000.0",
                employeeT.toString1());
    }

    public Person getPersonT() {return personT;}

    public void setPersonT(Person personT) {this.personT = personT;}
}