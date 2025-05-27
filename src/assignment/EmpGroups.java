package assignment;

public class EmpGroups {

	public static void main(String[] args) {
		//Creating object for the class Employees
		Employees obj = new Employees();
		
		//Storing variables from Emplopyees class in an array 
		String[] EmployeeNames = new String[3];
		EmployeeNames[0]=obj.EmployeeName1;
		EmployeeNames[1]=obj.EmployeeName2;
		EmployeeNames[2]=obj.EmployeeName3;
		
		String[] EmployeeIDs= new String[3];
		EmployeeIDs[0] = obj.EmployeeID1;
		EmployeeIDs[1] = obj.EmployeeID2;
		EmployeeIDs[2] = obj.EmployeeID3;
		
		//Printing the values 
		System.out.println("Employee Name:"+EmployeeNames[0]+","+"Employee ID:"+EmployeeIDs[0]);
		System.out.println("Employee Name:"+EmployeeNames[1]+","+"Employee ID:"+EmployeeIDs[1]);
		System.out.println("Employee Name:"+EmployeeNames[2]+","+"Employee ID:"+EmployeeIDs[2]);
	}

}
