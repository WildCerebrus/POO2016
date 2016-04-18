package graphics.shapes;

import java.awt.Point;

public class SStar extends SCircle {

	private int cycle=5;
	private int state=((int)Math.random())%5;
	
	public SStar(Point point, int radius) {
		super(point, radius);
	}
	public void setCycle(int n) {
		this.cycle=n;
	}
	public int getCycle() {
		return this.cycle;
	}
	public void setState(int i) {
		this.state=i;
	}
	public int getState() {
		return this.state;
	}
	public int renew() {
		return this.state++;
	}
}
