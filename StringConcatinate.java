package Collections_Challenge;

public class StringConcatinate {

	public static void main(String[] args) {
		System.out.println(concatinate("Work"));
		System.out.println(concatinate("Work", "as"));
		System.out.println(conc("Work","as","one"));

	}
	public static String concatinate(String... str) {
		StringBuilder sb = new StringBuilder();
		for (String st : str) {
			sb.append(st).append(" ");
		}
		return sb.toString();
	}
}
