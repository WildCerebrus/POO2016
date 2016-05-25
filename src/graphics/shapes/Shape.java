package graphics.shapes;

import java.awt.*;
import java.util.*;

import graphics.shapes.attributes.Attributes;

public abstract class Shape {

	protected TreeMap<String, Attributes> attributes = new TreeMap<String, Attributes>();

	public void addAttributes(Attributes a) {
		this.attributes.put(a.getId(), a);
	}

	public Attributes getAttributes(String s) {
		return (Attributes) this.attributes.get(s);
	}

	public abstract Point getLoc();

	public abstract void setLoc(Point p);

	public abstract void translate(int dx, int dy);

	public abstract Rectangle getBounds();

	public abstract void accept(graphics.shapes.ShapeVisitor v);

	public TreeMap<String, Attributes> getAttributes() {
		return attributes;
	}
}
