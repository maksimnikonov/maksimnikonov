package sef.ATestTask.FirstActivity;


public class Person {

//1 Implement Person Attributes
	private String firstName;
	private String secondName;
	private int age;

	//Behavior - default constructor
	public Person(){
		this.firstName="Unknown";
		this.secondName = "Unknown";
		this.age = 0;
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age){
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	// getter for String firstName
	public String getFirstName() {
		if ((firstName.equals(""))) return  firstName = "Unknown";
		else {
			return firstName;
		}
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// getter for int age
	public int getAge() {
		if (age<0) return age = 0;
		else {
			return age;
		}
	}
	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}

	public String getSecondName() {
		if ((secondName.equals(""))) return secondName = "Unknown";
		else {
			return secondName;
		}
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	// add all person info into announce() method
	public String announce() {
		return "I am " + getFirstName() + " and my family name is " + getSecondName()+" with age "+getAge();
	}
}

