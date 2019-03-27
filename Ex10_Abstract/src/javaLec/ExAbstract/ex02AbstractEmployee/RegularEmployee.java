package javaLec.ExAbstract.ex02AbstractEmployee;

public class RegularEmployee extends Employee {
	int bonus;
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}

	@Override
	public double getMonthPay() {
		double mPay = (pay/(double)12)+(bonus/(double)12);
		return mPay;
	}

}
