package sef.ATestTask.FirstActivity;


import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {package sef.ATestTask.FirstActivity;
import junit.framework.TestCase;
import org.junit.Test;
import  static org.junit.Assert.assert Equals;
    public class EmployeeTest extends Test {
        private Employee employeeT;

        protected void setUp() throws Exception {
            employeeT = new Employee();
        }

        //TODO 1 try to get 100% of test coverage
//Example
        public void testSetAndGetCompanyName() {
            String testCName = "";
            assertEquals(employeeT.getCompanyName());
            String CName = "";
            employeeT.setCompanyName(CName);
            assertEquals("Unknown", employeeT.getCompanyName());
            CName = "Selga";
            employeeT.setCompanyName(CName);
            assertEquals(CName, employeeT.getCompanyName());
        }

        public void testSetAndGetSalary() {
            double testSalary = 5300.00;
            employeeT.setSalary(testSalary);
            assertEquals(3000.0, employeeT.getsalary(), 0);
        }

        public void testEmployeeId() {
            int testId = 4;
            employeeT.setEmpId(testId);
            assertEquals(testId, employeeT.getEmpId());
// assertEquals(" The product with ID: 10 and name: magazine has price: 12,5 and
            desription:
            productdescription
// product.getProductInformation());
// public Employee getEmployeeT() {return employeeT;}
//
// public void setEmployeeT(Employee employeeT) {this.employeeT = employeeT;}
        }
    }
