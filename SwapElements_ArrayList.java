package Collections_Challenge;

import java.util.Arrays;
import java.util.List;

public class SwapElements_ArrayList {

	public static void main(String[] args) {
		// Write a method which swaps 2 elements in Arraylist,- given their indices
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		System.out.println(list);
		swap(list,4,7);// 5 and 8 should swipe their value inside the list
		System.out.println(list);

	}
	public static void swap(List<Integer> list, int x, int y) {
		int swap = list.get(x);
		list.set(x, list.get(y));
		list.set(y, swap);
	}
	

}
