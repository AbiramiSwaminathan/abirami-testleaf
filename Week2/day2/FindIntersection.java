package week2.day2;

public class FindIntersection {
public static void main(String[] args) {
	//declare and initailize two array integers
	int array1[] = {1,2,3,4,5,6,7};
	int array2[] = {0,2,9,4,6,11,3};
//for loop toi iterate the first array
	for (int i = 0; i < array1.length; i++) {
		//decare an integer and initailize it with the array value according to the itetation value
		int firstarrayvalue = array1[i];
		for (int j = 0; j < array2.length; j++) {
			//check if the value is the same and print if so
			if(firstarrayvalue == array2[j])
			{
				System.out.println("The number is :" + firstarrayvalue);
			}
		}
	}
	
}
}
