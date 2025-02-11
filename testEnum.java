package Enum;

public class testEnum {

	public static void main(String[] args) {
		for (WeekDay day : WeekDay.values()) {
			System.out.printf("%s, %s\n",day,day.getType());
		}
	}
}
