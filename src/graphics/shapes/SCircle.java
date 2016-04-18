package graphics.shapes;

import java.awt.Point;

public class SCircle extends Shape {

	private int radius;
	private Point loc;
	public SCircle (Point point, int radius){
		this.loc=point;
		this.radius=radius;
		
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setRadius(int i) {
		this.radius=i;
	}
	
	public Point getLoc() {
		return this.loc;
	}
	
	public void setLoc(Point p) {
		this.loc=p;
		
	}

	
	public void translate(int dx,int dy) {
		this.loc.translate(dx,dy);
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(new Point(loc.dx,loc.dy),new Dimension(radius,radius));
	}

	
	public void accept(ShapeVisitor v) {
		sv.visitCircle(this);
		
	}

}
