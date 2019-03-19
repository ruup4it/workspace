import java.util.Scanner;

/* (1차원 String배열)
 * 3명 학생의 이름을 입력받고 ["학생1","학생2","학생3"]
 * (2차원 double배열)[학생1][국,영,수][학생2][국,영,수][학생3][국,영,수]
 * 3명 학생의 국, 영, 수 점수를 입력 받고 배열에 저장
 * */
public class _15_InputMultiArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int STNUM = 3;
		final int SUBJECT = 3;
		String[] studentArr = new String[STNUM];
		int[][] scoreArr = new int[STNUM][SUBJECT];
		String[] subjectArr = {"국어","영어","수학"};
		double[] sum = new double [SUBJECT];
		double[] avg = new double [SUBJECT];
		for (int i = 0; i < STNUM; i++) {
			System.out.println("학생 이름을 작성하세요.");
			studentArr[i] = scan.next();
		}
		for(int i = 0; i<scoreArr.length;i++) {
			for(int j =0;j<scoreArr[i].length;j++) {
				System.out.print(String.format("%s의 %s 과목 점수를 작성하세요 ", studentArr[i],subjectArr[j]));
				scoreArr[i][j] = scan.nextInt();
				sum[i] += (double)scoreArr[i][j];
 			}
			avg[i] = (double)sum[i]/SUBJECT;
		}
		for(int i = 0; i<scoreArr.length;i++) {
			System.out.println(String.format("=======%s=======",studentArr[i]));
			for(int j =0;j<scoreArr[i].length;j++) {
				System.out.println(String.format("%s 과목 점수 : %d",subjectArr[j],scoreArr[i][j]));
				}
				System.out.println(String.format("총점 : %.2f, 평균: %.2f",sum[i],avg[i]));
		}
		
		for(int i=0;i<SUBJECT;i++) {
			System.out.println("================");
			double sum1 = 0;
			for(int j=0;j<STNUM;j++) {
				sum1 += scoreArr[j][i];
			}
			if(i==0) {
				System.out.println("국어 총점: " + sum1);
				System.out.println("국어 평균: " + sum1/SUBJECT);
			}else if(i==1) {
				System.out.println("영어 총점: " + sum1);
				System.out.println("영어 평균: " + sum1/SUBJECT);				
			}else {
				System.out.println("수학 총점: " + sum1);
				System.out.println("수학 평균: " + sum1/SUBJECT);				
			}
		}
		
		scan.close();
	}
}
