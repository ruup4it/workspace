import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*<프로젝트 순서>
1. 제안 요청서
2. 제안서
3. 요구사항 분석
	1) 인터뷰 - 요구사항(자기도 잘 모르고 하는 얘기가 대다수)
	2) 문서
	3) 화면
4. 요구사항 정리
	1) 엑셀에 일렬로 정리한다.
	2) 요구사항 중에 상위 범위와 하위 범위를 분류한다.
	3) 요구사항 중에 먼저 할 것과 나중에 할 것을 분류한다. (1,2 단계/ 1,2,3단계)
5. 유스케이스를 도출
	분석 단계나 설계 직전 단계
	목적 : 요구사항을 정리한다
		고객이 생각하지 못한 것을 역제안하거나 미리 대비하기 위해 전체 개념화
	1) 유스케이스 다이어그램(그림) - 전체를 개략적으로
	   1) actor : 유스케이스와 인터페이스하는 외부 사람 or 시스템
	   2) usecase : 액터가 시스템과 작용하는 경우
	   3) association : 액터와 usecase가 관련성
	   4) 일반화 관계 : actor, usecase, 보편성<->특수성
	   5) <<include>> : usecase, 반드시 선행되어야하는 것, 1단계 정도, 필요하면 2단계 정도, 다른 usecase에서 공유 가능
	   6) <<extend>>  : usecase, 반드시 할 필요는 없는 것, 1단계 정도, 특정 케이스
	   * 주의할 점 
	   * 기능을 묘사하지 말 것 : 지나치게 상세화 됨
	   * 주어와 동사는 명시할 것 : 동사를 지나치게 추상화하지 말 것
	   * 이름을 사람, 홍길동 < 일반회원, 종업원
	   * 유스케이스에서 대출, 반환, 확인 < 비디오를 대출한다
	   * 표현의 통일 : 대출한다 = 렌탈한다 = 빌린다 = > 대출한다
	   * 유스케이스 규모를 동일하게 한다 : 유스케이스 다이어그램을 참조
	   * 유스케이스의 목적은 시스템의 요구사항을 분석/파악하기 위한 용도
	   * 그러므로 큰 그림을 그리는데 목적이 있다
	   * 그러나 상세한 설명이 없기 때문에 다이어그램만 가지고는
	   * 오해를 일으킬 수 있으므로 유스케이스 정의서와 함께 사용한다.
	2) 유스케이스 정의서 (문장) - 상세 순서
	유스케이스 다이어그램에서 구체적으로 확인할 수 없는 내용을 확인할 수 있게 해준다.
	유스케이스 다이어그램으로 전체 구조를 이해하고, 확인하고 싶은 구체적인 내용은 유스케이스 정의서를 통해 이해한다.
	개발 구현 후 Testcase 항목과 Test Scenario로 활용된다.
6. 아키텍처 설계(프로세스 간 메시지 전달)
 	1) 프로세스는 사각형 , 연관은 선 or 화살표방향으로 메시지 전달
	2) 시퀀스 다이어그램으로 프로세스간의 통신 관계를 표현
7. 클래스 설계
	1) 개념 클래스 모델링 - 이름과 관계만 정의
	2) 논리 클래스 모델링 - 필드와 메서드까지 정의
8. 클래스 설계 방법
	1) 명사 - 동사 추출법
	1-1) 명사 중에 큰 개념과 작은 개념으로 분류한다.
		큰 개념은 클래스의 후보
		작은 개념은 필드의 후보
		1-2) 동사 중에 큰 개념과 작은 개념으로 분류한다.
		큰 개념은 클래스(비즈니스 로직)의 후보
		작은 개념은 메서드의 후보
	2) MVC 구조로 나누기
		2-1) Model : 데이터를 전문으로 관리하는 클래스
		2-2) View : 사용자와 인터페이스 하는 화면
		2-3) Controller : 비즈니스 로직을 담당하는 클래스
9. 클래스 설계의 MVC
	1) 화면, 문서, 고객이 보관하고 싶어하는 클래스를 정의한다
		=> 도메인 객체 (Domain Object)
		떨어지지 않는 데이터는 클래스로 구성한다.
		ex) EmployeeVO
	2) 비즈니스 로직으로 구성된 클래스를 설계한다.
		MVC 중에 Contoller
		~Service, ~Manager, ~Handler, ~Controller 로 종종 되어있다.
		DTO를 주고 받거나 로직을 처리한다.
		클래스에서 데이터를 주고 받는다의 의미는? 상대방의 메서드 호출
		ex) EmployeeService
	3) 화면을 담당하는 클래스를 설계한다.
		MVC 중에 View
		ex) EmployeeUI
	4) 데이터를 관리하는 클래스를 설계한다.
		; 화면이나 비즈니스 로직이 변경되어도 독립적으로 최소한의 변경만 가져올 수 있도록 하기 위해
		MVC 중에 Model
		ex) EmployeeDAO(Data Access Object) : 데이터를 전문으로 처리하는 객체
10. 클래스 설계의 Tip
	1) 떨어지지 않는 데이터는 클래스로 구성한다.
	2) 데이터를 처리하는 역할은 클래스로 구성한다.
	3) 앞으로 자주 사용할 기능들은 하나의 클래스로 구성한다.
		(Utility Class, static 메서드 사용)
	4) 클래스는 1가지 역할에 집중한다.
	내가 맡은 일은 내가 처리, 내가 할 일이 아니면 해당 클래스에 위임

