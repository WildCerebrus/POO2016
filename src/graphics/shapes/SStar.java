package graphics.shapes;

import java.awt.Point;

import graphics.shapes.attributes.ColorAttributes;

public class SStar extends SCircle {

	public SStar(Point point, int radius) {
		super(point, radius);
	}
	public void renew() {
		int i = (int) Math.floor((Math.random()*4));
		if (i%2!=0) {
			((ColorAttributes) this.getAttributes(ColorAttributes.ID)).filledColor.brighter();
		} else {
			((ColorAttributes) this.getAttributes(ColorAttributes.ID)).filledColor.darker();
		}
		if (i/2!=0) {
			((ColorAttributes) this.getAttributes(ColorAttributes.ID)).strokedColor.brighter();
		} else {
			((ColorAttributes) this.getAttributes(ColorAttributes.ID)).strokedColor.darker();
		}
	}
}
