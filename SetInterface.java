import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("apple");
		set.add("banana");
		System.out.println(set.add("apple"));// will return false, as it is duplicate
		printCollection(set);
		

	}
	public static <E> void printCollection(Collection<E> collection) {
		for(Object cll:collection) {
			System.out.printf(" %s",cll);
		}
		System.out.println("");
	}

}
