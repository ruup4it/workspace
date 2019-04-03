package javaLec.ExCollections.ex18Stack;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < 5; i++) {
			System.out.println(s.push(i));
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {

			System.out.print(s.pop());
			System.out.println(" [size : " + s.size()+"]");
		}
	}
}
