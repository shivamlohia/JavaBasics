
public class SubClass {
	private String getName;
	public void setData(String name) {
		getName=name;
	}
	public String getData() {
		return getName;
	}
	public void nameCall() {
		System.out.printf("Hello %s", getData());
	}
}
