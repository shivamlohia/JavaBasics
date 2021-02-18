
public class app {
	public static void main(String args[]) {
		machine m = new machine();
		m.start();
		car c = new car();
		c.start();
		m.stop();
		c.stop();
	}
} 
