package exercise_190314;

//2. do~while문을 이용해서 10부터 20까지 출력하세요
public class doWhile02 {
	public static void main(String[] args) {
		int num = 10;
		do {
			System.out.println(num++);
		} while (num <= 20);
	}
}
