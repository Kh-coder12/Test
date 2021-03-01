package sec01.exam01;

public class ViriableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y:" + y);
		// temp 에 x값 3을 저장 
		int temp = x;
		// x값에 y값 5를 저장 => x = 5 y = 5
		x = y;
		// y 값에 temp 값 3 을 저장 
		y = temp;
		System.out.println("x: " + x + ", y:" + y);
		
		// TODO Auto-generated method stub

	}

}
