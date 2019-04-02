package javaLec.ExCollections.ex14HashMap;

import java.util.HashMap;

/* Hash는 Hash 알고리즘으로 정확한 위치에 데이터 저장/ 검색
 * set : value 값을 Hash화해서 저장/검색
 * Map : Key/value가 있고 key를 Hash화해서 위치를 지정 후 저장하는 것은 value를 저장한다.
 * 		 key : 계좌번호
 * 		 value : 돈
 * Map == 유사어 Dictionary 구조 
 * */
public class IntroHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(3, "홍길동");
		hMap.put(new Integer(5), "임꺽정");
		hMap.put(8, "장길산");

		System.out.println(hMap.get(8));
		System.out.println(hMap.get(5));
		System.out.println(hMap.get(3));

		hMap.remove(5);
		System.out.println("삭제 후 " + hMap.get(5));
	}
}
