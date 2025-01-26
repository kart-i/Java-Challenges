package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateEmployees {
	
	ArrayList<Employee> employeeList = new ArrayList<>();
	
	public void createEmployee(String name, int age, int id) {
		
		Employee empl = new Employee(name,age,id);
		
		
		employeeList.add(empl);
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.nextLine();
		int age = scan.nextInt();
		int id = scan.nextInt();
		scan.close();
		
		CreateEmployees obj = new CreateEmployees();
		obj.createEmployee(name, age, id);
		
		for(Employee value:obj.employeeList) {
			System.out.println(value);
		}
		
	}

}
