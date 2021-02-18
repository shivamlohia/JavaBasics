
public class apple {
	private int hour, min, sec;
	public apple() {
		this(0,0,0);
	}
	public apple(int h) {
		this(h,0,0);
	}
	public apple(int h, int m) {
		this(h,m,0);
	}
	public apple(int h, int m, int s) {
		setTime(h,m,s);
	}
	public void setTime(int h,int m,int s) {
		setHr(h);
		setMin(m);
		setSec(s);
	}
	public void setHr(int h) {
		hour = ((h>=0 && h<=24)? h: 0);
	}
	public void setMin(int m) {
		min = ((m>=0 && m<=60)? m: 0);
	}
	public void setSec(int s) {
		sec = ((s>=0 && s<=60)? s: 0);
	}
	public int getHr() {
		return hour;
	}
	public int getMin() {
		return min;
	}
	public int getSec() {
		return sec;
	}
}
