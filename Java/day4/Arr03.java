package Subject;
//다차원 배열 
public class Arr03 {

	public static void main(String[] args) {
		
		// 배열 생성
		int [][] arr = new int[2][4];
		//int [][] arr = new int[2][]; 
		// 주소값이 null, length는 에러가 나기 때문에
		//arr[0] = new int[5];
		//arr[1] = new int[3];
		// ---이런식으로 값을 정해줘야 에러가 안난다.
		System.out.println("arr : "+ arr);
		System.out.println("arr.length : "+ arr.length);
		
		// 배열 출력
		for (int i= 0; i <arr.length ; i++) {
			System.out.println("arr["+i+"] 의 주소값 : " +arr[i]); //주소값..
			System.out.println("arr["+i+"].length : " +arr[i].length);
		}
		

	}

}