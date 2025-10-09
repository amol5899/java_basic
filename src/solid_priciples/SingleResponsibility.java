package solid_priciples;

/*
 * SOLID is an acronym for the first five object-oriented design (OOD)
 * principles by Robert C. Martin. These principles establish practices for
 * developing software with considerations for maintaining and extending it as
 * the project grows. Adopting these practices can also help avoid code smells,
 * refactor code, and develop Agile or Adaptive software.
 */

// SOLID stands for:
// S - Single-responsibility Principle
// O - Open-closed Principle
// L - Liskov Substitution Principle
// I - Interface Segregation Principle
// D - Dependency Inversion Principle

public class SingleResponsibility {

	/*
	 * Single-responsibility Principle (SRP) states: A class should have one and
	 * only one reason to change, meaning that a class should have only one job.
	 * 
	 * Everything in the class should be related to that single purpose. It does not
	 * mean that your classes should only contain one method or property.
	 */

	public static void main(String[] args) {
	}

	public Integer calculatePay() {
		return null;
	}

	public void save() {
	}

	public String describeEmployee() {
		return null;
	}
	/*
	 * Here we have pay calculation logic with database logic and reporting logic
	 * all mixed up within one class. If you have multiple responsibilities combined
	 * into one class, it might be difficult to change one part without breaking
	 * others.
	 * 
	 * Mixing responsibilities also makes the class harder to understand and harder
	 * to test, decreasing cohesion. The easiest way to fix this is to split the
	 * class into three different classes, with each having only one responsibility:
	 * database access, calculating pay, and reporting, all separated.
	 */
}
