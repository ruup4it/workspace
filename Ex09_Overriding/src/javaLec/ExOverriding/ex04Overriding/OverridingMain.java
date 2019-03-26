package javaLec.ExOverriding.ex04Overriding;

public class OverridingMain {
	public static void main(String[] args) {
		BaseEnSpeaker base = new BaseEnSpeaker();
		base.setVolume(10);
		base.setBaseRate(20);
		base.showCurrentState();
	}
}
