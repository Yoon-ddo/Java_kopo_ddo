package day2.exam;

import java.util.Scanner;

/*
 * ������ ����� �ð� 8�� ���� : �ɾ
 * 				8�� 15�� ���� : ����
 * 				8�� 15�� ���� : �ý�
 * 
 * ������ ����� �ð� �Է� (8�� 5���� 805�Է�) 
 */
public class ExamMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���ִ�? : ");
		int money = sc.nextInt();
		System.out.println(money+"��");
		
		if (money < 3000) {
			System.out.println("�׳� �н��̳� �Ծ��");
		} else if (money < 5000) {
			System.out.println("��������");
		} else if (money <9000){
			System.out.println("����«�ͽ԰���");
		} else {
			System.out.println("�ʹ�����ʹ�");
		}
	
		
	}

}
