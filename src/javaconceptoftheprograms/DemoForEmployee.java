package javaconceptoftheprograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {

	int id;

	String name;

	int age;

	String gender;

	String department;

	int yearOfJoining;

	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
				+ department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
	}
}

public class DemoForEmployee {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "Venu", 27, "male", "IT", 2021, 10000.00));
		employeeList.add(new Employee(2, "Gopal", 47, "male", "Networking", 2022, 100003.00));
		employeeList.add(new Employee(3, "Manisha", 87, "female", "Operations", 1998, 1000091.00));
		employeeList.add(new Employee(4, "Pruthvi", 17, "male", "IT", 2012, 100010.00));
		
		//How do you get the number of employees in each department if you have given a list of employees?
		

		// Given a list of employees, get the details of the most youngest employee in
		// the organization?
		Optional<Employee> em = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		System.out.println(em);

		// Given a list of employees, how do you find out who is the senior most
		// employee in the organization?
		Optional<Employee> collect5 = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
		System.out.println(collect5);

		// Write the Java 8 code to get the average age of each department in an
		// organization?
		Map<String, Double> collect4 = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getAge)));
		System.out.println(collect4);

		// Write a Java 8 code to get the details of highest paid employee in the
		// organization from the given list of employees?
		Optional<Employee> collect3 = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println(collect3);

		// Given a list of employees, find out the average salary of male and female
		// employees?
		Map<String, Double> collect2 = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(collect2);

		// Given a list of employees, write a Java 8 code to count the number of
		// employees in each department?
		Map<String, Long> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(collect);
	}

}
