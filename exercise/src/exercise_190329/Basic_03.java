package exercise_190329;

//3. Math.random() 메서드를 이용하여 10에서 50사이의 난수 10개를 화면에
//   출력하는 프로그램을 작성하세요
//Math.random()
//double형 0~1 소숫점 0.xxxxx
//int로 강제형변환하면 소숫점 이하가 버려져
//Math.random() * 10 : 0~9
//Math.random() * 10 + 1 : 1~10
//
//Math.random() * 11 : 0~10
//Math.random() * 11 +1 : 1~11
public class Basic_03 {
	public static void main(String[] args) {
		for(int i =0 ; i<100; i++) {
			int num = (int)(Math.random()*11)+1;
			System.out.println(num);
		}
		
	
// 두번째 방법
//		int num = 0;
//		for(int i =0; i<10; i++) {
//			num = (int)(Math.random() * 41) + 10;
//			System.out.println("[" + (i+1) + "/10] : " + num);
//		}
		
//		int count = 0;
//		do {
//			num = (int)(Math.random() * 50) + 1;
//			if (num >= 10 && num <= 50) {
//				count++;
//				System.out.println("[" + count + "/10] : " + num);
//			}
//		} while (count != 10);

	}
}
