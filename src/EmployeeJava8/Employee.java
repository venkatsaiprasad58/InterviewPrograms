package EmployeeJava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {


	public int id;
	public String Empname;
	public String Gender;
	public double Sal;
	public String Department;
	public String ReportingManager;

	public Employee(int id, String empname, String gender, double sal, String department, String reportingManger) {
		super();
		this.id = id;
		Empname = empname;
		Gender = gender;
		Sal = sal;
		Department = department;
		ReportingManager = reportingManger;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpname() {
		return Empname;
	}

	public void setEmpname(String empname) {
		Empname = empname;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public double getSal() {
		return Sal;
	}

	public void setSal(double sal) {
		Sal = sal;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}
	
	public String getReportingManager() {
		return ReportingManager;
	}

	public void setReportingManager(String reportingManager) {
		ReportingManager = reportingManager;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Empname=" + Empname + ", Gender=" + Gender + ", Sal=" + Sal + ", Department="
				+ Department + ", ReportingManager=" + ReportingManager + "]";
	}

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(1, "Venu", "male", 1200.00, "Java-AWS-Dept","Narender"));
		empList.add(new Employee(2, "Pruthvi", "male", 23990.00, "Java-MySQL-Dept","Narender"));
		empList.add(new Employee(3, "Anil", "male", 19898.00, "Java-Chace","Vanima"));
		empList.add(new Employee(4, "Siva", "male", 13112.00, "Java-Training-Dept","PhaniRatna"));
		empList.add(new Employee(5, "Chandra", "male", 13112.00, "Java-ReactJs-Dept","PhaniRatna"));
		empList.add(new Employee(6, "Phaniratna", "female", 78787.00, "Java-Sailpoint-Dept","Srinivas"));
		empList.add(new Employee(7, "Shirisha", "female", 76756.00, "BDM-Sales-Dept","Udaykumar"));
		
		Employee emp = new Employee();
		
//		List<Employee> collect3 = empList.stream().sorted().collect(Collectors.toList());
//		System.out.println(collect3);
		
		String orElse = Optional.ofNullable(emp).map(Employee::getEmpname).orElse("unknown");
		System.out.println(orElse);
		
//		Suppose I have an array list of employees with their name, department, salary, ID, and reporting Manager. 
//		Write Java 8 stream apis to group employees which have a salary higher
//		than average, and another one to group employees by their reporting manager
//		
		
		empList.stream().filter(x -> x.getSal()> empList.stream().collect(Collectors.summarizingDouble(Employee::getSal)).getAverage()).
		collect(Collectors.groupingBy(Employee::getReportingManager)).
		forEach((manager, erlist)->
		{
			System.out.print("-----"+manager+"++++++");
				erlist.forEach(System.out::println);
		});
		
		System.out.println("+++++++++++++");
		
		//Suppose I have an array list of employees with their name, department, salary, ID, and reporting Manager. 
		//Write Java 8 stream apis to group employees by their reporting manager
		Map<String, String> collect2 = empList.stream().collect(Collectors.toMap(Employee::getEmpname, Employee::getReportingManager));
		System.out.println(collect2);
		
		Map<String, List<Employee>> employeesByManager = empList.stream()
	            .collect(Collectors.groupingBy(Employee::getReportingManager));

	        // Print the grouped employees
	        employeesByManager.forEach((manager, empLists) -> {
	            System.out.println("Manager: " + manager);
	            empLists.forEach(System.out::println);
	        });
		
		
		//Suppose I have an array list of employees with their name, department, salary, ID, and reporting Manager. 
		//Write Java 8 stream apis to group employees which have a salary higher than average.
		List<Employee> list = empList.stream().filter(x -> x.getSal() > empList.stream().collect(Collectors.summarizingDouble(Employee:: getSal))
				.getAverage()).toList();
		System.out.println(list);
		
//		for (Employee list : empList) {
//			System.out.println(list);
//		}
		
		//// Count how many numbers in each department.
		 empList.stream().collect(Collectors.groupingBy(Employee:: getDepartment, Collectors.counting())).
		 forEach((K,V) -> System.out.println(K+ ":"+ V));
		 
		//System.out.println(collect2);
		
		
		
		
		//// Find 3rd highest sal.
		Optional<Employee> third =  empList.stream().sorted(Comparator.comparingDouble(Employee:: getSal).reversed()).skip(2).findFirst();
		System.out.println(third);
		
		//// Find Second Highest Sal Employee.
		Optional<Employee> first = empList.stream().sorted(Comparator.comparingDouble(Employee::getSal).reversed()).skip(1).findFirst();
        System.out.println(first);
		
		
		//// Lowest Sal Person.
        Optional<Employee> min = empList.stream().min(Comparator.comparingDouble(Employee:: getSal));
		System.out.println(min);
		
		double min2 = empList.stream().collect(Collectors.summarizingDouble(Employee:: getSal)).getMin();
		System.out.println(min2);
		

		//// High Sal Employee.
		Employee employee = empList.stream().max(Comparator.comparingDouble(Employee::getSal)).get();
		System.out.println(employee.getEmpname());

		double max = empList.stream().collect(Collectors.summarizingDouble(Employee::getSal)).getMax();
		System.out.println(max);

		// print avg Sal list
		OptionalDouble average = empList.stream().mapToDouble(Employee::getSal).average();
		System.out.println(average);

		Map<String, Double> collect = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSal)));
		System.out.println(collect);

		//// print the name of All Departments.
		empList.stream().map(Employee::getDepartment).forEach(System.out::println);

		//// Get All Males And Females In the List.
		empList.stream().collect(Collectors.groupingBy(x -> x.getGender(), Collectors.counting()))
				.forEach((K, V) -> System.out.println(K + ":" + V));

	}

	

}
