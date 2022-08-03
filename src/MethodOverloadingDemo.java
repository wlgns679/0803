// 중복정의
// Method Overloding : 메소드의 이름이 같을 때 그 메소드의 파라미터로 구별하는 기능
// 1) Method의 이름이 같아야한다
//2 ) 반드시 Method의 파라미터는 서로 달라야한다
// 3) Method의 return타입은 같거나 다르거나 상관없다.

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		System.out.println(add(34.5, 67.8));
		
	}
	static int add(int a, int b) {
		return a+ b;
	}
	static int add(int a, int b, int c) {
		return a + b + c;
	}
	static double add(double a, double b) {
		return a + b;
	}
}
