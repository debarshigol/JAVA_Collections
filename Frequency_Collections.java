package Collections_Challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency_Collections {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,2,5,1,4,7,3,2,8,1);
		System.out.println(frequency(list, 2));
		System.out.println(frequency(list, 7));
		System.out.println(frequency(list, 4));

	}
	public static int frequency(List<Integer> numList, int num) {
		return Collections.frequency(numList, num);
	}

}
