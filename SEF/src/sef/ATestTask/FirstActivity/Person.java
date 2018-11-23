package sef.ATestTask.FirstActivity;


public class Person {

//TODO 1 Implement Person Attributes

	protected int age;
	private String firstName;
	private String secondName;

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age, String title, double salary) {
		this.firstName = "Unknown";
		this.secondName = "Unknown";
		this.age = 0;
	}

	public Person() { }

	// getter for and setters String firstName
	public String getFirstName() { return firstName;}

	public void setFirstName(String firstName) {
		if (!firstName.equals("")) this.firstName = firstName;
		else this.firstName = "Unknown";
	}

	// getter and setters S for int age
	public int getAge() {
		return age;
	}

	// setter and getters for int age
	public void setAge(int age) {
		this.age = age;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		if(!secondName.equals(""))this.secondName =secondName;
		else this.firstName="Unknown";
}
	//TODO 2 add all person info into announce() method
	public String announce() {
		return "Employee name and surname:  " + getFirstName() + getSecondName() + ", his/her age is: " + age;

	}
}

