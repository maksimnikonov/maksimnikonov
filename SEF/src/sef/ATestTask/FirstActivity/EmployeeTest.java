package sef.ATestTask.FirstActivity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    Employee employee = new Employee();
    Employee employee1 = new Employee("Ivan","Drago",101,"Worker","Accenture", 350.6, 33);
    Person person1 = new Person("Kurt", "Cobain", 33);
    Student student = new Student();
    //TODO 1 try to get 100% of test coverage
    //Example
    @Test
    public void checkEmployeeCreatedProperly(){

        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
    }
    @Test
    public void testEmployeeAge(){

        employee.setAge(55);
        assertEquals(55,employee.getAge());
    }
    @Test
    public void testEmployeeID(){

        employee.setEmpId(101);
        assertEquals(101,employee.getEmpId());
    }
    @Test
    public void testEmployeeSalary(){

        employee.setSalary(545.6);
        assertEquals(545.6,employee.getSalary(),545.6);
    }
    @Test
    public void testJobTitle(){
        employee.setJobTitle("worker");
        assertEquals("worker", employee.getJobTitle());
    }
    @Test
    public void testCompanyName(){
        employee.setCompanyName("Accenture");
        assertEquals("Accenture", employee.getCompanyName());
    }
    @Test
    public void testEmployeeName(){
        String firstname = "Ivan";
        assertEquals(firstname,employee1.getFirstName());
    }
@Test
    public void testSecondname(){
        employee.setSecondName("Jeff");
        assertEquals("Jeff",employee.getSecondName());
}
@Test
    public void testPerson(){
        String firstname = "Kurt";
        assertEquals("Kurt",person1.getFirstName());
}
@Test
    public void testAnnounce(){
        employee1.setFirstName("Ivan");
        employee1.setSecondName("Drago");
        employee1.setCompanyName("Accenture");
        employee1.setJobTitle("Worker");
        employee1.setAge(33);
        assertEquals("I am Ivan Drago and my age is: 33 years old. I work as Worker in Accenture",employee1.announce());

}
@Test
    public void testSchoolName(){
        student.setSchoolName("VeA");
        assertEquals("VeA", student.getSchoolName());
}
}