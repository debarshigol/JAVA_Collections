package Collections_Challenge;

public class LargeNum {

	public static void main(String[] args) {
		String num = "1329";
		LargeOdd(num);
		LargeEven(num);

	}
	public static void LargeEven(String num) {
		String numMod = " ";
		for (int i = num.length() - 1; i >= 0; i--) {
			if (num.charAt(i) % 2 == 0) {
				numMod = num.substring(0, i + 1);
				break;
			}
		}
		System.out.println("Largeest Even Number is: " + numMod);
	}
	
	public static void LargeOdd(String num) {
		String numMod = " ";
		for (int i = num.length() - 1; i >= 0; i--) {
			if (num.charAt(i) % 2 != 0) {
				numMod = num.substring(0, i + 1);
				break;
			}
		}
		System.out.println("Largeest Odd Number is: " + numMod);

	}

}

