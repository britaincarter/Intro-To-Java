//This class finds several different important statistical values in an array 
//Namely max, min, mean, mode, standard deviation, and median
import java.util.Scanner;
public class StatisticsTester {
	
	
	public static void main(String[] args) {
		//get the amount elements user wants in their array
		System.out.println("Enter how many elements you want in the array: ");
		Scanner in = new Scanner(System.in);
		double max = 0;
		double min = 0;
		double mean = 0;
		double mode = 0;
		double standardDeviation = 0;
		double median = 0;
		int n = in.nextInt();
		double list[] = new double[n];
		
		//fill the array
		for(int i = 0; i<n ; i++){
			System.out.println("Please enter numbers to fill the array...");
			list[i] = in.nextDouble();
		}
		
		//invoking the methods in Statistics class on the array
		max = Statistics.findMax(list);
		min = Statistics.findMin(list);
		mean = Statistics.findMean(list);
		mode = Statistics.findMode(list);
		standardDeviation = Statistics.findStandardDeviation(list);
		median = Statistics.findMedian(list);
		
		//output the values
		System.out.println("The max is: " + max);
		System.out.println("The min is: " + min);
		System.out.println("The mean is: " + mean);
		System.out.println("The mode is: " + mode);
		System.out.printf("The population standard deviation is: %.2f\n" , standardDeviation);
		System.out.println("The median is: " + median);
	}
}
