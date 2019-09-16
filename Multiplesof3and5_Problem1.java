import java.util.stream.*;
import java.util.*;

public class Multiplesof3and5_Problem1{
	public static void main(String[] args){
		int num = 1000;
		int counter = 0;
		Set<Integer> set = new HashSet<>();
		for (int i=0;i < num;i += 3){
			set.add(i);
			counter++;
		}
		counter = 0;
		for (int i=0;i < num;i += 5){
			set.add(i);
			counter++;
		}
		Integer[] array = set.toArray(new Integer[set.size()]);
		Stream<Integer> s = Stream.of(array);
		int ans =s.mapToInt(Integer::intValue).sum();
		System.out.println(ans);

	}
}