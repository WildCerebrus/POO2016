package graphics.shapes.attributes;

import java.awt.Color;

public class ColorAttributes extends Attributes {
	public boolean filled;
	public boolean stroked;
	public Color filledColor;
	public Color strokedColor;
	public ColorAttributes(String id) {
		super(id);
	}
	@Override
	public String getId() {
		return this.getId();
	}
}
