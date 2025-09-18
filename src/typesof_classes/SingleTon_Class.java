package typesof_classes;

public class SingleTon_Class {
	/*
	 * A Singleton Class ensures that only one instance of the class can exist in
	 * the JVM (Java Virtual Machine) at any given time.
	 * 
	 * It is typically used when a single instance is needed to coordinate actions
	 * across the system, such as logging, configuration management, service
	 * locators, or managing global resources (like a database connection or
	 * application configuration).
	 * 
	 * Example: Runtime,service locator , Business development To create singleton
	 * class Create a private constructor and Create a static method (by using the
	 * lazy initialization) that returns the object of the singleton class.
	 * 
	 */

	Runtime r = Runtime.getRuntime();// way of creating singleton class obj

	private String objectState;

	// volatile -> reflects change across threads
	private static volatile SingleTon_Class instance = null;

	private SingleTon_Class() throws Exception {
		this.objectState = "Javapoint";
	}

	public static SingleTon_Class getInstance() {
		if (instance == null) {

			// use synchronized for thread safe behavior
			synchronized (SingleTon_Class.class) {

				try {
					instance = new SingleTon_Class();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return instance;
	}

	public String getObjectState() {
		return objectState;
	}

	public void setObjectState(String objectState) {
		this.objectState = objectState;
	}

	public static void setInstance(SingleTon_Class instance) {
		SingleTon_Class.instance = instance;
	}

}

class TestSingleTonClass {

	public static void main(String[] args) throws InterruptedException {

		// Implemented Runnable interface run()
		Runnable task = new Runnable() {

			@Override
			public void run() {

				SingleTon_Class singleton = SingleTon_Class.getInstance();

				// Print instance and state to verify singleton
				System.out.println("Instance HashCode: " + singleton.hashCode());
				System.out.println("Object State: " + singleton.getObjectState());

				// Modify the state to test if all threads see the same state
				singleton.setObjectState("Updated State");

				// Print updated state
				System.out.println("Updated Object State: " + singleton.getObjectState());

			}
		};

		Thread thread_1 = new Thread(task);
		Thread thread_2 = new Thread(task);
		Thread thread_3 = new Thread(task);

		// Start threads
		thread_1.start();
		thread_2.start();
		thread_3.start();

		// Wait for all threads to finish
		thread_1.join();
		thread_2.join();
		thread_3.join();

	}
}
