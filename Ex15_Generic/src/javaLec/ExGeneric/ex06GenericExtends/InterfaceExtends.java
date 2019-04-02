package javaLec.ExGeneric.ex06GenericExtends;

interface MyInterface<T> {
	public T myFunc(T item);
}

class MyImplements<T> implements MyInterface<T> {
	public T myFunc(T item) {
		return item;
	}
}

class MyImplements2 implements MyInterface<String> {
	public String myFunc(String item) {
		return item;
	}
}

public class InterfaceExtends {
	public static void main(String[] args) {

	}
}
