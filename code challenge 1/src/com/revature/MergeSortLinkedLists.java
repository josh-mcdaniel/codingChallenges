package com.revature;

import java.util.Collections;
import java.util.LinkedList;

public class MergeSortLinkedLists {

	public static void main(String[] args) {
		
			LinkedList<Integer> list1 = new LinkedList<Integer>();
			
			list1.add(1);
			list1.add(4);
			list1.add(5);
			
			LinkedList<Integer> list2 = new LinkedList<Integer>();
			
			list2.add(1);
			list2.add(3);
			list2.add(4);
			
			LinkedList<Integer> list3 = new LinkedList<Integer>();
			
			list3.add(2);
			list3.add(6);
				
			LinkedList<LinkedList<Integer>> lists =  new LinkedList<LinkedList<Integer>>();
			
			lists.add(list1);
			lists.add(list2);
			lists.add(list3);
				
		mergeAndSortLinkedLists(lists);
		
	}
	
	
	public static void mergeAndSortLinkedLists(LinkedList<LinkedList<Integer>> lists) {
		
		LinkedList<Integer> mergedList = new LinkedList<Integer>();
		
		for(int i = 0; i < lists.size(); i++) {
			
			LinkedList<Integer> innerLists = new LinkedList<Integer>();
			innerLists = lists.get(i);
				
			for(int j = 0; j < innerLists.size(); j++) {
					
				mergedList.add(innerLists.get(j));
				
			}
		}
		
		Collections.sort(mergedList);
		
		System.out.println(mergedList);
	}
	
	
	
}