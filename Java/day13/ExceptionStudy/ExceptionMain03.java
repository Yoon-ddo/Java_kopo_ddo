package ExceptionStudy;


	
abstract class Parent{ 
	// abstract클래스에서 throws Exception을 선언해주고 시작하면 더 안정적이다.
	public abstract void print();
	public abstract void scan() throws Exception;
}

class Child extends Parent{

	@Override
	public void print() {
		System.out.println("print");
		
	}

	@Override
	public void scan() throws Exception {
		System.out.println("scan");
		
	}

}
	
public class ExceptionMain03 {
	public static void main(String[] args) throws Exception {
		
		Child obj = new Child();
		try {
			obj.scan();			
		} catch(Exception e) {
			
		}

	}

}
