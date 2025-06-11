package assignment;

public class Assignment14 {


	public float powerCalculation(double x, int n) {
		return (float) Math.pow(x, n);
	}

	public static void main(String[] args) {
		Assignment14 obj = new Assignment14();
		
		System.out.printf("%.5f%n",obj.powerCalculation(2.00000, 10));
		System.out.printf("%.5f%n",obj.powerCalculation(2.10000, 3));
		System.out.printf("%.5f%n",obj.powerCalculation(2.00000, -2));


	}

}
