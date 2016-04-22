package graphics.shapes;

import java.awt.Point;

public class SStar extends SCircle {

	private int cycle=5;
	private int state=(int)(Math.random()*100);
	
	public SStar(Point point, int radius) {
		super(point, radius);
	}
	public SStar(Point point, int radius, int cycle) {
		super(point, radius);
		this.cycle=cycle;
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
		this.state = (this.state+1)%5;
		int i=(int) Math.floor(Math.random()*3);
		switch (i) {
		case 0 : this.setRadius(this.getRadius()*2);
		case 1 : this.setRadius(this.getRadius()/3);
		case 2 : this.setRadius(this.getRadius()+10);
		}
		return this.state;
	}
}
