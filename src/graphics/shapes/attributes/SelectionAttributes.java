package graphics.shapes.attributes;

public class SelectionAttributes extends Attributes {
	private boolean selected;
	public SelectionAttributes(String id) {
		super(id);
		this.selected=false;
	}
	public boolean isSelected() {
		return this.selected;
	}
	public void selected() {
		this.selected=true;
	}
	public void unselected() {
		this.selected=false;
	}
	public void toggleSelection() {
		this.selected=!(this.selected);
	}
	@Override
	public String getId() {
		return this.getId();
	}
}
