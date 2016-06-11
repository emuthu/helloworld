package emuthu;

/**
 * Hello world!
 *
 * @author Elango Muthu (emuthu@vmwre.com)
 */
public class App 
{
	public App() {
	}
	
	public void sayHello() {
		System.out.println("Hello World");
	}
	
	public void msg(String msg) {
		System.out.println(msg);
	}
	
	public void msg2(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// call sayHello()
		new App().sayHello();
	}
}
