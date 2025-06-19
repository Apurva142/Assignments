package assignment;

public class Assignment18 {
	//method to verify palindrome
	public static boolean isPalindrome(String s) {
		String word=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int i=0;
		int j=word.length()-1;
		while(i<j) {
			if(word.charAt(i)!=word.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));

	}

}
