package ExceptionStudy;

import java.util.Scanner;

/* 사용자정의 예외처리
 * 
 * 등록할 ID를 입력하세요 : hello1234
 * ID는 최대 8글자만 사용 가능.
 * 
 * 등록할 ID를 입력하세요 : hello123
 * ID를 등록했습니다.
 */


public class ExceptionMain04 {
	
	
	static void register() throws CheckIdException{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등록할 ID를 입력하세요 : ");
		String id = sc.nextLine();
		
		if(id.length()>8) {
			throw new CheckIdException("ID는 최대 8글자만 가능합니다.");
		} else {
			System.out.println("ID 등록해따능");
			
		}
		
	}
	
	
	

	public static void main(String[] args) throws CheckIdException{
		try {
			register();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
				
		
		//Scanner sc = new Scanner(System.in);
		
		//System.out.print("등록할 ID를 입력하세요 : ");
		//String id = sc.nextLine();
	
		/*
		if(id.length() > 8) {
			System.out.println("ID는 최대 8글자만 가능합니다.");
		}else {
			System.out.println("ID를 등록했스비당.");			
		}*/
				/*
		try {
			if(id.length() > 8) {
				//throw new Exception("ID는 최대 8글자만 가능합니다."); // 에러메시지 가능
				//CheckIDException 을 extends Exception해주면 사용할 수 있다.
				throw new CheckIdException("ID는 최대 8글자만 가능합니다.");
				
			}else {
				System.out.println("ID를 등록했스비당.");				
			}
		} catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());// 글자만 나오게
		}*/
		
		
		
		
		
		

	}//m

}
