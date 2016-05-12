package graphics.ui;

import javax.swing.JPanel;
import graphics.shapes.SCollection;
import graphics.shapes.ui.ShapesView;

@SuppressWarnings("serial")
// oubli du SerialVersionUid dans une classe déclarée Serializable
public abstract class View extends JPanel {

	private Object model;
	private Controller controller;

	public View(Object model) {
		this.model = model;
		this.controller = defaultController(model);
		this.controller.setView(this);
		this.addMouseListener(this.controller);
		this.addMouseMotionListener(this.controller);
		this.addKeyListener(this.controller);
	}

	public void setModel(Object model) {
		this.model = model;
		this.controller.setModel(model);
	}

	public Object getModel() {
		return this.model;
	}

	public Controller defaultController(Object model) {
		return new Controller(model);
	}

	final public Controller getController() {
		return this.controller;
	}
	public void invalidate() {
		this.paintImmediately(getBounds());
		((SCollection) this.model).accept(((ShapesView) this).getDraftman());
		System.out.println("invalidate");
	}
	public void repaint() {
		super.repaint();
		System.out.println("repaint");
	}
}
