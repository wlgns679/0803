
public class Output {

	void output(Student [] array) {
		printLable();		// Call by Name
		for(int i = 0; i < array.length; i++) {
		System.out.printf("%d\t%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n",
				array[i].ranking, array[i].hakbun, array[i].name,
				array[i].kor, array[i].eng, array[i].mat, array[i].tot,
				array[i].avg, array[i].grade);
		}
	}
	void printLable() {
		System.out.println("<<<<센텀정보 고등학교 성적관리 프로그램>>>>");
		System.out.println("등수\t학번\t이름\t국어\t영어\t수학\t총점\t평균\t평점");
		System.out.println("------------------------------------------------------------------");
	}
}
