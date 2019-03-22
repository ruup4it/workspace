package exercise_190318;

//4. 전달된 값이 소수인지 아닌지 판단하여, 소수인 경우 true를, 소수가 아닌 경우 false를 반환하는 메서드를 정의하고 
//이를 이용해서 1이상 100이하의 소수가 전부 출력할 수 있도록 main을 구성하세요
//소수는 1외에 자기자신으로만 나뉘어지는 수입니다

public class Middle_04 {
	
	// 소수인지 판단하는 메서드
	// 리턴값 : boolean형 (true or false 반환)
	// 메서드명 : prime
	// 매개변수 : int형 변수
	public static boolean prime(int num) {
		int count = 0; // 나머지가 0인 경우의 수를 담아줄 변수 선언
		for (int i = 1; i <= num; i++) { // 1부터 매개변수까지 반복
			if (num % i == 0) {  // 나머지가 0이라면 
				count++;			// 카운트 증가
			}
		}
		if (count == 2) { 	// 1과 자신만으로만 나뉘어져야 하므로 count가 2일때
			return true; 	// true 반환
		} else {			// 아니라면
			return false;   // false 
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) { // 1부터 100까지 반복
			boolean isPrime = prime(i); // prime 메서드의 리턴 값을 isPrime 변수에  저장
			if (isPrime) { // if(true)
				System.out.print(String.format("%d ",i)); //출력
			}
		}
	}

}
