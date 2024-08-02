package Interfaces;
interface fun{
	int a = 10;
	final int x = 30;
	abstract void run();
	static void runs() {
		System.out.println("static method for interface fun");
	}
	default void ru() {
		System.out.println("default method for interface fun");
	}
}
interface funny{
	int b = 10;
	final int y = 30;
	abstract void run1();
	static void runs() {
		System.out.println("static method for interface funny");
	}
	default void run() {
		System.out.println("default method for interface funny");
	}
}
class kdrama implements fun{
	public void run() {
		System.out.println("abstract method fun");
	}
}
class cdrama implements funny{
	public void run1() {
		System.out.println("abstract method funny");
	}
}
public class Interface2 {
	public static void main(String[] args) {
		kdrama obj = new kdrama();
		cdrama myobj = new cdrama();
		obj.run();
		fun.runs();
		obj.ru();
		System.out.println(fun.a);
		System.out.println(fun.x);
		myobj.run();
		funny.runs();
		myobj.run1();
		System.out.println(funny.b);
		System.out.println(funny.y);
		
	}
}

