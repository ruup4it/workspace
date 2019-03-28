package javaLec.ExInterface.ex03_IMP3;

/* 2) C는 Camp로부터 mp3제작을 의리받았다
 * 그래서 구현해야할 목록인 interface를 상속받은
 * CMP3 클래스를 제작하고
 * 구현에 들어간다
 * 구현이 끝나면 다시 Camp에 보낼 것이다.
 * 
 * */
public class CMP3 implements IMP3 {

	@Override
	public void playMp3() {
		System.out.println("갑자기 끊긴다");
	}

	@Override
	public void listenFM() {
		System.out.println("지지직 거린다.");
	}

	@Override
	public void viewPhoto() {
		System.out.println("화질이 깨져서 보인다");
	}

}
