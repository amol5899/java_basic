package this_keyword;

class MyStudent1 {
	int rollNo;
	String name;
	float fees;
	{
	  this.display();	
	}
	public MyStudent1(int rollNo, String name, float fees) {
		this.rollNo = rollNo;
		this.name = name;
		this.fees = fees;
	}

	 void display() {
		System.out.println(rollNo + " " + name + " " + fees);
	}
}

public class UsedToReferCurrentClassInstanceVariable {

	public static void main(String[] args) {
		MyStudent1 student1 = new MyStudent1(1001, "Amol", 15000);
		MyStudent1 student2 = new MyStudent1(1002, "Shivkumar", 25000);

		student1.display();
		student2.display();
	}
}