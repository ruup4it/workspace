package javaLec.ExOverriding.ex05Overriding;

public class Speaker {
	private int volumeRate;
	void showCurrentState() {
		System.out.println("볼륨 크기: " + volumeRate);
	}
	void setVolume(int vol) {
		volumeRate = vol;
	}
}
