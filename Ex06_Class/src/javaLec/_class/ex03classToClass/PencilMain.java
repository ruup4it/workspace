package javaLec._class.ex03classToClass;

import java.util.Scanner;

public class PencilMain {
	public static void main(String[] args) {
		PencilSeller seller = new PencilSeller();
		PencilBuyer buyer = new PencilBuyer();
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ģ������ ������ �����Ѵ�. (1�ڷ�� 1000��)\n�� �ڷ縦 ������ ���ΰ�? " + "\n1�ڷ�(1�Է�)\n2�ڷ�(2�Է�)");
		int num = scan.nextInt() * 1000;
		seller.salePencil(buyer, num);
		seller.showSaleResult();
		buyer.showBuyResult();
		scan.close();
	}

}
