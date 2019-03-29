package javaLec.ExInterface.ex03_IMP3;

/* 제작회사들이 mp3를 제작(구현)할 동안
 * Camp는 IMP3라는 interface 즉, 규약을 통해 
 * 미리 상대 클래스가 없어도 Test 관리 프로그램의 
 * 제작에 들어갈 수 있다.
 * 
 * */
public class MP3TestManager {
	IMP3 mp3;

	/*
	 * 마틴 파울러는 이것을 의존성 주입(Dependency Injection) 클래스 내부에서 결정하지 않고, 외부에서 상속받은 다양한 객체를
	 * 전달할 수 있으므로 프로그램 설계의 유연성을 가져올 수 있다.
	 */
	MP3TestManager(IMP3 mp3) {
		setMP3(mp3);
	}

	void setMP3(IMP3 mp3) {
		this.mp3 = mp3;
	}

	void allTest(int cnt) throws InterruptedException {
		for (int i = 0; i < cnt; i++) {
			System.out.println("**** " + mp3 + " *****");
			mp3.listenFM();
			Thread.sleep(500);
			mp3.playMp3();
			Thread.sleep(500);
			mp3.viewPhoto();
			Thread.sleep(500);
		}
	}

	void listenTest() {
		mp3.listenFM();
	}

	void playTest() {
		mp3.playMp3();
	}

	void viewTest() {
		mp3.viewPhoto();
	}
}
