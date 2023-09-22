package Assingment_MKT;

public class Assingment_21 {

	public static class Person {
	    private String name;
	    private int age;

	    // Constructor with no parameters
	    public Person() {
	        name = "Unknown";
	        age = 0;
	    }

	    // Constructor with name parameter
	    public Person(String name) {
	        this.name = name;
	        age = 0;
	    }

	    // Constructor with name and age parameters
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

	    public static void main(String[] args) {
	        Person person1 = new Person();
	        Person person2 = new Person("Hosen");
	        Person person3 = new Person("Jubaer", 33);

	        System.out.println("Person 1:");
	        person1.displayInfo();

	        System.out.println("Person 2:");
	        person2.displayInfo();

	        System.out.println("Person 3:");
	        person3.displayInfo();
	    }
	}

}
