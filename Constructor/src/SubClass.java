
public class SubClass {
	private String getName;
	public SubClass(String name) {
		getName=name;
	}
	
	public String getData() {
		return getName;
	}
	public void nameCall() {
		System.out.printf("Name: %s\n", getData());
	}
}
