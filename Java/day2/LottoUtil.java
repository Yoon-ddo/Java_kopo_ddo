// �����
package kr.ac.kopo;
import java.util.Random;

// ����Ŭ����
public class LottoUtil {
	// �����
	private int lottoNum;
	
	// �޼ҵ�
	/**
	 * ������ �ζ�Ȯ���� ������ִ� �޼ҵ�
	 */
	public void todayLotto() {
		Random r = new Random();
		System.out.println("������ �ζ� Ȯ�� : " + r.nextInt(101) + 1 + "%�Դϴ�.");
	}
	/**
	 * 1~45������ �ζ� ��ȣ�� �˷��ִ� �޼ҵ�
	 * @return ����� �ζǹ�ȣ
	 */
	public int getNum() {
		return r.nextInt(45) +1; // 1~45 ������ �ζǹ�ȣ ����
	}
}
