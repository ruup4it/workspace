package javaLec.ExInterface.ex03_IMP3;
/* 2) B는 Camp로부터 mp3제작을 의리받았다
 * 그래서 구현해야할 목록인 interface를 상속받은
 * BMP3 클래스를 제작하고
 * 구현에 들어간다
 * 구현이 끝나면 다시 Camp에 보낼 것이다.
 * 
 * */
public class BMP3 implements IMP3 {

	@Override
	public void playMp3() {
		System.out.println("음악이 부드럽게 들린다.");

	}

	@Override
	public void listenFM() {
		System.out.println("라디오를 들었더니 잠이 온다");

	}

	@Override
	public void viewPhoto() {
		System.out.println("사진이 실물보다 낫게 표현된다.");

	}

}
