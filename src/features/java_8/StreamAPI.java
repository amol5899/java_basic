package features.java_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String str[]) {

		// Create a simple stream and print all elements
		Stream.of("Apple ", "Banana ", "Cherry").forEach(System.out::print);

		List<Integer> list = Arrays.asList(1, 20, 13, 46, 5, 13, 22, 5);

		// Get even numbers from list
		Predicate<Integer> predicateEven = n -> n % 2 == 0;

		List<Integer> listOfEven = list.stream().filter(predicateEven).collect(Collectors.toList());

		System.out.println("\nlistOfEven  " + listOfEven);

		// Partition by odd and even
		Map<Boolean, List<Integer>> mapOfPartition = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		List<Integer> evenList = mapOfPartition.get(true);
		List<Integer> oddList = mapOfPartition.get(false);

		System.out.println(evenList + "\n" + oddList);

		// Sort list by length and if same length then alphabetically
		List<String> words = Arrays.asList("Java", "Stream", "The", "API", "Interview");

		List<String> sortedWords = words.stream()
				.sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))
				.collect(Collectors.toList());

		System.out.println(sortedWords);

		// Transform to uppercase -> this (String::toUpperCase) is also function
		Function<String, String> upperCaseFun = st -> st.toUpperCase();
		List<String> upperCaseWords = words.stream().map(upperCaseFun).collect(Collectors.toList());

		System.out.println(upperCaseWords);

		// Reduce()
		int sum = list.stream().reduce(0, Integer::sum);
		System.out.println("reduce() -> " + sum);

		// Second Largest Element in Array
		int[] array = { 10, 52, 14, 52, 23, 22, 74, 72 };
		IntStream stream = Arrays.stream(array);

		Optional<Integer> first = stream.boxed().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();

		System.out.println(first);

	}
}
