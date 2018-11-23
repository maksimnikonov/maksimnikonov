package sef.ATestTask.FirstActivity;


public class Person {

//TODO 1 Implement Person Attributes

    public String FirstName;
    public String SecondName;
    public int Age;

	//Behavior - default constructor
	public Person(){
	    this.FirstName("John");
		this.SecondName("Andrew");
		this.Age(10);
	}
    public void Age(int i) {
    }
    public void FirstName(String john) {
    }
    public void SecondName(String Andrew){
    }


    //Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age){
		this.setFirstName("John");
		this.setSecondName("Brethauer");
		this.setAge(29);
	}

	// getter for String firstName
	public String getFirstName() { return FirstName; }

	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}

	// getter for int age
	public int getAge() {
		return Age;
	}

	// setter for int age
	public void setAge(int age) { this.Age = age; }

	public String getSecondName() {
		return SecondName;
	}

	public void setSecondName(String secondName) {
		this.SecondName = secondName;
	}

	//TODO 2 add all person info into announce() method
	public void announce(){
		System.out.println("I am " + getFirstName() + " my last name is " + getSecondName()+ " I am " + getAge() + " old ");
	}
}

