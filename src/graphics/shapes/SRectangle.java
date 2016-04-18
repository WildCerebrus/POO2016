package graphics.shapes;

import java.awt.Point;
import java.awt.Rectangle;


public class SRectangle extends Shape {

	private Rectangle rect;

	public SRectangle(Point loc, int w, int h) {
		rect = new Rectangle(loc.x,loc.y,w,h);
	}

	public Rectangle getRect() {
		return this.rect;
	}

	public Point getLoc() {
		return rect.getLocation(); 
	}

	public void setLoc(Point p) {
		this.rect.x=p.x;
		this.rect.y=p.y;
	}

	public void translate(int dx, int dy) {
		this.rect.translate(dx,dy);
	}

	public Rectangle getBounds() {
		return rect.getBounds();
	}

	public void accept(ShapeVisitor sv) {
		sv.visitRectangle(this);
	}

}