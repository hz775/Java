import java.util.Vector;
public class VectorExamp{
	public static void main(String[] args){
		Vector<Integer> Numbers=new Vector<>();
		Numbers.add(1);
		Numbers.add(111);
		Numbers.add(11);
		Numbers.add(1111);
		System.out.println("Numbers: "+Numbers);
		System.out.println("Numbers: "+Numbers.firstElement());
		Numbers.removeElementAt(1);
		System.out.println("Numbers: "+Numbers);
	}
}
		
		