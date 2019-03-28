package exercise_190328_Middle_01;


public class CarTestManager {
	ICar car;

	CarTestManager(ICar car) {
		setCar(car);
	}

	void setCar(ICar car) {
		this.car = car;
	}

	void engineTest() {
		car.startEngine();
	}

	void speedUpTest() {
		car.speedUp();
	}

	void speedDownTest() {
		car.speedDown();
	}

	void breakTest() {
		car.hitBreak();
	}
}
