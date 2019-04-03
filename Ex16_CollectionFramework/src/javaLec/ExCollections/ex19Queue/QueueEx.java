package javaLec.ExCollections.ex19Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("홍길동");
		queue.add("임꺽정");
		queue.add("장길산");
		queue.add("일지매");
		while(!queue.isEmpty())
			System.out.println(queue.remove());
		
	}
}
