package IceCream;


// 이곳은 하나의 아이스크림에 관한 class이다.
public class IceCream {

	String name;
	int price;
	
	
	void set(String n, int p) {
		name = n;
		price = p;
		
	}
	
	
	
	
	/*
	 .name, ,price 이렇게 멤버변수를 써주는 것은 좋지 않다. (멤버변수를 고칠 수도 있기 때문.)
	 멤버변수보다는 메소드로 통신하는 게 좋다.
	 그래서 getName, getPrice로 name과 price 를 받는 메소드를 생성한다.
	*/
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}
	
	
	// 이렇게 해주면 IceCream 클래스에서 멤버변수를 바꿔줘도 IceCreamMarket에서 문제가 없다.(변화에 둔감)
	
	
	void print() {
		System.out.println(name + "\t" + price);
	}
	
	
	
	
}//c