11. 클래스 설계의 Tip2
	1) 필드는 private, 메서드는 public을 기본으로 한다.
	2) 메서드 중에 내부에서만 사용되는 것은 private으로 한다.
	3) 필드의 값의 접근은 getter~, setter~ 메서드로 한다.
	4) 패키지 관점에서 내부에서 사용되는 것은 default 접근권한으로
		패키지 외부에서 사용하는 클래스는 public으로 선언한다.

12. 프로젝트 설계
	1) 요구사항 무작위 정리 -> 상위/하위 구조 분류 -> 우선 순위
	2) 유스케이스 다이어그램/정의서 : 선택사항
	3) 클래스 다이어그램 : 클래스 간의 정적인 관계
	4) 시퀀스 다이어그램 : 객체 간의 메시지 전달(메서드 호출)을 시간 순 객체 간의 동적인 관계
	5) 순서도 : 업무 순서도
		
		
지금까지 설계에 대해서 얘기한 것은 다 잊어라
의천도룡기 : 장삼봉 - 장무기 태극검/태극권
그냥 들어두면 나중에 자연스럽게 흘러나오게 되어있다.
여러분은 맘대로 짜라.
그냥 되기만 하면 OK

본인 성격
1) 관리적 성격 (이성적) : 큰 -> 작은 , 하향식 설계
	ex) 소프트웨어 공학
	정형화, 스탠다드, 이해만 하면 어디서나 규격화 (일 가능)
2) Free		(충동적) : 작은 -> 큰, 상향식 설계
	ex) 해커와 화가 
	무형, 독특함, 마음에 맞는 사람이랑 일해 (소규모 팀, 스튜디어)
	
	
		*/
/*
 * 데이터 그룹
 * MVC 간에 주고 받는 데이터 꾸러미
 * C언어의 구조체 역할
 * DTO (Data Transfer Object)
 * VO (Value Object)
 * TO (Transfer Object)
 */
/*
 * 데이터를 전문으로 처리하는 객체
 * DAO (Data Access Object)
 */

class EmployeeVO { // Model - VO (Value Object)
	// 필드
	private String companyNum;
	private String name;
	private String ssn;

	// 생성자
	public EmployeeVO() {

	}

	public EmployeeVO(String cNum, String name, String ssn) {
		this.companyNum = cNum;
		this.name = name;
		this.ssn = ssn;
	}

	// getter, setter
	public String getCompanyNum() {
		return companyNum;
	}

	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setCompanyNum(String companyNum) {
		this.companyNum = companyNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	// hashCode & equals & toString
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyNum == null) ? 0 : companyNum.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeVO other = (EmployeeVO) obj;
		if (companyNum == null) {
			if (other.companyNum != null)
				return false;
		} else if (!companyNum.equals(other.companyNum))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeVO [companyNum=" + companyNum + ", name=" + name + ", ssn=" + ssn + "]";
	}

}

class EmployeeService { // Contoller
	private EmployeeDAO empDao = new EmployeeDAO();

	public boolean add(EmployeeVO emp) {
		System.out.println("신규 인사 정보를 추가하는 기능 테스트");
		System.out.println(emp.getName());
		System.out.println(emp.getCompanyNum());
		System.out.println(emp.getSsn());
		boolean daoResult = empDao.addNewEmployee(emp);
		return daoResult;
	}

	public void allEmployee() {
		empDao.allEmployee();
	}

}

class EmployeeDAO { // Model - DAO (Data Access Object)
	ArrayList<EmployeeVO> testDB = new ArrayList<EmployeeVO>();

	/** 신규 인사 정보 등록 */
	public boolean addNewEmployee(EmployeeVO emp) {
		boolean result = false;
		testDB.add(emp);
		result = true;
		return result;
	}

	public void allEmployee() {
		Iterator<EmployeeVO> itr = testDB.iterator(); // Iterator 생성

		while (itr.hasNext()) { // 값이 있다면
			System.out.println("===================");
			System.out.println(itr.next());
		}
		System.out.println("===================");
	}

}

class EmployeeUI { // View
	private Scanner scanner = new Scanner(System.in);
	private EmployeeService service = new EmployeeService();

	public void printMenu() {
		System.out.println("========메뉴========");
		System.out.println("1. 신규 인사 정보 등록");
		System.out.println("2. 인사 정보 전체 조회");
		System.out.println("3. 인사 정보 검색");
		System.out.println("4. 인사 정보 수정");
		System.out.println("5. 인사 정보 삭제");
		System.out.println("6. 프로그램 종료");
	}

	/** 신규 인사 정보 등록 */
	public void regist() {
		System.out.println("<신규 인사 정보 등록>");
		System.out.println("이름을 입력하세요");
		System.out.print("입력 >>");
		String name = scanner.nextLine();

		System.out.println("사번을 입력하세요");
		System.out.print("입력 >>");
		String cNum = scanner.nextLine();

		System.out.println("주민번호를 입력하세요");
		System.out.print("입력 >>");
		String ssn = scanner.nextLine();

		System.out.println("입력한 정보는 다음과 같습니다.");
		System.out.println(name + " : " + cNum + " : " + ssn);

		EmployeeVO emp = new EmployeeVO(cNum, name, ssn);
		boolean addResult = service.add(emp);
		System.out.println("서비스에서 처리된 결과: " + addResult + "\n");
	}

	// 전체 정보 출력
	public void allEmployee() {
		service.allEmployee();
	}

}

public class ProjectOrder {
	public static void main(String[] args) {
		EmployeeUI empUI = new EmployeeUI();
		empUI.regist();
		empUI.regist();
		empUI.regist();
		empUI.allEmployee();
	}
}
