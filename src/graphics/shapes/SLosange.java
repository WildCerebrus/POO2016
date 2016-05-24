package graphics.shapes;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class SLosange extends graphics.shapes.Shape implements Shape {

	private Losange los;

	public SLosange(Point loc, int w, int h) {
		los = new Losange();
		los.setLocation(loc);
		los.setSize(new Dimension(w,h));
	}

	public Losange getLos() {
		return this.los;
	}

	public Point getLoc() {
		return los.getLocation(); // Retourne un point sur la position du
									// rectangle
									//le coin supérieur gauche
	}

	public void setLoc(Point p) {
		this.los.setLocation(p.x, p.y);
	}

	public void translate(int x, int y) {
		this.los.setLocation(this.los.getLocation().x+x, this.los.getLocation().y+y);
	}

	public Rectangle getBounds() {
		return los.getBounds();
	}

	public void accept(ShapeVisitor sv) {
		sv.visitLosange(this);
	}

	@Override
	public boolean contains(Point2D arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Rectangle2D arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(double arg0, double arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(double arg0, double arg1, double arg2, double arg3) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Rectangle2D getBounds2D() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PathIterator getPathIterator(AffineTransform arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PathIterator getPathIterator(AffineTransform arg0, double arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean intersects(Rectangle2D arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean intersects(double arg0, double arg1, double arg2, double arg3) {
		// TODO Auto-generated method stub
		return false;
	}

}
