package Collections_Challenge;

import java.util.Arrays;
import java.util.List;

public class ListSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println(list);
		swap(list);// 5 and 8 should swipe their value inside the list
		System.out.println(list);
	}
	public static void swap(List<Integer> list) {
		for (int i = 0; i < list.size()/2; i++) {
			int swapFirst = list.get(i);
			int swapLast = list.get(list.size()-i-1);
			list.set(i, swapLast);
			list.set(list.size()-i-1, swapFirst);
			
		}
	}

}
