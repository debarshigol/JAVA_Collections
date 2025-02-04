import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
public class ArrToListMod {
		public static void main(String[] args) {
			Integer[] arr = {6,8,11,6,7,18};
			int target = 17;
			List<Integer> arrList = new ArrayList<>();
			arrList = Arrays.asList(arr);
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<target) {
					int index1  =i;
					int numLeft = target-arr[i];
					if(arrList.contains(numLeft)) {
						System.out.println("Index of 2 elements, which sum are equal to target "+index1+" and "+arrList.indexOf(numLeft));
					}
				}
			}

		}
	}
