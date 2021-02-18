
public class varLenArg {
	static float average (int...n) {
		float total=0;
		for(int x:n)
			total+=x;
		return total/n.length;
	}
	public static void main(String args[]) {
		System.out.println(average(1,2,3,4,5,6));
	}
}
