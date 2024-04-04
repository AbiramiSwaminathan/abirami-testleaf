package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {
public static void main(String[] args) {
	//create and declare an array of integer type
	
	int[] numberArray = {1,2,3,4,10,6,8};
	
	//create a list to add the values from the array to this list
	
	List<Integer> numberList = new ArrayList<Integer>();
	
	//create a list to add the missing number
	List<Integer> missingNumList = new ArrayList<Integer>();
	
	//create a for loop to add all the array values into the list
	for (int i = 0; i < numberArray.length; i++) {
		numberList.add(numberArray[i]);
	}
	
	//sort the list 
	Collections.sort(numberList);
	
	//create a for loop to check for the missing numbers and add the missing numbers in a new list
	for (int i=1;i<numberList.size();i++)
	{
		if((numberList.get(i)-1) != numberList.get(i-1))
		{
			missingNumList.add(numberList.get(i)-1);
		}
	}
	System.out.println("The Missing Numbers are : "+missingNumList);
	
}
}
