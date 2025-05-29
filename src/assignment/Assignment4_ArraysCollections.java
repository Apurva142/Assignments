package assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment4_ArraysCollections {

	public static void main(String[] args) {
		//Scenario-1 Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.

		List <String> LargestCities= new ArrayList<String>();
		LargestCities.add("Delhi");
		LargestCities.add("Bengalore");
		LargestCities.add("Vizag");
		LargestCities.add("Hyderabad");
		LargestCities.add("Lucknow");

		List <Float> CitiesSize = new ArrayList<Float>();
		CitiesSize.add((float)1484);
		CitiesSize.add((float)741.0);
		CitiesSize.add((float)681.96);
		CitiesSize.add((float)650);
		CitiesSize.add((float)631);

		Float Area=CitiesSize.get(2)+CitiesSize.get(3);
		System.out.println("Total area of the Vizag and Hyderabad cities combined="+Area);

		//Scenario-2 Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		Set <String> Places = new HashSet<String>();
		Places.add("Tajmahal");
		Places.add("Eiffel Tower");
		Places.add("Chaina Wall");
		Places.add("Colosseum");
		Places.add("Petra");

		Set <Integer> SizeOfThePlace = new HashSet<Integer>();
		SizeOfThePlace.add(1);
		SizeOfThePlace.add(2);
		SizeOfThePlace.add(3);
		SizeOfThePlace.add(4);
		SizeOfThePlace.add(5);
		System.out.println("Top Places="+Places);
		System.out.println("Top Places Size="+SizeOfThePlace);
		System.out.println("Size of the Set Places="+Places.size());

		//Scenario-3 Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.

		int Number[]= {1,2,3,4,11,6,7,8,9,10};
		int Sum=Number[4]+Number[5];
		float AvgNumber=Sum/2f;
		System.out.println(AvgNumber);

		//Scenario-4 Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		List<String> TopMovies = new ArrayList<String>();
		TopMovies.add("Bahubali1");
		TopMovies.add("Bahubali2");
		TopMovies.add("Pushpa1");
		TopMovies.add("Pushpa2");
		TopMovies.add("KGF");

		System.out.println("Top Third movie from the list is "+TopMovies.get(2));

	}

}
