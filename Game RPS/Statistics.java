import java.util.Arrays;

public class Statistics {
	
	//finds the minimum of the array
	public static double findMin(double[] list){
		double minSoFar = list[0];
		for(int i = 0; i<list.length; i++){
			if(minSoFar > list[i]){
				minSoFar = list[i];
			}
		}
		
		return minSoFar;
	}
	
	//finds the maximum of the array
	public static double findMax(double[] list){
		double maxSoFar = list[0];
		
		for(int i = 0; i<list.length; i++){
			if(list[i] > maxSoFar){
				maxSoFar = list[i];
			}
		}
		return maxSoFar;
	}
	
	//finds the median of the array
	public static double findMedian(double[] list){
		double median;
		//selection sort
		Arrays.sort(list);
		//array is even
		if(list.length%2 == 0){
			median = list[list.length/2]; 
		}
		//array is odd
		else {
			median = list[list.length/2];
		}
	return median;
	}
	
	//finds the population standard deviation
	public static double findStandardDeviation(double[] list){
		double standardDeviation = 0;
		double mean = findMean(list);
		double totalOfSquares = 0;
		double subtractMeanAndSquare;
		double meanOfSquares = 0;
		for(int i = 0; i < list.length; i++){
			   subtractMeanAndSquare = Math.pow((list[i]-mean),2);
			   totalOfSquares += subtractMeanAndSquare;
		}
		meanOfSquares = (totalOfSquares/list.length);
		standardDeviation = Math.sqrt(meanOfSquares);
	return standardDeviation;
	}
	
	//finds the mode
	public static double findMode(double[] list){
		double maxCount = 0;
		double maxValue = 0;
		for(int i = 0; i < list.length; i++){
			double count = 0;
			for(int j = 0; j < list.length; j++){
				if(list[j] == list[i]){
					count++;
				}
				
			}
		
			if(count > maxCount) {
				maxCount = count;
				maxValue = list[i];
			}
		}
		return maxValue;
	}
	
	//finds the mean
	public static double findMean(double[] list){
		double mean = 0;
		for(int i = 0; i<list.length ;i++){
			mean += list[i];
		}
		
		return mean/list.length;
	}
	
}
