package Collections_Challenge;

public class LargeNum {

	public static void main(String[] args) {
		String num = "132";
		String numMod = " ";
		for (int i = num.length() - 1; i >= 0; i--) {
			if (num.charAt(i) % 2 != 0) {
				numMod = num.substring(0, i + 1);
				break;
			}
		}
		System.out.println("Largeest Number is: " + numMod);

	}

}
