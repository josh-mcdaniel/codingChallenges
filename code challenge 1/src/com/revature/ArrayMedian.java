package com.revature;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayMedian {
	
	public static void main(String[] args) {
		
		int[] arr1 = {2, 5, 1};
		int[] arr2 = {4, 3};
		
		double median = getMedian(arr1,arr2);
		
		System.out.println(median);
	}

	
	public static double getMedian(int[] arr1, int[] arr2) {
		
		double median = 0.0;
		ArrayList<Integer> combinedArray = new ArrayList<Integer>();
		
		for(int i =0; i< arr1.length; i++) {
			combinedArray.add(arr1[i]);
		}
		for(int i =0; i< arr2.length; i++) {
			combinedArray.add(arr2[i]);
		}

		
		Collections.sort(combinedArray);
		

		
		if(combinedArray.size()%2 == 0) {
			double upperNumber = combinedArray.get((combinedArray.size()/2));

			double lowerNumber = combinedArray.get((combinedArray.size()/2)-1);

			median = (upperNumber + lowerNumber)/2;
		}else {
			median = combinedArray.get((combinedArray.size()/2));
		}
		
		
		
		return median;
	}
}