package javaLec._class.ex03classToClass;

import java.util.Scanner;

public class PencilMain {
	public static void main(String[] args) {
		PencilSeller seller = new PencilSeller();
		PencilBuyer buyer = new PencilBuyer();
		Scanner scan = new Scanner(System.in);
		System.out.println("나는 친구에게 연필을 구매한다. (1자루는 1000원)\n몇 자루를 구매할 것인가? " + "\n1자루(1입력)\n2자루(2입력)");
		int num = scan.nextInt() * 1000;
		seller.salePencil(buyer, num);
		seller.showSaleResult();
		buyer.showBuyResult();
		scan.close();
	}

}
