package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Assignment_5_Collections {

	public static void main(String[] args) {
		//Now, By using collections store all the data into one single variable .and from that variable,
		//Print the data Supplier Name > Office Depot  from Product details table.

		List<Map<String,String>> AllStudentDetails= new ArrayList<Map<String,String>>();
		
		Map<String,String> Student1Details= new Hashtable<String,String>();
		Student1Details.put("Name", "John Doe");
		Student1Details.put("Age", "20");
		Student1Details.put("Gender", "Male");
		Student1Details.put("Roll Number", "SBA12345");
		Student1Details.put("Grade", "A++");
		Student1Details.put("Major", "Computer Science");
		Student1Details.put("GPA", "A3.8");
		Student1Details.put("Email", "John@example.com");
		Student1Details.put("PAN", "SDF123456");
		Student1Details.put("Address", "123 Elm St");
		
		Map<String,String> Student2Details= new Hashtable<String,String>();
		Student2Details.put("Name", "Jane");
		Student2Details.put("Age", "21");
		Student2Details.put("Gender", "Female");
		Student2Details.put("Roll Number", "SBA12645");
		Student2Details.put("Grade", "B+");
		Student2Details.put("Major", "Maths");
		Student2Details.put("GPA", "A3.5");
		Student2Details.put("Email", "Jane@example.com");
		Student2Details.put("PAN", "REW126656");
		Student2Details.put("Address", "456 oak St");
		
		Map<String,String> Student3Details= new Hashtable<String,String>();
		Student3Details.put("Name", "Mike Brown");
		Student3Details.put("Age", "22");
		Student3Details.put("Gender", "Male");
		Student3Details.put("Roll Number", "SBA17745");
		Student3Details.put("Grade", "A+");
		Student3Details.put("Major", "Physics");
		Student3Details.put("GPA", "A3.9");
		Student3Details.put("Email", "Mike@example.com");
		Student3Details.put("PAN", "TYR199456");
		Student3Details.put("Address", "789 Pine St");
		
		AllStudentDetails.add(Student1Details);
		AllStudentDetails.add(Student2Details);
		AllStudentDetails.add(Student3Details);
		
		List<Map<String,String>> AllEmployeeDetails= new ArrayList<Map<String,String>>();
		Map<String,String> EmpDetails1= new Hashtable<String,String>();
		EmpDetails1.put("Emp ID", "E001");
		EmpDetails1.put("Name", "Alice green");
		EmpDetails1.put("Age", "30");
		EmpDetails1.put("Gender", "Female");
		EmpDetails1.put("Department", "Engineering");
		EmpDetails1.put("Position", "Software Engineering");
		EmpDetails1.put("Salary", "75K Pound");
		EmpDetails1.put("Email", "Alice@example.com");
		EmpDetails1.put("PAN", "SDF199456");
		
		Map<String,String> EmpDetails2= new Hashtable<String,String>();
		EmpDetails2.put("Emp ID", "E002");
		EmpDetails2.put("Name", "Bob");
		EmpDetails2.put("Age", "35");
		EmpDetails2.put("Gender", "Male");
		EmpDetails2.put("Department", "Engineering");
		EmpDetails2.put("Position", "Marketing Manager");
		EmpDetails2.put("Salary", "85K Pound");
		EmpDetails2.put("Email", "Bob@example.com");
		EmpDetails2.put("PAN", "REW199456");
		
		Map<String,String> EmpDetails3= new Hashtable<String,String>();
		EmpDetails3.put("Emp ID", "E002");
		EmpDetails3.put("Name", "Bob");
		EmpDetails3.put("Age", "35");
		EmpDetails3.put("Gender", "Male");
		EmpDetails3.put("Department", "Engineering");
		EmpDetails3.put("Position", "Marketing Manager");
		EmpDetails3.put("Salary", "85K Pound");
		EmpDetails3.put("Email", "Bob@example.com");
		EmpDetails3.put("PAN", "REW199456");
		
		AllEmployeeDetails.add(EmpDetails1);
		AllEmployeeDetails.add(EmpDetails2);
		AllEmployeeDetails.add(EmpDetails3);
		
		List<Map<String,String>> AllProductDetails= new ArrayList<Map<String,String>>();
		Map<String,String> Product1Details= new Hashtable<String,String>();
		Product1Details.put("ProductID", "P001");
		Product1Details.put("Name", "Laptop");
		Product1Details.put("Category", "Electronics");
		Product1Details.put("Price", "12k Pounds");
		Product1Details.put("Stock Quantity", "Not available");
		Product1Details.put("Supplier", "Tech Supplier");
		Product1Details.put("Warrenty", "2 Years");
		Product1Details.put("Rating", "4.5 Star");
		Product1Details.put("Manufacturing Date", "Aug 2023");
		Product1Details.put("Expiry Date", "Aug 2028");
		
		Map<String,String> Product2Details= new Hashtable<String,String>();
		Product2Details.put("ProductID", "P002");
		Product2Details.put("Name", "Desk Chair");
		Product2Details.put("Category", "Furniture");
		Product2Details.put("Price", "150k Pounds");
		Product2Details.put("Stock Quantity", "2");
		Product2Details.put("Supplier", "Office Deposit");
		Product2Details.put("Warrenty", "1 Years");
		Product2Details.put("Rating", "4 Star");
		Product2Details.put("Manufacturing Date", "Sep 2024");
		Product2Details.put("Expiry Date", "N/A");
		
		Map<String,String> Product3Details= new Hashtable<String,String>();
		Product3Details.put("ProductID", "P003");
		Product3Details.put("Name", "Coffee Maker");
		Product3Details.put("Category", "Kitchen");
		Product3Details.put("Price", "75 Pounds");
		Product3Details.put("Stock Quantity", "200");
		Product3Details.put("Supplier", "Kitchen World");
		Product3Details.put("Warrenty", "6 Months");
		Product3Details.put("Rating", "4.2 Star");
		Product3Details.put("Manufacturing Date", "Jan 2025");
		Product3Details.put("Expiry Date", "Jan 2027");
		
		AllProductDetails.add(Product1Details);
		AllProductDetails.add(Product2Details);
		AllProductDetails.add(Product3Details);
		
		Map<String,List<Map<String,String>>> AllValues = new HashMap<>();
		AllValues.put("Students",AllStudentDetails);
		AllValues.put("Employees",AllEmployeeDetails);
		AllValues.put("Product",AllProductDetails);
		
		System.out.println(AllValues.get("Product").get(1).get("Supplier"));
	}

}
