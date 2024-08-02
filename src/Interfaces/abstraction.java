package Interfaces;
interface A{
	int x = 20;
	abstract void run();
	static void max() {
		System.out.println("static method");
	}
	default void row() {
		System.out.println("interface A");
	}
}
class b implements A{
	public void run() {
		System.out.println("class b");
	}
}
public class abstraction {
	public static void main(String[] args) {
		b obj = new b();
		obj.run();
		obj.row();
		A.max();
		System.out.println(obj.x);
		
	}

}
