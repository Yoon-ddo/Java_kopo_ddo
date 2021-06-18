package AbstractGongBu.abs02;

import java.util.Scanner;

public class Menu {
	
	/**
	 * 메뉴선택
	 * @return 1 or 2 or 3
	 */
	public int selectMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("LV2 프린터를 선택하세요 (1.LG / 2.SamSung / 3.HP)->");
		
		int no = sc.nextInt();
		sc.nextLine();
		
		return no;
	}
	
	
	/**
	 *  LG 또는 samsung
	 * @param no
	 */
	public void print(int no) {
		
		Printer p = null;
		// 상속관계를 가지고 있을 경우 자식의 인스턴스 객체의 주소값을 부모가 가질 수 있다.
		// 객체형변환!
		switch(no) {
		case 1:
			p = new LGPrinter();
			//p.print();
			break;
		case 2:
			p = new SamSungPrinter();
			//p.print();
			break;
		case 3:
			//p = new HPInkJetPrinter();
			p = new HPLaserPrinter();
			//p.print();
			break;
		}
		if(p != null) {
			p.print();
		} else {
			System.out.println("잘못 선택했다.");
		}
		
		
		
		/*
		switch(no) {
		case 1:
			LGPrinter lg = new LGPrinter();
			//lg.lgPrint();
			lg.print();
			break;
		case 2:
			SamSungPrinter sam = new SamSungPrinter();
			//sam.samPrint();
			sam.print();
			break;
		case 3:
			HPPrinter hp = new HPPrinter();
			hp.print();
			break;
		}*/
	}
	
	
	
	/**
	 * 프린트 고르고 출력.
	 */
	public void choice() {
		int type = selectMenu();
		print(type);
	}
	
	
	

}
