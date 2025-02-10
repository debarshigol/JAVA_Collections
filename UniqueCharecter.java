package Collections_Challenge;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharecter {

	public static void main(String[] args) {
		Set<Character> unique = new HashSet<Character>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your String: ");
		String str = input.next();
		for (Character ch : str.toCharArray()) {
			unique.add(ch);
		}
		System.out.printf("Your input has %d unique charecter",unique.size());

	}

}
