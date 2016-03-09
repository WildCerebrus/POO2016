package graphics.shapes.attributes;

public abstract class Attributes {
	protected final String id;
	public Attributes(String id) {
		this.id=id;
	}
	public abstract String getId();
}
