package assignment;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		
		//Below is the format to represent 1D array
		String[] Semisters = {"Sem1", "Sem2", "Sem3", "Sem4", "Sem5"};
		String[] Subjects = {"Subject1", "Subject2","Subject3", "Subject4","Subject5","Subject6"};
		
		String[] Sem1MarksStatus = {"Pass-78","Pass-85", "Fail-21","Pass-74","Pass-88","Pass-79" };
		String[] Sem2MarksStatus = {"Pass-82","Pass-77", "Pass-91","Fail-19","Fail-24","Pass-90" };
		String[] Sem3MarksStatus = {"Pass-88","Pass-81", "Pass-76","Fail-32","Pass-85","Pass-78" };
		String[] Sem4MarksStatus = {"Pass-91","Pass-73", "Fail-19","Pass-80","Pass-76","Pass-87" };
		String[] Sem5MarksStatus = {"Pass-86","Pass-88", "Pass-84","Pass-95","Pass-73","Pass-90" };
		
		String[] Sem1SubjectNames = {"Mathematics1","Physics","Chemistry","Computer Programming","Engineering Drawing","Basic Electrical Eng."};
		String[] Sem2SubjectNames = {"Mathematics II", "Mechanics","Environmental Sci.","Basic Electronics","Engineering Physics","Engineering Graphics"};
		String[] Sem3SubjectNames = {"Data Structures","Discrete Mathematics","Digital Electronics","Operating Systems","Signals and Systems","Object-Oriented Prog."};
		String[] Sem4SubjectNames = {"Algorithms","Computer Networks","Database Systems","Microprocessors","Communication Eng.","Software Engineering"};
		String[] Sem5SubjectNames = {"Probability Stats","Machine Learning","Compiler Design","Theory of Computation","Embedded Systems","Computer Graphics"};
		
		//Below is the format to represent 2D array
		String[][] SubAndMarksStatus = {Subjects,Sem1MarksStatus,Sem2MarksStatus,Sem3MarksStatus,Sem4MarksStatus,Sem5MarksStatus};
		String[][] SubNamesAndMarksStatus = {Sem1SubjectNames,Sem2SubjectNames,Sem3SubjectNames,Sem4SubjectNames,Sem5SubjectNames,Sem1MarksStatus,Sem2MarksStatus,Sem3MarksStatus,Sem4MarksStatus,Sem5MarksStatus};
		
		//Below is the format to represent 3D array
		String[][][] SubNoAndSubNamesAndMarksStatus = {SubAndMarksStatus,SubNamesAndMarksStatus};
 		
		System.out.println(SubNoAndSubNamesAndMarksStatus[1][1][3]);
		System.out.println(SubNoAndSubNamesAndMarksStatus[1][1][4]);
		
		System.out.println(SubNoAndSubNamesAndMarksStatus[0][4][2]);
		System.out.println(SubNoAndSubNamesAndMarksStatus[0][4][5]);
	}

}
