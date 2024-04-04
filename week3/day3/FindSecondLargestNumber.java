package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {
public static void main(String[] args) {
	//create a array of integer dataatype and add values
	
	int[] numbersArray = {3,2,11,4,6,7};
	
	//declare a list to add the values from the array to this list
	List<Integer> numbersList = new ArrayList<Integer>();
	
	//create a for loop to add the array values to the list
	for (int i = 0; i < numbersArray.length; i++) {
		numbersList.add(numbersArray[i]);
	}
	
	System.out.println("The Original Order of the List " + numbersList);
	
	//sort the list using the sort keyword
	Collections.sort(numbersList);
	
	System.out.println("The Original Order of the List " + numbersList);
	
	//print the second largest number
	int listSize = numbersList.size();
	
	System.out.println("The Second Largest Number in the List :" + numbersList.get(listSize-2));
}
}
