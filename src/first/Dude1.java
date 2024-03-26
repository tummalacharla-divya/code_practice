package first;



class Child12{

	{
		System.out.println("A");
		
	}
	static {
		System.out.println("B");
	}
	
}

public class Dude1 extends Child12{

	{
		System.out.println("C ");
	}
	
	static {
		System.out.println("D ");
	}
	
	public static void main(String[] args) {
		Dude1 d = new Dude1();
	}
}
