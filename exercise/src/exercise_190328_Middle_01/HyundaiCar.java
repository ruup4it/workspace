package exercise_190328_Middle_01;

public class HyundaiCar implements ICar {

	@Override
	public void startEngine() {
		System.out.println("힘차다");
		
	}

	@Override
	public void speedUp() {
		System.out.println("빠르다");
		
	}

	@Override
	public void speedDown() {
		System.out.println("느리다");
		
	}

	@Override
	public void hitBreak() {
		System.out.println("멈춘다");
		
	}

}
