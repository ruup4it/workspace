/* �л��� ��ħ�� �Ͼ�� �غ��ϰ� �����ϴ� ���� �ϰ��� Ŭ������ ���弼��*/
class Student {
	int tiredness = 0;
	String clean = "";
	
	// ������
	Student(){
		
	}

	public void sleep() {
		tiredness -= 60;
		System.out.println(String.format("���� �ǰﵵ: %d", tiredness));
	}

	public void drinkBeer() {
		tiredness -= 30;
		System.out.println(String.format("���ָ��ñ� �ǰﵵ: %d", tiredness));
	}

	public void groupStudy() {
		tiredness += 20;
		System.out.println(String.format("���͵��ϱ� �ǰﵵ: %d", tiredness));
	}

	public void doHomework() {
		tiredness += 20;
		
		System.out.println(String.format("�����ϱ� �ǰﵵ: %d", tiredness));
	}

	public void haveLunch() {
		System.out.println(String.format("Ŀ�ǻ���� �ǰﵵ: %d", tiredness));
		
	}

	public void takeAClass() {
		tiredness += 30;
		System.out.println(String.format("������� �ǰﵵ: %d", tiredness));
	}

	public void drinkCoffee() {
		tiredness -= 3;
		System.out.println(String.format("Ŀ�� ���ñ� �ǰﵵ: %d", tiredness));
	}

	public void wash() {
		clean ="����";
		System.out.println(String.format("�ı� û�ᵵ: %s", clean));
	}

	public void smoking() {
		tiredness -= 10;
		System.out.println(String.format("�ٶ����� �ǰﵵ: %d", tiredness));
	}

	public void wakeUp() {
		tiredness += 10;
		System.out.println(String.format("�Ͼ�� �ǰﵵ: %d", tiredness));
	}
	
	
	
}

public class _06_Student {
	public static void main(String[] args) {
		Student st = new Student();
		// �Ͼ��
		st.wakeUp();
		// �� ���
		st.smoking();
		// �ı�
		st.wash();
		// ����Ÿ��
		st.takeAClass();
		// Ŀ�� ���
		st.drinkCoffee();
		// �������
		st.takeAClass();
		// ���ɸԱ�
		st.haveLunch();
		// �����ϱ�
		st.doHomework();
		// ���͵��ϱ�
		st.groupStudy();
		// ���� ���ñ�
		st.drinkBeer();
		// ���ڱ�
		st.sleep();
	}
}
