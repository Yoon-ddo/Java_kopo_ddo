package CollectionGonbu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		
		/*Hash Set*/
		Set<String> set  = new HashSet<>();
		/*Tree Set*/
		//Set<String> set  = new TreeSet<>();
		
		
		/*add*/
		boolean bool = set.add("one");
		set.add("one");
		System.out.println("one 데이터 삽입 여부 : "+(bool? "ok":"fail"));
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("six");
		bool = set.add("one");
		set.add("one"); // 넣어도 소용없다~
		System.out.println("one 데이터 삽입 여부 : "+(bool? "ok":"fail"));
		System.out.println();
		
		
		/* set 전체 데이터 출력 방식 */
		//1. 1.5ver for문
		System.out.println("<< 1.5ver의 for문을 이용하여 set 출력 >>");
		for(String str : set) {
			System.out.print(str+" ");
		}System.out.println();
		
		//2. iterator( )이용
		System.out.println("<< iterator( )을 이용하여 set 출력 >>");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next()+" ");
		}System.out.println();
		
		//3. toArray( )
		System.out.println("<< toArray( )을 이용하여 set 출력(잘안씀) >>");
		Object[] arr = set.toArray();
		System.out.println(Arrays.toString(arr));


		
		
		
		
	}//m

}
