package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest extends TestCase {
    Employee employee = new Employee();
    Employee employeeA = new Employee("first Name", "second Name", 33, 23, "job Title", "company Name", 90.00);
            //String firstName, String secondName, int age, int empId, String jobTitle, String companyName, double salary);

    //TODO 1 try to get 100% of test coverage
    //Example

    public void testCheckEmployeeCreatedProperly(){
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }

    public void testSetAndGetSalary(){
        double testSalary = 100.00;
        employee.setSalary(testSalary);
        assertEquals(100.00, employee.getSalary());
    }

    public void testSetAndGetSalaryNegative(){
        double testSalaryNegative = -50.00;
        employee.setSalary(testSalaryNegative);
        assertEquals(0.0, employee.getSalary());
    }

    public void testSetAndGetCompanyName(){
        String testCompanyName = "abcd";
        assertNull(employee.getCompanyName());
        employee.setCompanyName(testCompanyName);
        assertEquals(testCompanyName, employee.getCompanyName());
    }

    public void testSetAndGetCompanyNameEmpty(){
        String testCompanyNameEmpty = " ";
        employee.setCompanyName(testCompanyNameEmpty);
        assertEquals("Unknown Company Name", employee.getCompanyName());
    }

    public void testSetAndGetJobTittle (){
        String testJobTitle = "qwert";
        assertNull(employee.getJobTitle());
        employee.setJobTitle(testJobTitle);
        assertEquals(testJobTitle, employee.getJobTitle());
    }

    public void testSetAndGetJobTittleEmpty(){
        String testJobTittleEmpty = " ";
        employee.setJobTitle(testJobTittleEmpty);
        assertEquals("Unknown Job Tittle", employee.getJobTitle());
    }

    public void testSetAndGetEmpID(){
        int testEmpID = 10;
        employee.setEmpId(testEmpID);
        assertEquals(10, employee.getEmpId());
    }

    public void testSetAndGetEmpIdNegative(){
        int testEmpIDNegative = -10;
        employee.setEmpId(testEmpIDNegative);
        assertEquals(0, employee.getEmpId());
    }

    public void testJobTittle(){
        String testJobTittleA = "job Title";
        assertEquals(testJobTittleA,employeeA.getJobTitle());
    }

    public void testCompanyName(){
        String testcompanyNameA = "company Name";
        assertEquals(testcompanyNameA, employeeA.getCompanyName());
    }

    public void testSalary(){
        double testSalaryA = 90.0;
        assertEquals(testSalaryA, employeeA.getSalary());
    }

    public void testEmpId(){
        int testEmpIdA = 23;
        assertEquals(testEmpIdA, employeeA.getEmpId());
    }

        public void testStringAnnounce(){
        employeeA.setFirstName("Three");
        employeeA.setSecondName("Threeee");
        employeeA.setAge(33);
        employeeA.setEmpId(333);
        employeeA.setJobTitle("manager333");
        employeeA.setCompanyName("Accenture");
        employeeA.setSalary(333.00);
        assertEquals("My name is Three Threeee and I am 33 years old. " +
                "I am work as manager333 in company Accenture.",
                employeeA.announce());
    }
}