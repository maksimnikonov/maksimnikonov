package sef.ATestTask.FirstActivity;

import sun.util.resources.cldr.en.TimeZoneNames_en_Dsrt;

import java.util.*;
import java.util.Scanner;

public class FirstActivity {

    public static void main(String[] args) {

        //		System.out.println() result
        Map map = new HashMap();

        map.put(0, new Employee("John", "Toe", 23, 100.00));
        map.put(1, new Employee("Stan", "Pee", 95, 10000.00));
        map.put(2, new Employee("Tony", "Stank", 40, 503.00));
        map.put(3, new Employee("Donald", "Hump", 50, 666.00));
        map.put(4, new Employee("Mao", "Tedong", 80, 3.00));
        map.put(5, new Employee("Arthur", "Forgan", 35, 50.00));

        System.out.println("Before sorting:");
        for (int i = 0; i < map.size(); i++) {
            System.out.println("Name: " + ((Employee) map.get(i)).getFirstName() + " " + ((Employee) map.get(i)).getSecondName() + " | Age: " +
                    ((Employee) map.get(i)).getAge() + " | Salary: " + ((Employee) map.get(i)).getSalary());
        }

        // sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //		System.out.println() result
        //Tried Something, dunno if it was in the right direction but didn't finish it :(
        /**
        sort(map);
        System.out.println("After Sorting:");
        for (int i = 0; i < map.size(); i++) {
            System.out.println("Name: " + ((Employee) map.get(i)).getFirstName() + " " + ((Employee) map.get(i)).getSecondName() + " | Age: " +
                    ((Employee) map.get(i)).getAge() + " | Salary: " + ((Employee) map.get(i)).getSalary());
        }
         **/

        // use announce()
        // than make them Student
        // use announce()
        // than make them Employee
        // use announce()
        //		System.out.println() result
        Employee e = new Employee();
        e.setFirstName("John");
        e.setSecondName("Doe");
        e.setAge(33);
        e.setEmpId(1);
        e.setJobTitle("CEO");
        e.setCompanyName("Accenture");
        e.setSalary(9001.00);
        System.out.println("--------------------");
        e.announce();
        System.out.println("--------------------");
        Person p1 = e;
        p1.announce();
        System.out.println("--------------------");

        Student s = new Student();
        s.setSchoolName("Accenture Bootcamp");
        s.announce();
        System.out.println("--------------------");
        Person p2 = s;
        p2.announce();

        // for example some employee change his work
        change (map);
        System.out.println("List after edit:");
        for (int i = 0; i < map.size(); i++) {
            System.out.println("Name: " + ((Employee) map.get(i)).getFirstName() + " " + ((Employee) map.get(i)).getSecondName() + " | Age: " +
                    ((Employee) map.get(i)).getAge() + " | Salary: " + ((Employee) map.get(i)).getSalary());
        }


    }

    static void change (Map map){
        Scanner scanner = new Scanner(System.in);
        int answer;
        int mSize = map.size();
        String fName;
        String sName;
        int age;
        double salary;
        for (int i = 0; i < mSize; i++){
            System.out.print("Change " + (((Employee) map.get(i)).getFirstName()) + " " + (((Employee) map.get(i)).getSecondName()) + "? Yes (1), No (0)");
            answer = scanner.nextInt();
            if(answer == 1){
                System.out.print("Input First Name: ");
                fName = scanner.nextLine(); //Yeah... No idea why it works with two "fName = scanner.nextLine()" lines and not with only 1 :/
                fName = scanner.nextLine();
                System.out.print("Input Second name: ");
                sName = scanner.nextLine();
                System.out.print("Input Age: ");
                age = scanner.nextInt();
                System.out.print("Input Salary: ");
                salary = scanner.nextDouble();
                map.put(i, new Employee(fName, sName, age, salary));
            }
        }

    }
    /**
    static void sort(Map map) {
        int size = map.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (((Employee) map.get(j)).getSalary() > ((Employee) map.get(j + 1)).getSalary()) {
                    map.put("temp", ((Employee) map.get(j)).getFirstName() + ((Employee) map.get(j)).getSecondName() + ((Employee) map.get(j)).getAge()
                            + ((Employee) map.get(j)).getSalary());
                    map.put(j, ((Employee) map.get(j+1)).getFirstName() + ((Employee) map.get(j+1)).getSecondName() + ((Employee) map.get(j+1)).getAge()
                            + ((Employee) map.get(j+1)).getSalary());
                    map.put(j+1, ((Employee) map.get("temp")).getFirstName() + ((Employee) map.get("temp")).getSecondName() + ((Employee) map.get("temp")).getAge()
                            + ((Employee) map.get("temp")).getSalary());
                }
            }
        }
    }**/
}
