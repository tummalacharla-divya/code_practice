package first;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divya obj=new Rithu();
		obj.show();
		obj.rotate();
		obj.running();
		obj.move();
		Iphone iphone = new Iphone();
		OnePlus onePlus = new OnePlus();
		show(iphone);
		show(onePlus);
	}
	public static void show(Phone obj) {
		obj.showConfig();
	}
}
abstract class Divya{
	public static void show() {
		System.out.println("show");
	}
	public abstract void move();
	public abstract void rotate();
	public abstract void running();
}
class Rithu extends Divya{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("moving");
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		System.out.println("rotating");
	}

	@Override
	public void running() {
		// TODO Auto-generated method stub
		System.out.println("running");
	}
	
}
abstract class Phone {

	public abstract void showConfig();

}

class Iphone extends Phone {

	@Override
	public void showConfig() {
		System.out.println("3 gb ram, 11.0");
	}
}

class OnePlus extends Phone {

	@Override
	public void showConfig() {
		System.out.println("8gb ram, pie");
	}
}
