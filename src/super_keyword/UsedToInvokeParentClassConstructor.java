package super_keyword;

class Studentt
{
	Studentt()
	{
		System.out.println("I am Student");
	}
	public void show() {
		
	}
}
class Ram extends Studentt
{
	
	{
		super.show();
	}
	 Ram() 
	{
		super();
		System.out.println("My name is Ram");
	}
}
public class UsedToInvokeParentClassConstructor 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		Ram Ram= new Ram();
	}
}