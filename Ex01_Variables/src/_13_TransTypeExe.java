// 총합과 평균을 구하기 
public class _13_TransTypeExe {
	public static void main(String[] args) {
		int score0 = 99, score1 = 80, score2 = 77;
		int sum = 0;
		double avg = 0;
		sum = score0 + score1 + score2;
		avg = (double) sum / 3;
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
	}
}