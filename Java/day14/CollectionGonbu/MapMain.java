package CollectionGonbu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		
		/* HashMap */
		Map<String, String> map = new HashMap<>();
		//ID, Password
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드 변경 서비스라구~");
		System.out.print("ID를 입력하세요 : ");
		String id = sc.nextLine();
		
		// 입력받은 아이디가 key에 해당하는지 확인할 때 containsKey
		if(! map.containsKey(id)) { // false
			System.out.println("입력하신 ["+id+"]는 존재하지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);//시스템 종료	
		}
		
		System.out.print("현재 패스워드를 입력하세요 : ");
		String pw = sc.nextLine();
		
		if (! map.get(id).equals(pw)){
			System.out.println("패스워드가 다릅니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);//시스템 종료	
		}
		
		System.out.print("변경할 패스워드를 입력하세요 : ");
		String mypw = sc.nextLine();
		map.put(id, mypw);
		
		
		/*Map은 set, list를 출력하는 for문 toArray등은 사용할 수 없다*/
		System.out.println("<< 전체 회원정보 출력 >>");
		Set<Map.Entry<String,String>> enSet = map.entrySet();
		/*
		 * Set enSet = map.entrySet();
		 * Set<Entry> enSet = map.entrySet();
		 * Set<Map.Entry<>> enSet = map.entrySet();
		 * Set<Map.Entry<String,String>> enSet = map.entrySet();
		 * Set<Entry<String,String>> enSet = map.entrySet();
		 */
		
		
		for(Map.Entry<String, String> e :enSet) {
			System.out.println("ID : "+e.getKey()+", PASSWORD : "+e.getValue());
		}
		
		Set<String> keys =  map.keySet();
		for(String key : keys) {
			System.out.println("ID : "+key+", PASSWORD : "+map.get(key));
		}
		
		
		
		
		
		
		
	}//m

}
