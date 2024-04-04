package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
public static void main(String[] args) {
	//create a String array 
	String[] companyNames = {"HCL","Wipro","Aspire Systems","CTS"};
	
	//create a list to add the values from the array to this list
	List<String> companyNameList = new ArrayList<String>();
	
	//create a for lopp to add the array values into the list
	
	for (int i = 0; i < companyNames.length; i++) {
		companyNameList.add(companyNames[i]);
	}
	
	//sort the collection in ascending order
	Collections.sort(companyNameList);
	System.out.println("The Company Names in Ascending Order :" +companyNameList);
	
	Collections.reverse(companyNameList);
	System.out.println("The Company Names in Descending Order :" +companyNameList);
}
}
