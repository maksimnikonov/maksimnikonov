package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest  extends TestCase {
    private Employee employeeT;
    protected void setUp() throws Exception {
        employeeT = new Employee();
    }

    //TODO 1 try to get 100% of test coverage
    //Example

    public void testSetAndGetCompanyName() {
        String testCName = "";
       assertNull(employeeT.getCompanyName());
        String CName = "";
       employeeT.setCompanyName(CName);
       assertEquals("Unkown", employeeT.getCompanyName());
         CName = "abc";
       employeeT.setCompanyName(CName);
        assertEquals(CName, employeeT.getCompanyName());
    }

    public void testSetAndGetSalary() {
        double testSalary = 1000.00;
        employeeT.setSalary(testSalary);
        assertEquals(1000.0, employeeT.getsalary(), 0);
    }

    public void testEmployeeId() {
        int testId = 5;
        employeeT.setEmpId(testId);
        assertEquals(testId, employeeT.getEmpId());



//    public Employee getEmployeeT() {return employeeT;}
//
//    public void setEmployeeT(Employee employeeT) {this.employeeT = employeeT;}
    }
}


