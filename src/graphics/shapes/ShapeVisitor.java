package src.graphics.shapes;

public class ShapeVisitor {
	public abstract void visitRectangle(SRectangle sr);

	public abstract void visitCircle(SCircle sc);

	public abstract void visitText(SText st);

	public abstract void visitCollection(SCollection sco);
}
