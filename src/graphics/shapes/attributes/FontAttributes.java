package graphics.shapes.attributes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.image.BufferedImage;

public class FontAttributes extends Attributes {
	public Font font;
	public Color fontColor;
	public static final Graphics2D DEFAULTS_GRAPHICS = (Graphics2D) new 
			BufferedImage(1,1,BufferedImage.TYPE_INT_ARGB).getGraphics(); //TODO vérifier ce morceau de code
	public FontAttributes(String id) {
		super(id);
	}
	@Override
	public String getId() {
		return this.getId();
	}
	public Rectangle getBounds(String id) {
		FontRenderContext frc = DEFAULTS_GRAPHICS.getFontRenderContext();
		return font.getStringBounds(id, frc).getBounds();
	}
}
