package practice;

public class Employee {
	
	String name;
	int age;
	int id;
	
	public Employee(String name,int age,int id){
		this.name = name;
		this.age = age;
		this.id = id;	
	}
	
	@Override
	public String toString() {
		return "Employee{name=" + name + ", age=" + age + ", id=" + id + "}";
	}

}
