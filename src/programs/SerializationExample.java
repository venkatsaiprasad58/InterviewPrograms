package programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample {

	public static void main(String[] args) {

		EmployeeDetails employeeDetails = new EmployeeDetails(100, "Venu", "4-32/kurnool");
		EmployeeDetails.city = "Kadapa";

		String filename = "C:\\Users\\va21132\\Desktop\\SerializationExample\\Ojas.txt";

		try {
			FileOutputStream fileout = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(employeeDetails);

			out.close();
			fileout.close();

			System.out.println("File serialized");

			EmployeeDetails empDetailsOne = null;

			FileInputStream fileinput = new FileInputStream(filename);
			ObjectInputStream input = new ObjectInputStream(fileinput);
			empDetailsOne = (EmployeeDetails) input.readObject();

			// empDetailsOne
            input.close();
            fileinput.close();
            
			System.out.println(empDetailsOne);

			System.out.println("Deserialized ");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
class EmployeeDetails implements Serializable {

	private int id;
	private String name;
	transient String address;
	static  String city;

	public EmployeeDetails(int id, String name, String address) {

		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", address=" + address + ", city = "+ city + "]";
	}

	

	

}
