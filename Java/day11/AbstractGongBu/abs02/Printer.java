package AbstractGongBu.abs02;
/*어차피 프린터는같은데 회사가 뭔들 바뀌어도 인쇄만 잘되면 돼!
* 표준안을 만들자!
* 
*  추상클래스를 안쓴다고 답이안나오는 것은 아니지만
*  기계가 바뀌어도 프린터의 기능을 하게 하고 싶다거나
*  변화가 생겼을 때 민감하지 않도록 하는데 쓰인다.
*  
*/
abstract public class Printer {
	
	String productName;	
	abstract public void print();

}
