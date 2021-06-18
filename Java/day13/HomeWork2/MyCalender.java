package HomeWork2;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalender {
	Scanner sc = new Scanner(System.in);
	
	public int getMenu() {
		System.out.print("선택하세요(1. 특정년도   2. 특정월   3. 종료) =>");
		int menuNum = sc.nextInt();
		sc.nextLine();
		return menuNum;
	}
	
	public int getYear() {
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		sc.nextLine();
		return year;
	}
	
	public int getMonth() {
		System.out.print("월 입력하세요 : ");
		int month = sc.nextInt();
		sc.nextLine();
		return month;
	}
	
	
	
	public void MakeCal(int y, int m) {
		
		
		Calendar c = Calendar.getInstance();
		int year = y;
		int month = m;
		System.out.println("<< "+year+"년 "+month+"월 >>");
		c.set(year, month-1, 1); // month는 0~11이므로 -1 해주어야한다.
		int day = c.get(Calendar.DAY_OF_WEEK);
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
	
		String[] dateA = new String[lastday+day];
		
		for (int i = 0; i<dateA.length ; i ++) {
			if (i<(day-1)) {
				dateA[i] = " ";
			} else {
				dateA[i] = ""+i;
			}
		}
		System.out.print("일\t월\t화\t수\t목\t금\t토");
		System.out.println();
		for (int i = 1 ; i<dateA.length+1 ; i++) {
			System.out.print(dateA[i-1]+"\t");
			if (i%7 == 0) {
				System.out.println();
			}
		}
	}

	
	
	
	
}
