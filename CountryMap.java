package Map_Interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {

	public static void main(String[] args) {
		Map<String, String> countryMap = new HashMap<>();
		countryMap.put("India", "New Delhi");
		countryMap.put("Germany", "Berlin");
		countryMap.put("Spain", "Madrid");
		countryMap.put("France", "Paris");
		countryMap.put("Italy", "Rome");

		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the country name: ");
			String country = input.next();

			if (countryMap.containsKey(country)) {
				System.out.printf("Capital is: %s\n", countryMap.get(country));
			} else {
				System.out.println("Country not found in Map!");
			}
		}

	}

}
