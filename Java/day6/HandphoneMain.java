package MakeClass;

import java.util.Arrays;

public class HandphoneMain {

	public static void main(String[] args) {
		// 홍길동, 010-0000-0000 ,  삼성   을 가지는 handphone 객체 hp를 생성.
		
		//객체 생성
		Handphone hp = new Handphone();
		// 값 부여
		hp.name = "홍길동";
		hp.phone = "010-1111-2222";
		hp.company = "삼성";
		
		
		Handphone hp2 = new Handphone();
		hp2.name = "박길동";
		hp2.phone = "010-3333-4444";
		hp2.company = "애플";
		
		Handphone hp3 = new Handphone();
		hp3.name = "정길동";
		hp3.phone = "010-5555-6666";
		hp3.company = "엘지";
		
		System.out.println("=============================================================");
		System.out.println("소유주명 : "+hp.name + ", 전화변호 : "+hp.phone+", 제조사 : "+hp.company);
		System.out.println("소유주명 : "+hp2.name + ", 전화변호 : "+hp2.phone+", 제조사 : "+hp2.company);
		System.out.println("소유주명 : "+hp3.name + ", 전화변호 : "+hp3.phone+", 제조사 : "+hp3.company);
		System.out.println("=============================================================");
		
		
		
		// 배열을 만들어보쟈구~
		Handphone[] hpArr = {hp, hp2, hp3}; // 핸드폰형 type의 배열이다.
		for (int i = 0; i<hpArr.length; i++) { // 배열명[idx].ooo 형식으로 호출할 수 있다.
			System.out.println("소유주 명 : " + hpArr[i].name
								+ ", 전화번호 : " + hpArr[i].phone
								+ ", 제조사 : " + hpArr[i].company);
		}
		System.out.println("=====================< 1.5 버전의 for문 >======================");
		
		for(Handphone h : hpArr) { //1.5버전 Handphone타입의 h
			System.out.println("소유주 명 : " + h.name
					+ ", 전화번호 : " + h.phone
					+ ", 제조사 : " + h.company);
		}
		System.out.println("=============================================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
