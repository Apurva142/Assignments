package assignment;

public class Assignment10_ArraysAndLoops {

	public static void main(String[] args) {
		int[] values= {12 ,34,11,36,87,98,93};
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		int thirdLargest=Integer.MIN_VALUE;
		
		for(int num:values) {
			if (num>largest) {
				thirdLargest=secondLargest;
				secondLargest=largest;
				largest=num;
			}
			else if (num>secondLargest && num<largest) {
				thirdLargest = secondLargest;
                secondLargest = num;
			}
			else if (num>thirdLargest && num<secondLargest) {
				thirdLargest=num;
			}
		}
		
		System.out.println("Second Largest number is "+secondLargest);
		System.out.println("Third Largest number is "+thirdLargest);
	}

}
