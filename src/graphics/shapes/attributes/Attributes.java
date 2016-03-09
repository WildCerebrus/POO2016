package graphics.shapes.attributes;

public abstract class Attributes {
	public static String id;
	public Attributes(String id) {
		Attributes.id=id;
	}
	public abstract String getId();
}
