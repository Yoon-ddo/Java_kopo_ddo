package AbstractGongBu.abs01;

import java.util.Scanner;

public class Menu {
	
	/**
	 * 메뉴선택
	 * @return 1 or 2
	 */
	public int selectMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("LV1 프린터를 선택하세요 (1.LG / 2.SamSung)->");
		
		int no = sc.nextInt();
		sc.nextLine();
		
		return no;
	}
	
	
	/**
	 *  LG 또는 samsung
	 * @param no
	 */
	public void print(int no) {
		switch(no) {
		case 1:
			LGPrinter lg = new LGPrinter();
			lg.lgPrint();
			break;
		case 2:
			SamSungPrinter sam = new SamSungPrinter();
			sam.samPrint();
			break;
		}
	}
	
	
	
	/**
	 * 프린트 고르고 출력.
	 */
	public void choice() {
		int type = selectMenu();
		print(type);
	}
	
	
	

}
