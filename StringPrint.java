package Practice_Problrm;

public class StringPrint {

	public static void main(String[] args) {
		// input = 3[a]2[b]
		// output = aaabb
		String input = "3[a]2[gh]2[bcd]";
		String[] arr =input.split("\\[|\\]");
		int len = arr.length;
		int[] arrInt = new int[(len/2)];
		String[] arrString = new String[(len/2)];

		
		int j =0;
		int k =1;
		for(int i=0;i<arrInt.length;i++) {
			arrInt[i]= Integer.parseInt(arr[j]);
			j+=2;
		}
		for(int i=0;i<arrString.length;i++) {
			arrString[i]=arr[k];
			k+=2;
		}
		for(int i=0;i<arrString.length;i++) {
			for(int x=0;x<arrInt[i];x++) {
			System.out.print(arrString[i]);
		}
		}
	
	}
	

}
