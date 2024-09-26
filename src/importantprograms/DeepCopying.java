package importantprograms;

import java.util.ArrayList;
import java.util.List;

class Employee implements Cloneable {
	String name;
	List<String> skills;

	public Employee(String name, List<String> skills) {
		this.name = name;
		this.skills = skills;
	}

	// Deep copy method
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee cloned = (Employee) super.clone();
		cloned.skills = new ArrayList<>(this.skills);
		return cloned;
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", skills=" + skills + '}';
	}
}

public class DeepCopying {
	public static void main(String[] args) throws CloneNotSupportedException {
		List<String> skills = new ArrayList<>();
		skills.add("Java");
		skills.add("Spring");

		Employee originalEmployee = new Employee("John Doe", skills);
		Employee deepCopyEmployee = (Employee) originalEmployee.clone();

		System.out.println("Original Employee: " + originalEmployee);
		System.out.println("Deep Copy Employee: " + deepCopyEmployee);

		// Modifying the original employee's skills
		originalEmployee.skills.add("Hibernate");

		System.out.println("After modifying the original employee's skills:");
		System.out.println("Original Employee: " + originalEmployee);
		System.out.println("Deep Copy Employee: " + deepCopyEmployee);
	}

}
