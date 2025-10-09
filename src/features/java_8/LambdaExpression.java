package features.java_8;

public class LambdaExpression {
	/*
	 * Lambda expression is a new and important feature of Java which was included
	 * in Java SE 8. It provides a clear and concise way to represent one method
	 * interface using an expression. It is very useful in collection library. It
	 * helps to iterate, filter and extract data from collection. The Lambda
	 * expression is used to provide the implementation of an interface which has
	 * functional interface. It saves a lot of code. In case of lambda expression,
	 * we don't need to define the method again for providing the implementation.
	 * Here, we just write the implementation code. Java lambda expression is
	 * treated as a function, so compiler does not create .class file.
	 */
	public static void main(String[] args) {
		System.out.println("\"Lamda Expression....\"" + "\n");

		Lambda d2 = () -> {
			// System.out.println("lamda expression");
			return 15;
		};

		int display = d2.display();

		System.out.println(display);
	}
}

@FunctionalInterface // It is optional
interface Lambda {
	int  display();
}