package graphics.shapes.ui;

import java.awt.Graphics2D;

import graphics.shapes.SCircle;
import graphics.shapes.SCollection;
import graphics.shapes.SRectangle;
import graphics.shapes.SText;
import graphics.shapes.ShapeVisitor;
import graphics.shapes.attributes.ColorAttributes;

public class ShapeDraftman implements ShapeVisitor {
	public ColorAttributes DEFAULTCOLORATTRIBUTES;//TODO add default attributes
	private Graphics2D graphics;
	public void visitRectangle(SRectangle rect) {
		// TODO Auto-generated method stub
	}
	public void visitCircle(SCircle circ) {
		// TODO Auto-generated method stub
	}
	public void visitText(SText text) {
		// TODO Auto-generated method stub
	}
	public void visitCollection(SCollection coll) {
		// TODO Auto-generated method stub
	}
	public void setGraphics(Graphics2D arg0) {
		this.graphics=arg0;
	}
}
