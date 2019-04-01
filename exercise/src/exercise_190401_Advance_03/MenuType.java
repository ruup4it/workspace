package exercise_190401_Advance_03;

public interface MenuType {
	// (1)상품 추가 
	// (2)모든 상품 조회
	// (3)끝내기
	int INSERT = 1, SEARCH = 2, EXIT_PROGRAM =3;
	
	// (1) 책
	// (2) 음악CD
	// (3) 회화책
	int BOOK = 1, COMPACT_DISC = 2, CONVERSATION_BOOK =3;
}