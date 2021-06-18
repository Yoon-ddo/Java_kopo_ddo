package kr.ac.kopo.ui;

import java.util.Scanner;

import kr.ac.kopo.service.BoardService;
import kr.ac.kopo.service.BoardServiceFactory;

public abstract class BaseUI implements IBoardUI{
	/*
	 * 인터페이스를 상속받으면 오버라이드를 해줘야한다.
	 * 근데 BaseUI는 중복되는 부분을 정의해둔 클래스이기 때문에 execute를 오버라이드해줄 필요가 없다.
	 * 그래서 "추상클래스"로 만들어준 것!
	 * 메뉴가 직접 interface 상속받으면 코드가 길어짐.
	 */
	private Scanner sc;
	protected BoardService service; // getter, setter 만들기귀찮으니까 protected
	
	public BaseUI() {
		sc = new Scanner(System.in);
		service = BoardServiceFactory.getInstance();// new하지않고 객체를 받아오게됨 =>static
	}
	
	/**
	 * string 받아오는 메소드
	 * @param msg
	 * @return
	 */
	protected String scanStr(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}
	
	protected int scanInt(String msg) {
		int num = Integer.parseInt(scanStr(msg));
		return num;
	}
}
