package graphics.shapes;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

import graphics.shapes.attributes.Attributes;

public abstract class Shape {
	
	
	private ArrayList<Attributes> attributes;
	
	public void addAttributes(Attributes a) {
		attributes.add(a);
	}
	
	public Attributes getAttributes(String id) {
		int i;
		for(i=0;i<this.attributes.size();i++) {
			if(this.attributes.get(i).getId().equals(id)) return this.attributes.get(i);
		}
		return null;
	}
	
	public abstract Point getLoc();
	public abstract void setLoc(Point p);
	public abstract void translate(int dx, int dy);
	public abstract Rectangle getBounds();
	public abstract void accept (ShapeVisitor v);

}
