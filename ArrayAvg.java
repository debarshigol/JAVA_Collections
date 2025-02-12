package Practice_Problrm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayAvg {

	public static void main(String[] args) {
		int[] arr = {2,54,5,64,86,21,8};
		Arrays.sort(arr);
		
		int size = arr.length;
		List<Float> list = new ArrayList<Float>();
		
		for(int j=0;j<size/2; j++) {
			list.add((float)(arr[j]+arr[size-(j+1)])/2);
		}
		if(size%2!=0) {
			list.add((float)arr[size/2]);
		}
		System.out.println(list.toString());
	}

}
