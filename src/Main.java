
public class Main {
	public static void main(String[] args) {
		System.out.println("성적관리프로그램 시작");
		Student jimin = new Student();
		Input input = new Input();		input.input(jimin);
		Calc	 clac = new clac();		calc.calc(jimin);
		Output output = new Output();	output.output(jimin);
		
		System.out.println("성적관리프로그램 끝");
	}
}
