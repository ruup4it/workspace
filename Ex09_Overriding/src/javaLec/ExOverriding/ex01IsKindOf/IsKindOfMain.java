package javaLec.ExOverriding.ex01IsKindOf;

public class IsKindOfMain {

	public static void main(String[] args) {
		NotebookComp nc = new NotebookComp("홍길동",5);
		TabletNotebook tn = new TabletNotebook("임꺽정", 5, "ISE-111-222");
		nc.movingCal();
		tn.write("AAA-222-333");
		tn.write("ISE-111-222");
	}

}
