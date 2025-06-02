package assignment;

public class Assignment6_ArraysDatatypesOperators {

	public static void main(String[] args) {
		String[] names= {"Suresh","Mahesh","Naresh"}; 
		int[] marks= {75,80,82};
		
		int newMarks1=0;
		int newMarks2=1;
		int newMarks3=2;
		int numberToAdd=10;
		marks[newMarks1]+=numberToAdd;
		marks[newMarks2]+=numberToAdd;
		marks[newMarks3]+=numberToAdd;
		float avgMarks=(marks[newMarks1]+marks[newMarks1]+marks[newMarks1])/3f;
		
		System.out.println(names[0]+": "+ marks[newMarks1]);
		System.out.println(names[1]+": "+ marks[newMarks2]);
		System.out.println(names[2]+": "+ marks[newMarks3]);
		System.out.println("Average of Added Marks="+avgMarks);
	}

}
