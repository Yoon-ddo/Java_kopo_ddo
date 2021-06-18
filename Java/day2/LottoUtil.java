// 선언부
package kr.ac.kopo;
import java.util.Random;

// 참조클래스
public class LottoUtil {
	// 내용부
	private int lottoNum;
	
	// 메소드
	/**
	 * 오늘의 로또확률을 출력해주는 메소드
	 */
	public void todayLotto() {
		Random r = new Random();
		System.out.println("오늘의 로또 확률 : " + r.nextInt(101) + 1 + "%입니다.");
	}
	/**
	 * 1~45사이의 로또 번호를 알려주는 메소드
	 * @return 추출된 로또번호
	 */
	public int getNum() {
		return r.nextInt(45) +1; // 1~45 사이의 로또번호 추출
	}
}
