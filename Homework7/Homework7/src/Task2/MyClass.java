package Task2;

public class MyClass {

	public static void main(String[] args) {
		try {
			myMethod();
		} catch (MyException me) {
			me.printStackTrace();
		}
	}

	public static void myMethod() throws MyException {
		throw new MyException("My Exception was thrown.");
	}
}