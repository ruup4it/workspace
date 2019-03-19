// ��Ʈ �� ������
// Java���� ���� �� �� ����
// �׳� �ֱ��� 
// |(or), &(and), ^(xor)
// |(or)  : ��Ʈ���� �� �� 1 ���� 1�̸� 1
// &(and) : ��Ʈ���� �� �� 1�̾�� 1
// ^(xor) : ��Ʈ���� ������ 0, �ٸ��� 1

public class _4_BitOp {
	public static void main(String[] args) {
		int x = 3; // 00000011
		int y = 2; // 00000010
				   
		System.out.println(x|y); // 00000011 : 3
		System.out.println(x&y); // 00000010 : 2
		System.out.println(x^y); // 00000001 : 1
		
		x = 16; // 00010000
		y = 8;  // 00001000
		System.out.println(x|y); // 00011000 : 24
		System.out.println(x&y); // 00000000 : 0 
		System.out.println(x^y); // 00011000 : 24
	}
}
