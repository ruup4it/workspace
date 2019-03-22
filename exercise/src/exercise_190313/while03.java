package exercise_190313;

// 3. while문을 이용해서 1부터 10까지 합을 출력하세요

public class while03 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println(sum);
	}
}
