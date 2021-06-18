package HomeWork2;

import java.sql.Date;
import java.util.Arrays;
import java.util.Calendar;

public class CalMain {

	public static void main(String[] args) {
		
		MyCalender mc = new MyCalender();
		int y = 0;
		int menu;
		int m = 0;
		
		
		while(true){
			menu = mc.getMenu();
			if (menu == 2) {
				y = mc.getYear();
				m = mc.getMonth();
				System.out.println("");
				mc.MakeCal(y,m);
				break;
			} 
		}

		

	}

}

