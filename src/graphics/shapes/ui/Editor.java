package graphics.shapes.ui;

import graphics.shapes.SCollection;
import graphics.shapes.SRectangle;
import graphics.shapes.SText;
import graphics.shapes.attributes.ColorAttributes;
import graphics.shapes.attributes.FontAttributes;
import graphics.shapes.attributes.SelectionAttributes;
import graphics.shapes.SCircle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.util.Scanner;

import javax.swing.JFrame;

@SuppressWarnings("serial")
//Oubli du SerialVersionUid dans une classe d�clar�e Serializable
public class Editor extends JFrame {
	
	ShapesView sview;
	static SCollection model;
	static String s = "";
	static Scanner sc = new Scanner(System.in);

	public Editor() {
		super("Shapes Editor");

		this.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				System.exit(0);
			}
		});

		this.buildModel();

		this.sview = new ShapesView(model);
		this.sview.setPreferredSize(new Dimension(400, 300));
		this.getContentPane().add(this.sview, java.awt.BorderLayout.CENTER);
	}

	private void buildModel() {

		model = new SCollection();
		model.addAttributes(new SelectionAttributes());

		SRectangle r = new SRectangle(new Point(60, 90), 100, 80);
		r.addAttributes(new ColorAttributes(true, false, Color.BLUE, Color.BLUE));
		r.addAttributes(new SelectionAttributes());
		Editor.model.add(r);

		SCircle c = new SCircle(new Point(100, 100), 10);
		c.addAttributes(new ColorAttributes(false, true, Color.BLUE, Color.BLUE));
		c.addAttributes(new SelectionAttributes());
		Editor.model.add(c);

		SText t = new SText(new Point(100, 100), "hello");
		t.addAttributes(new ColorAttributes(true, true, Color.YELLOW,
				Color.BLUE));
		t.addAttributes(new FontAttributes());
		t.addAttributes(new SelectionAttributes());
		Editor.model.add(t);

		SCollection sc = new SCollection();
		sc.addAttributes(new SelectionAttributes());
		r = new SRectangle(new Point(20, 30), 30, 30);
		r.addAttributes(new ColorAttributes(true, false, Color.MAGENTA,
				Color.BLUE));
		r.addAttributes(new SelectionAttributes());
		sc.add(r);
		c = new SCircle(new Point(150, 100), 20);
		c.addAttributes(new ColorAttributes(false, true, Color.BLUE,
				Color.DARK_GRAY));
		c.addAttributes(new SelectionAttributes());
		sc.add(c);
		Editor.model.add(sc);/**/

	}

	public static void main(String[] args) {
		Editor self = new Editor();
		self.pack();
		self.setVisible(true);
		s=sc.next();
		System.out.println(s.substring(0, 1));
	}
}
