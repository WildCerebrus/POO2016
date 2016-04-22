package graphics.shapes;

import java.awt.Point;

public class SSatellite extends SRectangle {

	private int vx,vy;
	
	public SSatellite(Point loc, int w, int h) {
		super(loc, w, h);
		this.vx=-loc.y;
		this.vy=loc.x;
	}
	public SSatellite(Point loc, int w, int h, int vx, int vy) {
		super(loc, w, h);
		this.vx=vx;
		this.vy=vy;
	}
	public int getVx() {
		return this.vx;
	}
	public int getVy() {
		return this.vy;
	}
	public void setVx(int vx) {
		this.vx=vx;
	}
	public void setVy(int vy) {
		this.vy=vy;
	}
}