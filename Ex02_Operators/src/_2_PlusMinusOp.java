// 증감연산자
// Increment and Decrement Operators
public class _2_PlusMinusOp {
	public static void main(String[] args) {
		int num = 10;
		// 독립적으로 사용될 때는 1증가 or 1 감소
		num++; // num = num + 1;
		System.out.println(num);
		
		++num;
		System.out.println(num);
		
		num--; // num = num - 1;
		System.out.println(num);
		
		--num;
		System.out.println(num);
	
		System.out.println("===============");
	
		num = 10;
		
		// ++num
		// num 값을 먼저 1 증가 시킨 후에 temp에 담기
		int temp = ++num;
		System.out.println("num = 10;");
		System.out.println("temp = ++num;");
		System.out.println("num 값을 먼저 1 증가 시킨 후에 temp에 담기");
		System.out.println("num : " + num);
		System.out.println("temp : " + temp);
		
		System.out.println("===============");
		
		num = 10;
		
		// num++
		// num 값을 temp에 담은 후에 1 증가
		temp = num++;
		System.out.println("num = 10;");
		System.out.println("temp = num++;");
		System.out.println("num 값을 temp에 담은 후에 1 증가");
		System.out.println("num : " + num);
		System.out.println("temp : " + temp);
		
		// -- 역시 ++과 동일하다.
		
		System.out.println("===============");
		
		num = 10;
		System.out.println(++num);
		
		num = 10;
		System.out.println(num++);
		
	}
}
