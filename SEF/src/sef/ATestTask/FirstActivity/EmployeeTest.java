package sef.ATestTask.FirstActivity;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    //Example

    @Test
    public void checkEmployeeCreatedProperly() {
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }

    @Test
    public void testSetterAndGetterEmpId(){
        Employee employee = new Employee();
        int testEmpId = 3;
        employee.setEmpId(testEmpId);
        assertEquals("I am an error", testEmpId, employee.getEmpId());
    }

    @Test
    public void testSetterAndGetterJobTitle(){
        Employee employee = new Employee();
        String testJobTitle = "janitor";
        employee.setJobTitle(testJobTitle);
        assertEquals("I am an error", testJobTitle, employee.getJobTitle());
    }

    @Test
    public void testSetterAndGetterCompanyName(){
        Employee employee = new Employee();
        String testCompanyName = "Accenture";
        employee.setCompanyName(testCompanyName);
        assertEquals("I am an error", testCompanyName, employee.getCompanyName());
    }

    @Test
    public void testSetterAndGetterSalary(){
        Employee employee = new Employee();
        float testSalary = 33.0f;
        employee.setSalary(testSalary);
        assertEquals(testSalary, employee.getSalary(), 0);
    }

    @Test
    public void testSetterAndGetterNegativeSalary(){
        Employee employee = new Employee();
        float testSalary = -33.0f;
        employee.setSalary(testSalary);
        assertEquals(0.0, employee.getSalary(), 0);
    }

    @Test
    public void testSetterAndGetterNoCompanyName(){
        Employee employee = new Employee();
        String testCompanyName = "";
        employee.setCompanyName(testCompanyName);
        assertEquals("I am an error", "unknown", employee.getCompanyName());
    }

    @Test
    public void testSetterAndGetterNoJobTitle(){
        Employee employee = new Employee();
        String testJobTitle = "";
        employee.setJobTitle(testJobTitle);
        assertEquals("I am an error", "unknown", employee.getJobTitle());
    }

    @Test
    public void testEmpIdConstructor(){
        Employee employee = new Employee(1);
        assertEquals("I am an error", 1, employee.getEmpId());
    }

    @Test
    public void testEmpIdJobTitleConstructor(){
        Employee employee = new Employee(1, "janitor");
        assertEquals("I am an error", 1, employee.getEmpId());
        assertEquals("I am an error", "janitor", employee.getJobTitle());
    }

    @Test
    public void testEmpIdSalaryConstructor(){
        Employee employee = new Employee(1, 10.0);
        assertEquals("I am an error", 1, employee.getEmpId());
        assertEquals(10.0, employee.getSalary(), 0);
    }

    @Test
    public void testEmpIdJobTitleCompanyNameConstructor(){
        Employee employee = new Employee(1, "janitor", "Accenture");
        assertEquals("I am an error", 1, employee.getEmpId());
        assertEquals("I am an error", "janitor", employee.getJobTitle());
        assertEquals("I am an error", "Accenture", employee.getCompanyName());
    }

    @Test
    public void testEmpIdJobTitleSalaryConstructor(){
        Employee employee = new Employee(1, "janitor", 10.0);
        assertEquals("I am an error", 1, employee.getEmpId());
        assertEquals("I am an error", "janitor", employee.getJobTitle());
        assertEquals(10.0, employee.getSalary(), 0);
    }

    @Test
    public void testJobTitleSalaryConstructor(){
        Employee employee = new Employee("janitor", 10.0);
        assertEquals("I am an error", "janitor", employee.getJobTitle());
        assertEquals(10.0, employee.getSalary(), 0);
    }

    @Test
    public void testFNameSNameAgeJobTitleConstructor(){
        Employee employee = new Employee("John", "Doe", 33, "janitor");
        assertEquals("I am an error", "John", employee.getFirstName());
        assertEquals("I am an error", "Doe", employee.getSecondName());
        assertEquals("I am an error", 33, employee.getAge());
        assertEquals("I am an error", "janitor", employee.getJobTitle());
    }

    @Test
    public void testFNameSNameAgeSalaryConstructor(){
        Employee employee = new Employee("John", "Doe", 33, 10.0);
        assertEquals("I am an error", "John", employee.getFirstName());
        assertEquals("I am an error", "Doe", employee.getSecondName());
        assertEquals("I am an error", 33, employee.getAge());
        assertEquals(10.0, employee.getSalary(), 0);
    }

    @Test
    public void testEmpIdFNameSNameAgeConstructor(){
        Employee employee = new Employee(1, "John", "Doe", 33);
        assertEquals("I am an error", 1, employee.getEmpId());
        assertEquals("I am an error", "John", employee.getFirstName());
        assertEquals("I am an error", "Doe", employee.getSecondName());
        assertEquals("I am an error", 33, employee.getAge());
    }

    @Test
    public void testFullEmployeeConstructor(){
        Employee employee = new Employee(1, "janitor", "Accenture", 10.0);
        assertEquals("I am an error", 1, employee.getEmpId());
        assertEquals("I am an error", "janitor", employee.getJobTitle());
        assertEquals("I am an error", "Accenture", employee.getCompanyName());
        assertEquals(10.0, employee.getSalary(), 0);
    }

    @Test
    public void testEmpIdFNameSNameAgeSalaryConstructor(){
        Employee employee = new Employee(1, "John", "Doe", 33, 10.0);
        assertEquals("I am an error", 1, employee.getEmpId());
        assertEquals("I am an error", "John", employee.getFirstName());
        assertEquals("I am an error", "Doe", employee.getSecondName());
        assertEquals("I am an error", 33, employee.getAge());
        assertEquals(10.0, employee.getSalary(), 0);
    }

    @Test
    public void testEmpIdFNameSNameAgeJobTitleConstructor(){
        Employee employee = new Employee(1, "John", "Doe", 33, "janitor");
        assertEquals("I am an error", 1, employee.getEmpId());
        assertEquals("I am an error", "John", employee.getFirstName());
        assertEquals("I am an error", "Doe", employee.getSecondName());
        assertEquals("I am an error", 33, employee.getAge());
        assertEquals("I am an error", "janitor", employee.getJobTitle());
    }

    @Test
    public void testEmpIdFNameSNameAgeJobTitleCompanyNameConstructor(){
        Employee employee = new Employee(1, "John", "Doe", 33, "janitor", "Accenture");
        assertEquals("I am an error", 1, employee.getEmpId());
        assertEquals("I am an error", "John", employee.getFirstName());
        assertEquals("I am an error", "Doe", employee.getSecondName());
        assertEquals("I am an error", 33, employee.getAge());
        assertEquals("I am an error", "janitor", employee.getJobTitle());
        assertEquals("I am an error", "Accenture", employee.getCompanyName());
    }

    @Test
    public void testEmpIdFNameSNameAgeJobTitleSalaryConstructor(){
        Employee employee = new Employee(1, "John", "Doe", 33, "janitor", 10.0);
        assertEquals("I am an error", 1, employee.getEmpId());
        assertEquals("I am an error", "John", employee.getFirstName());
        assertEquals("I am an error", "Doe", employee.getSecondName());
        assertEquals("I am an error", 33, employee.getAge());
        assertEquals("I am an error", "janitor", employee.getJobTitle());
        assertEquals(10.0, employee.getSalary(), 0);
    }

    @Test
    public void testFullEmployeeInfo(){
        Employee employee = new Employee(1, "John", "Doe", 33, "janitor", "Accenture", 10.0);
        assertEquals("I am an error", 1, employee.getEmpId());
        assertEquals("I am an error", "John", employee.getFirstName());
        assertEquals("I am an error", "Doe", employee.getSecondName());
        assertEquals("I am an error", 33, employee.getAge());
        assertEquals("I am an error", "janitor", employee.getJobTitle());
        assertEquals("I am an error", "Accenture", employee.getCompanyName());
        assertEquals(10.0, employee.getSalary(), 0);
    }

    @Test
    public void testJobTitleCompanyName(){
        Employee employee = new Employee("janitor", "Accenture");
        assertEquals("I am an error", "janitor", employee.getJobTitle());
        assertEquals("I am an error", "Accenture", employee.getCompanyName());
    }

    @Test
    public void testJobTitleCompanyNameSalary(){
        Employee employee = new Employee("janitor", "Accenture", 10.0);
        assertEquals("I am an error", "janitor", employee.getJobTitle());
        assertEquals("I am an error", "Accenture", employee.getCompanyName());
        assertEquals(10.0, employee.getSalary(), 0);
    }

}