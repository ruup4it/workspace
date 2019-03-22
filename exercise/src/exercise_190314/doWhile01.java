package exercise_190314;

//1. do~while문을 이용해서 1부터 100까지 출력하세요
public class doWhile01 {
	public static void main(String[] args) {
		int num = 0;
		do {
			System.out.println(++num);
		}while(num<100);
	}
}
