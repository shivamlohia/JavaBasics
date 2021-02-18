class frog{
	int id;
	String name;
	public frog(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return String.format("%d : %s", id, name);
	}
}
public class app {
	public static void main(String args[]) {
		frog f = new frog(1, "Raj");
		System.out.println(f);
	}
}
