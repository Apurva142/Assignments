package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment9_ConditionalStatementsAndLoops {

	public static void main(String[] args) {
		
		//Employee table details
		List<String> empNames= new ArrayList<>();
		empNames.add(0,"Alice Johnson");
		empNames.add(1,"Bob Smith");
		empNames.add(2,"Carol Davis");
		empNames.add(3,"David Brown");
		empNames.add(4,"Eva Green");
		
		
		List<Float> empSal= new ArrayList<>();
		empSal.add(0,(float) 75000.0);
		empSal.add(1,(float) 68000.0);
		empSal.add(2,(float) 82000.0);
		empSal.add(3,(float) 90000.0);
		empSal.add(4,(float) 60000.0);
		
		List<Float> empExperience= new ArrayList<>();
		empExperience.add(0, (float) 5.1);
		empExperience.add(1, (float) 3.2);
		empExperience.add(2, (float) 7.1);
		empExperience.add(3, (float) 10.2);
		empExperience.add(4, (float) 2.4);
		//int experience=5;
		List<Float> empRating= new ArrayList<>();
		empRating.add(0, (float) 4.2);
		empRating.add(1, (float) 3.8);
		empRating.add(2, (float) 4.5);
		empRating.add(3, (float) 2.5);
		empRating.add(4, (float) 3.5);
		
		//Hike table details
		/*List<String> rating= new ArrayList<>();
		rating.add(0,"> =4.0");
		rating.add(1,">=3 && < 4");
		rating.add(2,"< 3.0");
		float rating1=4.0f;*/
		//List<Float> variablePay = new ArrayList<>();
		
		//variablePay.add(0, (float)15.0);
		//variablePay.add(1, (float)10.0);
		//variablePay.add(2, (float)3.0);
		
		//List<Integer> bonus = new ArrayList<>();
		
		//bonus.add(0, 1500);
		//bonus.add(0, 1200);
		//bonus.add(0, 300);
		
		int extraReward=5000;
				
		Map<String, Double> output = new HashMap<>();	
		for (int i=0;i<empSal.size();i++) {
			
			Float variablePay=0f;
			int bonus=0;
			
			float rating = empRating.get(i);
            float baseSalary = empSal.get(i);
            float experience = empExperience.get(i);
            
			if(rating>=4) {
				variablePay=15.0f;
				bonus=1500;
								
			}
			else if(empRating.get(i)>=3 && empRating.get(i)<4) {
				variablePay=10.0f;
				bonus=1200;
									
			}
			else if(empRating.get(i)<3) {
				variablePay=3.0f;
				bonus=300;
									
			}
			
			int reward = (experience >= 5) ? extraReward : 0;
			float hike = (baseSalary * variablePay / 100) + bonus + reward;
            double hikePercentage = hike / baseSalary;

            output.put(empNames.get(i), hikePercentage);
		}
		// Print the output map
        for (Map.Entry<String, Double> entry : output.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
		
	}

}
