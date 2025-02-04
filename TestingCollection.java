import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestingCollection {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(32);
		list.add(67);
		list.add(-98);
		list.add(0);
		printCollection(list);
		

	}
	public static <E> void printCollection(Collection<E> collection) {
		System.out.println("Collection is: ");
		for(Object cll:collection) {
			System.out.printf(" %s",cll);
		}
		System.out.println("");
	}

}
