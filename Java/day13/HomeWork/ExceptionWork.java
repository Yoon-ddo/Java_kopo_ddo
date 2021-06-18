package HomeWork;

import java.util.Scanner;


public class ExceptionWork {
	
	public static void main(String[] args) throws LottoNumberException{
		
		try {
			lottoNum();			
		} catch(Exception e){
			System.out.println(e.getMessage());
			
		}
	}
	
	public static void lottoNum() throws LottoNumberException {
		Scanner sc = new Scanner(System.in);
		System.out.print("좋아하는 로또 번호를 입력하세요 : ");
		int yourNum = sc.nextInt();
		sc.nextLine();
		
		if(yourNum>45 || yourNum<1) {
			throw new LottoNumberException("LottoNumberException : 1 - 45사이만 가능합니다. "
					+ yourNum+"은 올바르지 않습니다.");
		} else {
			System.out.println(yourNum+"(을)를 포함해서 로또번호들을 추출하겠습니다");
		}
		
	}

	

}
