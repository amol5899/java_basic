package solid_priciples;

public class LiskovSubstitution {
	/*
	 * The principle was introduced by Barbara Liskov in 1987 and according to this
	 * principle Derived or child classes must be substitutable for their base or
	 * parent classes. This principle ensures that any class that is the child of a
	 * parent class should be usable in place of its parent without any unexpected
	 * behaviour.
	 * 
	 * The Liskov Substitution Principle (LSP) applies to inheritance hierarchies,
	 * specifying that you should design your classes so that client dependencies
	 * can be substituted with subclasses without the client knowing about the
	 * change.
	 * 
	 * All subclasses must, therefore, operate in the same manner as their base
	 * classes. The specific functionality of the subclass may be different but must
	 * conform to the expected behavior of the base class. To be a true behavioral
	 * subtype, the subclass must not only implement the base class’s methods and
	 * properties, but also conform to its implied behavior.
	 */
}

interface Car {

	void turnOnEngine();

	void accelerate();
}

class MotorCar implements Car {

	private Engine engine;

	// Constructors, getters + setters

	public void turnOnEngine() {
		// turn on the engine!
		engine.on();
	}

	public void accelerate() {
		// move forward!
		engine.powerOn(1000);
	}
}

// But wait — we are now living in the era of electric cars:
class ElectricCar implements Car {

	public void turnOnEngine() {
		throw new AssertionError("I don't have an engine!");
		/*
		 * By throwing a car without an engine into the mix, we are inherently changing
		 * the behavior of our program. This is a blatant violation of Liskov
		 * substitution and is a bit harder to fix than our previous two principles.
		 * 
		 * One possible solution would be to rework our model into interfaces that take
		 * into account the engine-less state of our Car.
		 */
	}

	public void accelerate() {
		// this acceleration is crazy!
	}
}

class Engine {

	public void on() {
		System.out.println("In on()");
	}

	public void powerOn(int i) {
		System.out.println("in powerOn() " + i);
	}

}