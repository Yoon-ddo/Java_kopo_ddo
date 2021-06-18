package Method;

public class Methodclass {
	
	/*  반환형, 메소드명([매개변수]){ 
		....;
	
	} // 매개변수는 있을수도있고 없을수도 있다.
	
	*/
	static int printStar(){
		System.out.println("**********");
		
		return 50;
	}

	public static void main(String[] args) {
		printStar();
		System.out.println("ddd?");
		int k = printStar(); // 변수로 return값이 들어가고, "**********" 출력
		System.out.println(k);

	}

}
