package features.java_8;

import java.util.Optional;

public class OptionalClass {
	/*
	 * Java introduced a new class Optional in jdk8. It is a public final class and
	 * used to deal with NullPointerException in Java application. You must import
	 * java.util package to use this class. It provides methods which are used to
	 * check the presence of value for particular variable.
	 */
	public static void main(String[] args) {
		String[] str = new String[10];
		str[5] = "AmolG";

		Optional<String> checkNull = Optional.ofNullable(str[5]);

		if (checkNull.isPresent()) {
			String word = str[5].toLowerCase();
			System.out.print(word);
		} else
			System.out.println("String is null");
	}
}
