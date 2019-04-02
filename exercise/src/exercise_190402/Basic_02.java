package exercise_190402;

//2. 다음 프로그램은 ArrayList에 20개의 임의의 실수를 삽입하고 모든 실수를 출력하는
//프로그램이다. 모든 실수를 출력하는 부분을 Iterator를 이용하여 수정하라.

import java.util.ArrayList;
import java.util.Iterator;

public class Basic_02 {
	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<Double>();
		for (int i = 0; i < 20; i++) {
			double d = Math.random() * 100;
			a.add(d);
		}
		// 수정 전
		//for (int i = 0; i < 20; i++)
		//	System.out.println(a.get(i));
		
		// 수정 후 
		Iterator<Double> itr = a.iterator(); 
		while (itr.hasNext()) { // 값이 있다면
			System.out.println(itr.next());	// 찍어주고
		}
	}
}
