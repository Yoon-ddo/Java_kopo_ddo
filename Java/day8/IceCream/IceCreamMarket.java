package IceCream;

import java.util.Scanner;

// 입력받은 아이스크림 정보를 가지고 있는 클래스


public class IceCreamMarket {
	
	IceCream[] iceArr; // 멤버변수로 아이스크림 배열.
	Scanner sc = new Scanner(System.in);
	
	
	int inputInt(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		
		return num;
		
	}
	
	
	String inputString(String msg) {
		// msg를 왜쓰는지 알것같다. 따로 메소드 만들 필요없이 msg로 구분하고 return값만 가져갈 수 있게됨.
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}
	
	
	/**
	 * 손님이 아이스크림 구매하면 구매정보 출력해주는 메소드
	 */
	void doSomeThing() {
		//아이스크림 구매
		buy();
		
		// 구매정보 출력
		info();
	}
	
	
	void info(){
		System.out.println("< 총 "+ iceArr.length+"개의 아이스크림 구매 정보 출력 >");
		
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		/*
		 for(int i =0 ; i <iceArr.length; i++) { // for(IceCream ice : iceArr)
			System.out.println((i+1)+"\t"+iceArr[i].name"\t"+iceArr[i].price);
		 }
		* 문제는 없지만 아이스크림 정보는 IceCream 클래스에서 알고있다. 
		* .name, ,price 이렇게 멤버변수를 써주는 것은 좋지 않다. (멤버변수를 고칠 수도 있기 때문.)
		* 멤버변수보다는 메소드로 통신하는 게 좋다.
		*/
		for(int i =0 ; i <iceArr.length; i++) { // for(IceCream ice : iceArr)
			System.out.println((i+1)+"\t"+iceArr[i].getName()+"\t"+iceArr[i].getPrice());
					
		}
		
		
	}
	
	void buy() {
		int cnt = inputInt("아이스크림 몇개 구입할래? : ");
		iceArr = new IceCream[cnt]; // cnt개 길이만큼의 배열 생성.
		for (int i = 0; i<iceArr.length ; i++) {
			System.out.println("*** " + (i+1) + "번째 아이스크림 구매정보 입력 ***");
			String name = inputString("아이스크림 명 : ");
			int price = inputInt("아이스크림 가격 : ");
			
			iceArr[i] = new IceCream();
			iceArr[i].set(name,price); // 입력받은 값을 받아오는 set메소드 (IceCream에 생성해야한다.)
			
		}
	}
	
	
	
	
}
