package codingassign;
import java.lang.*;
import java.util.*;
import java.time.*;

public class assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//the first array 
		int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93};
		//takes the first element and subtracts it from the last element
		System.out.println(ages[0]-ages[ages.length-1]);
		//second array with an extra element
		int[] ages2= new int[] {3, 9, 23, 64, 2, 8, 28, 93, 21};
		System.out.println(ages2[0]-ages2[ages2.length-1]);
		//new integer to grab length of new array
		int length = ages2.length;
		//default sum
		int sum = 0;
		//for loop that adds all elements of the 2nd array
		for (int i = 0; i < ages2.length; i++) {
			sum += ages2[i];
		}
		//average of the array
		double average = sum/length;
		System.out.println("The average age is "+average);
		
		// sum
		double total = 0;
		// new array of names
		String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//new loop to calculate amount of letters in strings
        for (int i = 0; i < names.length; i++) {
			total+=names.length;
		}
        //finds average
		double average2 = total/length;
		//prints results
		System.out.println("Average number of characters: "+ average2);
		
		//this is the concatenation string
		String allNames = "";
		for (int i = 0; i < names.length; i++) {
			//add space to each name in array
			allNames += names[i] + " ";
		}
		//prints result
		System.out.println(allNames);
		
		System.out.println("Use array[arr.length] to access the last element of an array");
		
		System.out.println("Use array[0] to access the first element of an array");
		
		//new int array for finding length of names
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			//assigns names.length()
 			nameLengths[i] = names[i].length(); 
		}
		
		sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			//adds number of nameLengths to sum
			sum += nameLengths[i];
		}
		//calls method v
		System.out.println("The sum of all lengths in nameLengths is " + sum);
		
		System.out.println(duplicateWord("Hello", 5));
		
		System.out.println(getFullName("Jake", "Armstrong"));
		
		System.out.println("checkIfSumGreaterThan100() returns => " + checkSum(ages));
		
		//get average using doubleArr
		double[] doubleArr = {0.1, 1.0, 236.4592, 1000.1};
		double[] emptyDoubleArr = {};
		System.out.println("getAverage() returns => " + getAverage(doubleArr));
		System.out.println("Passing empty double[] to getAverage() returns => " + getAverage(emptyDoubleArr));
		
		
		double[] anotherDoubleArr = {2.2, 3.3, 4.4, 5.5};
		System.out.println("isFirstArrAvgGreater returns => " + isFirstArrAvgGreater(doubleArr, anotherDoubleArr));
		
		
		System.out.println("getAge() returns => " + getAge(2003));
	}
	//repeats string using for loop using duplicatedWord
	private static String duplicateWord(String word, int n) {
		String duplicatedWord = "";
		for (int i = 0; i < n; i++) {
			duplicatedWord += word;
		}
		return "duplicatedWord() returns => " + duplicatedWord;
	}
	//concatenates firstName and lastName together
	private static String getFullName(String firstName, String lastName) {
		return "getFullName() returns => " + firstName + " " + lastName;
	}
	//checks sum to see if arr is less than 100
	private static Boolean checkSum(int[] arr) {
		return Arrays.stream(arr).sum() > 100;
	}
	private static double getAverage(double[] arr) {
		// We need to use .orElse() in case an empty array is passed in
		return Arrays.stream(arr).average().orElse(Double.NaN);
	}
	//checks if getAverage is greater than getAverage(secondArr)
	private static boolean isFirstArrAvgGreater(double[] firstArr, double[] secondArr) {
		return getAverage(firstArr) > getAverage(secondArr); 
	}
	//method uses java.time() to subtract birthYear by age
	private static int getAge(int birthYear) {
		return Year.now().getValue() - birthYear; 
	}
}
