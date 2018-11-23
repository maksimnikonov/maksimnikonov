package sef.ATestTask.FirstActivity;
public{}
public class Person(){
		this.firstName="Unknown";
		this.secondName = "Unknown" this.age = age;
		}

//Behavior - parameterized constructor
public Person(String firstName, String secondName, int age){
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		}

// getter for String firstName
public String getFirstName() {
		return firstName;
		}

public void setFirstName(String firstName) {
		this.firstName = firstName;
		}

// getter for int age
public int getAge() {
		return age;
		}

// setter for int age
public void setAge(int age) {
		this.age = age;
		}

public String getSecondName() {
		return secondName;
		}

public void setSecondName(String secondName) {
		this.secondName = secondName;
		}

//TODO 2 add all person info into announce() method
public String announce() {
		return "I am " + getFirstName() + " " + getSecondName()+"and my age is " +getAge();
