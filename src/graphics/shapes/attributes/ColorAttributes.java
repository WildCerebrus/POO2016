package graphics.shapes.attributes;

import java.awt.Color; //Pour les booleens de couleurs

public class ColorAttributes extends Attributes {

	public boolean filled=true;
	public boolean stroked=false;
	public Color filledColor;
	public Color strokedColor;

	public static final String ID = "color";

	public ColorAttributes() { // Par defaut
		this.strokedColor=Color.BLACK;
		this.filledColor=Color.WHITE;
	}

	public ColorAttributes(boolean filled, boolean stroked, Color filledColor,
			Color strokedColor) { // Value
		this.filled = filled;
		this.stroked = stroked;
		this.filledColor = filledColor;
		this.strokedColor = strokedColor;
	}

	public String getId() {
		return ID;
	}
}
