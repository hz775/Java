import java.util.TreeSet;
import java.util.Set;

public class TreeSetExamp{
	public static void main(String[] args){
		TreeSet<Integer> numbers=new TreeSet<>();
		numbers.add(1);
		numbers.add(8);
		numbers.add(9);
		System.out.println("Numbers: "+numbers);
		System.out.println("Numbers: "+((TreeSet<Integer>) numbers).first());
		System.out.println("Numbers: "+((TreeSet<Integer>) numbers).last());
	}
}
		