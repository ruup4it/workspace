// �񱳿�����
// Relational and Logical Operators
// Boolean �� > ������� true �Ǵ� false 
public class _3_CompareOp {
	public static void main(String[] args) {
		//int x = 10; int y = 20;
		int x = 10, y = 20;
		boolean b;
		
		b = x == y; // false
		System.out.println(b);
		
		b = x != y; // true
		System.out.println(b);
		
		System.out.println(!true);  // false
		System.out.println(!false); // true
		
		b = x > y; // false
		System.out.println(b);

		b = x < y; // true
		System.out.println(b);

		b = x >= y; // false
		System.out.println(b);
		
		b = x <= y; // true
		System.out.println(b);
	}
}
