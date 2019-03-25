package Product;

import java.util.ArrayList;

//보유재산
//상품(이름,가격,재고) 5종류
//
//상품재고확인(팔린거, 안팔린거)
//상품가격수정
//상품판매하기
//보유재산확인
class Product {
	String name;
	int price;
	int quantity;
	int sold;

	Product(String n, int p, int q) {
		name = n;
		price = p;
		quantity = q;
		sold = 0;
	}

	public void getProduct() {
		System.out.println(String.format(
				"======================\n상품명\t: %s\n가격\t: %d\n남은 수량\t: %d\n팔린 수량\t: %d"
				, name, price, quantity, sold));
	}

}

public class ProductMain{
	public static void main(String[] args) {
		ArrayList<Product> shop= new ArrayList<Product>();
		Product product = new Product("상품1",15000,23);
		product.getProduct();
		shop.add(product);

		//int index = shop.indexOf(0);
		//System.out.println(index);
	}
	
}
