package javaLec.ExAbstract.ex02AbstractEmployee;

public abstract class Employee {
	protected String empno;
	protected String name;
	protected int pay;
	
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	public abstract double getMonthPay();
	
	// Object클래스의 상속을 받은 메서드
	/* System.out.println(객체);	// null or hashCode
	 * System.out.println(String객체); // 문자열 내용
	 * 종종 객체의 정보를 hashcode대신 원하는 정보로 표현하고 
	 * 싶을 때 Object로부터 상속받은 toString()을 Overriding
	 * 해서 가공해서 사용한다.
	 * */
	public String toString() {
		return empno + ":" + name + ":" + pay;
	}
}




