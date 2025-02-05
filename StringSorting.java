package Collections_Challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSorting {

	public static void main(String[] args) {
	List<String> list = Arrays.asList("Ant","Zebra","Lion","Cat");
	System.out.println(list); // this will print the actual list
	sortInAscending(list); // this will arrange the list in ascending order
	System.out.println(list);
	sortInDescending(list); // this will arrange the list in descending order
	System.out.println(list);

	}
	public static void sortInAscending(List<String> strlist) {
		Collections.sort(strlist);
	}
	public static void sortInDescending(List<String> strlist) {
		Collections.reverse(strlist);
	}
}
