package graphics.shapes;

import java.awt.Point;

import com.sun.javafx.geom.Rectangle;

public class SRectangle extends Shape {

	private Rectangle rect = new Rectangle(0,0,0,0);
	public SRectangle (Point p, int width, int height) {
		this.rect.x=p.x;
		this.rect.y=p.y;
		this.rect.width=width;
		this.rect.height=height;
	}
	
	public Point getLoc() {
		
		return null;
	}
	
	public void setLoc(Point p) {
		this.rect.x=p.x;
		this.rect.y=p.y;
		
	}
	
	public void translate(int dx, int dy) {
		rect.translate(dx,dy);
		
	}
	
	public Rectangle getBounds() {
		
		return null;
	}
	
	public void accept(ShapeVisitor v) {
		//TODO
		
	}
}
