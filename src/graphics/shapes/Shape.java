package graphics.shapes;

import java.awt.Point;
import java.util.ArrayList;

public abstract class Shape {
	
	
	private ArrayList<Attributes> attributes;
	
	public void addAttributes(Attributes a) {
		attributes.add(a);
	}
	
	public Attributes getAttributes(String id) {
		attributes.get //TODO 

	}
	
	public abstract Point getLoc();
	public abstract void setLoc(Point p)
	public abstract void translate(int dx, int dy);
	public abstract Rectangle getBounds();
	public abstract void accept (ShapeVisitor v);

}
