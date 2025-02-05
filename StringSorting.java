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
	// using custom Comparator
	// write one method that will not use any methods listed inside collections
	public static void sortDescUsingComp(List<String> strlist) {
		Collections.sort(strlist, new Comparator<String>() {
		    @Override
		    public int compare(String s1, String s2) {
		        if (s1.equals(s2)) {
		            return 0;
		        }
		        if (s1.charAt(0)<s2.charAt(0)) {
		            return 1;
		        }
		        return -1;
		    }
		});
		
	}
}
