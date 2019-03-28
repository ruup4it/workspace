package exercise_190328_Middle_01;

public class KiaCar implements ICar {

	@Override
	public void startEngine() {
		System.out.println("빠르게 엔진이 작동한다.");
		
	}

	@Override
	public void speedUp() {
		System.out.println("속도가 좀처럼 증가하지 않는다.");
		
	}

	@Override
	public void speedDown() {
		System.out.println("속도가 빠르게 줄어든다");
		
	}

	@Override
	public void hitBreak() {
		System.out.println("브레이크가 뻑뻑하다");
		
	}

}
