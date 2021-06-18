package Subject;
import java.util.Arrays;
public class ArrCopy01 {

	public static void main(String[] args) {
		
	int[] a = {10,20,30};
	int[] b;
	
	b=a;
	System.out.println("<Shallow Copy>");
	System.out.println("a주소 : "+ a);
	System.out.println("b주소 : "+ b);
	System.out.println("a : "+ Arrays.toString(a));
	System.out.println("b : "+ Arrays.toString(b));
	
	++b[0];
	System.out.println("++b[0] 수행 후");
	System.out.println("a : "+ Arrays.toString(a));
	System.out.println("b : "+ Arrays.toString(b));
	
	
	//deep copy
	int[] a1 = {10,20,30};
	int[] c = new int[a1.length];
	for (int i = 0; i<c.length ; i ++) {
		c[i] = a1[i];
	}
	
	System.out.println("<Deep Copy>");
	System.out.println("a주소 : "+ a1);
	System.out.println("c주소 : "+ c);
	System.out.println("a : "+ Arrays.toString(a1));
	System.out.println("c : "+ Arrays.toString(c));
		


	} // m

}
