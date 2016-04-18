package src.graphics.shapes;

public class SText {
	private String text;
	private Point loc;

	public SText(Point point, String string) {
		this.loc = point;
		this.text = string;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String s) {
		this.text = s;
	}

	public Point getLoc() {
		return loc.getLocation();
	}

	public void setLoc(Point p) {
		this.loc.setLocation(p);
	}

	public void translate(int x, int y) {
		
		this.loc.translate(x, y);
	}

	public Rectangle getBounds() {
		FontAttributes fa = new FontAttributes();
		Rectangle rect = new Rectangle();
		if (attributes.get(FontAttributes.ID) != null)
			rect = ((FontAttributes) attributes.get(FontAttributes.ID))
					.getBounds(text);
		rect.height = fa.getBounds(text).height;
		rect.width = fa.getBounds(text).width;
		rect.setLocation(loc.x, loc.y - fa.getBounds(text).height);
		return rect;
	}

	public void accept(ShapeVisitor sv) {
		sv.visitText(this);
	}
}