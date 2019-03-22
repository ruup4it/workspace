import java.util.Arrays;
import java.util.Scanner;

/* 7개의 double 배열을 할당하세요
 * 앞의 5개에는 성적을 입력받고 
 * 6번째 총점
 * 7번째 평균을 계산하고 넣고
 * 출력하세요
 * */
public class _14_InputArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] arr = new double[7];
		Arrays.fill(arr,0);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("성적을 입력하세요");
			arr[i] = scan.nextDouble();
			arr[5] += arr[i];
		}
		arr[6] = arr[5]/5;
		System.out.println(Arrays.toString(arr)+"총점 : "+arr[5]+" 평균 : " +arr[6]);
		
		scan.close();
	} 
}
