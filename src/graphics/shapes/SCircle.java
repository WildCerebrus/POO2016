package graphics.shapes;

import java.awt.Point;

public class SCircle extends Shape {

	public int radius;
	public Point loc;
	public SCircle (Point p, int radius){
		this.loc=p;
		this.radius=radius;
		
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius=radius;
	}
	
	public Point getLoc() {
		return loc;
	}
	
	public void setLoc(Point p) {
			
		
	}

	
	public void translate(int dx,int dy) {
		
		
	}

	
	public Rectangle getBounds() {
		
	}

	
	public void accept(ShapeVisitor v) {
		
		
	}

}
