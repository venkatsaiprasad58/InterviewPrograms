package javaconceptoftheprograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Student {

	private String name;
	private int id;
	private String subject;
	private double percentage;

	public Student(String name, int id, String subject, double percentage) {
		this.name = name;
		this.id = id;
		this.subject = subject;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", subject=" + subject + ", percentage=" + percentage + "]";
	}

}

public class DemoForStudent {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Venu", 1, "java", 80.0));
		studentList.add(new Student("Gopal", 2, "Python", 90.0));
		studentList.add(new Student("Reddy", 3, "SQL", 40.1));
		studentList.add(new Student("Mani", 4, "NoSql", 88.1));
		studentList.add(new Student("Manisha", 4, "java", 91.1));

		// How do you get the students grouped by subject from the given list of
		// students?
		
		Map<String, List<Student>> collect2 = studentList.stream().collect(Collectors.groupingBy(Student::getSubject));
        System.out.println(collect2);
		
		// How do you get total number of students from the given list of students?
		Long count = studentList.stream().collect(Collectors.counting());
		System.out.println(count);

		// Given a list of students, write a Java 8 code to partition the students
		// who got above 60% from those who didn’t?
		studentList.stream().filter(x -> x.getPercentage() > 60.0).collect(Collectors.toList())
				.forEach(System.out::println);

		// Given a list of students, write a Java 8 code to get the names of top 3
		// performing students?
		System.out.println("--------");
		studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3)
				.forEach(System.out::println);

		System.out.println("--------");
		// Given a list of students, how do you get the name and percentage of each
		// student?
		studentList.stream().map(x -> x.getPercentage() + " " + x.getName()).forEach(System.out::println);

		System.out.println("--------");
		// Given a list of students, write a Java 8 code to get highest, lowest and
		// average percentage of students?
		Optional<Student> max = studentList.stream().max(Comparator.comparingDouble(Student::getPercentage));
		System.out.println(max);

		DoubleSummaryStatistics collect = studentList.stream()
				.collect(Collectors.summarizingDouble(Student::getPercentage));

		double min2 = collect.getMin();

		System.out.println(collect);

		double max2 = collect.getMax();

		double average = collect.getAverage();

		System.out.println("+checking+" + min2 + "," + max2 + "," + average);

	}

}
