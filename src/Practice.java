import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		System.out.print(" 수 입력 :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += add(i);
		}
		System.out.printf("sum : %d", sum);
	}
	static int add(int max) {
		int sum = 0;
		for(int i = 1; i <= max; i++) {
			sum += i;
		} return sum;
	}
}
