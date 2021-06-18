package CollectionGonbu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * List 순서(O), 중복(O)
 */
public class ListMain {

	public static void main(String[] args) {
		
		//1.5버전 전.
		//List list = new ArrayList();
		//list.add("hello");
		
		// 1.5버전의  Generic
		//List<String> list = new ArrayList<String>();
		
		// 1.7버전 이후의  Generic 방식
		List<String> list = new ArrayList<>();
		
		/* add, size( )*/
		System.out.println("리스트의 총 원소 개수 : "+list.size());
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println("리스트의 총 원소 개수 : "+list.size());
		list.add("one");
		System.out.println("add후 리스트의 총 원소 개수 : "+list.size());

		
		/*리스트 전체 출력 */
		//1. index를 이용한 get()메소드 이용
		System.out.println("<< get( )을 이용하여 리스트 출력(index이용) >>");
		for(int i = 0; i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}System.out.println();
		
		//2. 1.5버전의 FOR문
		System.out.println("<< 1.5ver의 for문을 이용하여 리스트 출력 >>");
		for(String str : list) {
			System.out.print(str+" ");
		}System.out.println();
		
		//3. toArray( )메소드 이용
		System.out.println("<< toArray( )을 이용하여 리스트 출력(잘안씀) >>");
		Object[] arr = list.toArray();
		System.out.println(Arrays.toString(arr));
		
		//4. iterator( )메소드 이용
		System.out.println("<< iterator( )을 이용하여 리스트 출력 >>");
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next()+" ");
		}System.out.println();
		
		
		/* remove */
		boolean bool = list.remove("two");
		System.out.println("remove : "+bool);

		System.out.println("첫번째 문자열 : "+list.get(0));
		String remStr = list.remove(0);
		System.out.println("삭제된 문자열 : "+remStr); // python에서 pop처럼 삭제후 반환값을 가질 수 있음.
		System.out.println("remove(0) 후 첫번째 문자열 : "+list.get(0));
		
		/*size( ) */
		System.out.println("원소 총 개수 : "+list.size());
		//list.clear();
		System.out.println("원소 총 개수 : "+list.size());
		
		
		List<String> sub = new LinkedList<>();
		sub.add("봄");
		sub.add("여름");
		list.addAll(sub);
		System.out.println("addAll( )후 총 원소 개수 : "+list.size());
		
		
		
		
	}//m

}
