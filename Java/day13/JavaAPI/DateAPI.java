package JavaAPI;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 날짜와 관련된 API
 * Date -java.util
 * Calendar - java.util
 * SimpleDateFormat - java.text[date 포맷팅]
 */
public class DateAPI {
	public static void main(String[] args) {
		
		// 1) Date
		Date d = new Date();
		System.out.println("date : "+d); // d.toString()
		/* 왜 주소값이 아니라 날짜가 나오는걸까 ? 원래 주소값이 찍혀야하는거 아닌가? 
		 * - 출력메소드(print~)에서는 .toString()이 자동으로 적용되어있다.
		 * - Object소속의 .toString()을 Date클래스가 오버라이딩 했기 때문에 주소가아닌 날짜가 나온다.
		 */

		// - get~() : 1900년을 기준으로 나오기 때문에 올해를 뽑고싶으면 +1900해주어야한다.
		int year = d.getYear()+1900; // 왜 선이 나오는가? deprecate되었다(사라질예정이라)는 것을 표시.
		int month = d.getMonth()+1;
		int date = d.getDate();
		System.out.println("오늘은 "+year+"년 "+month+"월 "+date+"일");
		
		
		
		
		// 2) Calendar
		Calendar c = Calendar.getInstance();
		//System.out.println("c : " + c);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.DATE));
		int day = c.get(Calendar.DAY_OF_WEEK); // 요일을 숫자로 반환해주기 때문에 배열사용.
		System.out.println(day);
		
		String[] dayArr = {"","일","월","화","수","목","금","토"};
		System.out.println("오늘은 "+year+"년 "+month+"월 "+date+"일(" + dayArr[day] + ")");
		
		// 2021.05.05는 머선요일?
		c.set(2021, 5-1, 5); // month는 0~11이므로 -1 해주어야한다.
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2021.05.05는 "+dayArr[day]+"요일이다.");
		
		// 5월의 마지막 날은?
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("5월은 "+ lastday +"일이 마지막 날 입니다.");
		
		// 2월의 마지막 날은?
		c.set(c.MONTH, 2-1);
		lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("2월은 "+ lastday +"일이 마지막 날 입니다.");
		

		
		// 3) SimpleDateFormat
		String pattern = "yy-MM-dd";
		pattern = "yyyy-MM-dd-(E)-HH-mm-ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String data = sdf.format(new Date());
		System.out.println(data);
		
		//Calendar객체를 date형으로 바꿔주는 메소드
		Date d1 = c.getTime();
		data = sdf.format(d1);
		System.out.println(data);
		
		
		
		
		
		
		
		
		
		
		
		
	}//m

}
