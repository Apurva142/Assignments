package assignment;

public class Assignment15 {

	public static void main(String[] args) {
		String sentence="Java programming is fun and challenging";
		String capitalizedSentence="";

		//Count the total number of words in the sentence.
		String[] words = sentence.split(" ");
		System.out.println("Count the total number of words in the sentence: " + words.length);
		//Print the sentence words in reverse order.
		for (String word : words) {
			char[] charArray = word.toCharArray();
			for (int i = charArray.length - 1; i >= 0; i--) {
				System.out.print(charArray[i]);
			}
			System.out.print(" "); // Print space after each word
			//Convert the first character of each word to upper-case and print original sentence
			capitalizedSentence += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
		System.out.println("");
		System.out.println("Capitalized sentence:: " + capitalizedSentence.trim());
	}

}





