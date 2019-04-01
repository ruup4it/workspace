package exercise_190401_Advance_03;

import java.util.Scanner;

import exercise_190401_Advance_03.MenuType;

//ProductInfo클래스를 만들고 이곳에 main()을 둔다.
//main()에서는 최대 10개의 상품을 추가할 수 있으며 모든 상품의 정보를 조회할 수 있다.
//모든 제품에 대한 정보를 출력할 때 Product타입의 레퍼런스를 이용하라.

class ProductManager implements MenuType {
	// 제품을 담을 Product 타입의 레퍼런스 배열 > 크기는 10
	final int MAX_CNT = 10;
	Product[] productStorage = new Product[MAX_CNT];
	int curCnt = 0; // 참고용 배열 인덱스

	// Book(책) 정보를 입력 받아 객체 생성
	private Product readBookInfo() {
		System.out.print("상품 설명 : ");
		String description = MenuViewer.keyboard.nextLine();
		System.out.print("생산자 : ");
		String productor = MenuViewer.keyboard.nextLine();
		System.out.print("가격 : ");
		String price = MenuViewer.keyboard.nextLine();
		System.out.print("책 제목 : ");
		String title = MenuViewer.keyboard.nextLine();
		System.out.print("저자 : ");
		String author = MenuViewer.keyboard.nextLine();
		System.out.print("ISBN번호 : ");
		int numISBN = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		return new Book(description, productor, price, numISBN, author, title);
	}
	
	// CompactDisc(음악CD) 정보를 입력 받아 객체 생성
	private Product readCompactDiscInfo() {
		System.out.print("상품 설명 : ");
		String description = MenuViewer.keyboard.nextLine();
		System.out.print("생산자 : ");
		String productor = MenuViewer.keyboard.nextLine();
		System.out.print("가격 : ");
		String price = MenuViewer.keyboard.nextLine();

		System.out.print("앨범 제목 : ");
		String albumTitle = MenuViewer.keyboard.nextLine();
		System.out.print("가수 이름 : ");
		String singer = MenuViewer.keyboard.nextLine();
		return new CompactDisc(description, productor, price, albumTitle, singer);
	}
	
	// ConversationBook(회화책) 정보를 입력 받아 객체 생성
	private Product readConversationBookInfo() {
		System.out.print("상품 설명 : ");
		String description = MenuViewer.keyboard.nextLine();
		System.out.print("생산자 : ");
		String productor = MenuViewer.keyboard.nextLine();
		System.out.print("가격 : ");
		String price = MenuViewer.keyboard.nextLine();
		
		System.out.print("책 제목 : ");
		String title = MenuViewer.keyboard.nextLine();
		System.out.print("저자 : ");
		String author = MenuViewer.keyboard.nextLine();
		System.out.print("언어 : ");
		String language = MenuViewer.keyboard.nextLine();
		System.out.print("ISBN번호 : ");
		int numISBN = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		
		return new ConversationBook(description, productor, price, numISBN, author, title, language);
	}

	// (1) 상품 추가
	public void inputData(int choice) {
		Product product = null;
		switch (choice) {
		case BOOK:
			product = readBookInfo();
			break;
		case COMPACT_DISC:
			product = readCompactDiscInfo();
			break;
		case CONVERSATION_BOOK:
			product = readConversationBookInfo();
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		productStorage[curCnt++] = product;
		System.out.println("\n데이터 입력이 완료되었습니다.");
	}
	
	// (2) 모든 상품 조회
	public void lookupData() {
		for (int idx = 0; idx < curCnt; idx++)
			System.out.println(productStorage[idx]);
	}
}

class MenuViewer {
	public static Scanner keyboard = new Scanner(System.in);
	
	// 메인 메뉴
	public static void showMenu() {
		System.out.println("===============================");
		System.out.println("<<메뉴 선택>>");
		System.out.println("(1)상품 추가  (2)모든 상품 조회   (3)끝내기");
		System.out.print("선택 >> ");
	}
	
	// 상품 메뉴
	public static void showProductMenu() {
		System.out.println("===============================");
		System.out.println("<<상품 종류>>");
		System.out.println("(1)책  (2)음악CD  (3)회화책");
		System.out.print("선택>> ");
	}

}

public class ProductInfo {
	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		int choice;

		while (true) {
			MenuViewer.showMenu();
			choice = MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine();

			switch (choice) {
			case 1: // 추가
				MenuViewer.showProductMenu();
				choice = MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();
				manager.inputData(choice);
				break;
			case 2: // 조회
				manager.lookupData();
				break;
			case 3: // 종료
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}

	}
}
