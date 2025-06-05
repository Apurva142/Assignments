package assignment;

public class Assignment7_ConditionalStatements {

	public static void main(String[] args) {
		String customerName = "John Doe";
		int creditScore = 720;
		float income = 55000.0f;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;

		if (creditScore>750) {

			System.out.println(customerName+":Your loan is approved.");			
		}
		else if(creditScore<750 && creditScore>650) {

			System.out.println("Additional checks need to be performed.");	
				if(income>=50000 ) {
					
					if(isEmployed=true) {

						if(debtToIncomeRatio<40) {
						System.out.println(customerName+":Your loan is approved.");	
						}
						if(debtToIncomeRatio>=40) {
						System.out.println("Your loan is denied as it didnot meet the Debit to income ratio criteria.");	
						}
					}
					if(isEmployed = false) {

					}
				}

		}
		else if (creditScore<650){
			System.out.println("Your loan is denied as credit score is less than 650.");
		}

	}

}
