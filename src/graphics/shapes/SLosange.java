package graphics.shapes;

import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;

public class SLosange extends Shape {

	private Polygon los;

	public SLosange(Point loc, int w, int h) {
		int [] polx = { loc.x, loc.x+w/2, loc.x+w, loc.x+w/2};
		int [] poly = { loc.y+h/2, loc.y+h, loc.y+h/2, loc.y};
		this.los = new Polygon(polx,poly,4);
	}

	public Polygon getLos() {
		return this.los;
	}

	public Point getLoc() {
		return los.getBounds().getLocation(); // Retourne un point sur la position du
									// rectangle
									//le coin supérieur gauche
	}

	public void setLoc(Point p) {
		this.los.getBounds().setLocation(p);
	}

	public void translate(int x, int y) {
		this.los.translate(x, y);
		//this.los.setLocation(this.los.getLocation().x+x, this.los.getLocation().y+y);
	}

	public Rectangle getBounds() {
		return los.getBounds();
	}

	public void accept(ShapeVisitor sv) {
		sv.visitLosange(this);
	}

}
