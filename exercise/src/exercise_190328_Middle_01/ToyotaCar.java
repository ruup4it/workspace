package exercise_190328_Middle_01;

public class ToyotaCar implements ICar {

	@Override
	public void startEngine() {
		System.out.println("시동이 시원치 않다");
		
	}

	@Override
	public void speedUp() {
		System.out.println("속도가 느리게 증가한다.");
		
	}

	@Override
	public void speedDown() {
		System.out.println("속도가 느리게 감소한다.");
		
	}

	@Override
	public void hitBreak() {
		System.out.println("급제동이 걸린다");
		
	}

}
