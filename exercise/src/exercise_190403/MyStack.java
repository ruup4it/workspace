package exercise_190403;

import java.util.LinkedList;

public class MyStack<T> implements Stack {
	LinkedList<T> lList = new LinkedList<T>();

	@Override
	public Object pop() {
		return lList.pop();
	}

	@Override
	public boolean push(Object ob) {
		if ((T) ob != null) {
			lList.push((T) ob);
			return true;
		} else
			return false;

	}

}
