package solid_priciples;

public class InterfaceSegregation {
	/*
	 * The I in SOLID stands for interface segregation, and it simply means that
	 * larger interfaces should be split into smaller ones. By doing so, we can
	 * ensure that implementing classes only need to be concerned about the methods
	 * that are of interest to them.
	 * 
	 * This principle is the first principle that applies to Interfaces instead of
	 * classes in SOLID and it is similar to the single responsibility principle. It
	 * states that do not force any client to implement an interface which is
	 * irrelevant to them . Here your main goal is to focus on avoiding fat
	 * interface and give preference to many small client-specific interfaces.
	 */
}

interface Messenger {
	String askForCard();

	String tellInvalidCard();

	String askForPin();

	String tellInvalidPin();

	String tellCardWasSiezed();

	String askForAccount();

	String tellNotEnoughMoneyInAccount();

	Long tellAmountDeposited();

	Long tellBalance();
}

// Instead, split the Messenger interface up so that different ATM functionality depend on separate

interface LoginMessenger {
	String askForCard();

	String tellInvalidCard();

	String askForPin();

	String tellInvalidPin();
}

interface WithdrawalMessenger {
	String tellNotEnoughMoneyInAccount();

	String askForFeeConfirmation();
}
