package day3;
/*
*
**
***
****
*****
***
**
*
 */
public class ExamMain04 {

	public static void main(String[] args) {
		
		/*
		for (int i = 1; i<=5 ; i++) {
			
			if (i <=5 ) {
				for (int j = 1 ; j <= i ; j++) {
					System.out.print('*');	
				}
			} System.out.println();	
		}
		
		
		for (int h = 1; h<= 4; h++) {
			for (int k = 3; k>=h; k--) {
				System.out.print('*');
			}
			
			System.out.println();
		}*/
		
		/*
		 * for(int i = 1; i<=9; i++){
		 * 	if(i<=5){
		 * 		i개출력
		 * 	} else{
		 * 		10-i 개 출력
		 * 	}
		 * }
		 */
		
		
		for(int i = 1; i<=9; i++) {
			if(i<=5) {
				for(int j = 1; j<=i ; j++) {
					System.out.print('*');
				}System.out.println();
			}else {
				for(int j = 1 ; j <= 10-i ; j++) {
					System.out.print('*');
					
				}System.out.println();
				
			}
		}
		

	}

}
