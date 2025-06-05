package assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment8_ConditionalStatementsLoops {

	public static void main(String[] args) {
		List<Integer> creditAmount = new ArrayList<Integer>();
		creditAmount.add(50000);
		creditAmount.add(3000);
		creditAmount.add(4000);

		List<Integer> debitAmount = new ArrayList<>();
		debitAmount.add(-2000);
		debitAmount.add(-15000);
		debitAmount.add(-200);
		debitAmount.add(-300);
		debitAmount.add(-3000);
		
       //Print total number of credit and debit transactions completed
		System.out.println("Below are the credit amounts");
		for(int i:creditAmount) {

			System.out.println(i);
		}

		System.out.println("Below are the debit amounts");
		for (int i:debitAmount) {

			System.out.println(i);
		}

		
		int totalCreditedAmount = 0;
		for(int i=0;i<creditAmount.size();i++) {
			totalCreditedAmount+=creditAmount.get(i);
		}
		System.out.println("Total Credited amount is "+totalCreditedAmount);

		//Print the total amount credited and debited in account
		int totalDebitedAmount = 0;
		for(int i=0;i<debitAmount.size();i++) {
			totalDebitedAmount+=debitAmount.get(i);
		}
		System.out.println("Total Debited amount is "+totalDebitedAmount);

		//Print total amount remaining at the end in Bank Account
		int totalAmountRemaining=totalCreditedAmount+totalDebitedAmount;
		System.out.println("Total amount remained in the account is "+totalAmountRemaining);
		
		//If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit Transaction with Amount” and also print total number of suspicious transactions
		int suspiciousCount = 0;
		
		for (int credit : creditAmount) {
            if (credit > 10000) {
                System.out.println("Suspicious credit Transaction with Amount");
                suspiciousCount++;
            }
        }

        for (int debit : debitAmount) {
            if (debit < -10000) {
                System.out.println("Suspicious debit Transaction with Amount");
                suspiciousCount++;
            }
        }

        System.out.println("Total number of suspicious transactions: " + suspiciousCount);
	 
	}
}
