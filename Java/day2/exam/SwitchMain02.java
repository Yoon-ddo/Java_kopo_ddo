package day2.exam;

import java.util.Scanner;

/*
 * �����ϴ� ���� �Է� : spring
 * ���� 3��~5������ �Դϴ�.
 */
public class SwitchMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϴ� ������ �Է�");
		String season = sc.nextLine();
		
		/*
		if (season.equals("��")) { // (season == "��")���� ������ �ָ� ���˾Ƶ�´�.
			System.out.println("���� 3~5�������Դϴ�.");
		} else if (season.equals("����")) {
			System.out.println("������ 6~8�������Դϴ�.");
		} else {
			System.out.println("Error!");
		}
		*/
		
		
		switch (season) {
		case "��" :
		case "spring" :
		case "SPRING" :
			System.out.println("���� 3~5�������Դϴ�.");
			break;
		case "����" :
			System.out.println("������ 6~8�������Դϴ�.");
			break;
		default :
			System.out.println("Error!");
		}
		
	}

}
