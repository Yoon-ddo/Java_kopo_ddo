package day2;

import java.util.Scanner;

public class BigyoYeonSan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // Scanner����ϰ� ������ import �ؾ���.
		// import java.util.Scanner; �Է�
		// ctrl + shift + o : �ڵ� import����
		
		// ������ �Է��ϼ��� : ������ ���
		System.out.print("������ �Է��ϼ��� : ");
		
		// Ű����� ������ �Է�
		int num = sc.nextInt(); //Ű����� ������ �Է¹޴� ��ɾ�
		
		// ��� ���
		boolean result = (num > 0  && num%2 == 0); 
		//num�� 0���� ũ��? �׷� num%2==0������. / 0���� ������ ������ �ʿ䵵����.
		System.out.println(num + "�� ¦�� ���� : " + result);
		
		
	}

}
