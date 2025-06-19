package assignment;

public class Assignment16 {

	public static void main(String[] args) {
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		int count=0;

		//Divide into multiple words
		String[] words=paragraph.split(" ");
		
		//Print count and Indexes of the word
		for (int i=0;i<words.length;i++) {
			String word=words[i].replaceAll("[^a-zA-Z]", "");
			if(word.equalsIgnoreCase("Java")) {
				System.out.println("Index of the word java:: "+ i);
				count++;
			}
		}
		System.out.println("Total number of occurrences of the word Java in the paragargh:: "+count);


	}


}


