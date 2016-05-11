package src.graphics.shapes.ui;

import src.graphics.shapes.SCircle;
import src.graphics.shapes.SCollection;
import src.graphics.shapes.SRectangle;
import src.graphics.shapes.SText;
import src.graphics.shapes.attributes.ColorAttributes;
import src.graphics.shapes.attributes.FontAttributes;
import src.graphics.shapes.attributes.SelectionAttributes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class Editor extends JFrame
{
	ShapesView sview;
	SCollection model;
	
	public Editor()
	{	
		super("Shapes Editor");

		this.addWindowListener(new java.awt.event.WindowAdapter()
		{
			public void windowClosing(java.awt.event.WindowEvent evt)
			{
				System.exit(0);
			}
		});
		
		this.buildModel();
		
		this.sview = new ShapesView(this.model);
		this.sview.setPreferredSize(new Dimension(300,300));
		this.getContentPane().add(this.sview, java.awt.BorderLayout.CENTER);
	}

	
	private void buildModel()
	{
		this.model = new SCollection();
		this.model.addAttributes(new SelectionAttributes());
		
		SRectangle r = new SRectangle(new Point(10,10),20,30);
		r.addAttributes(new ColorAttributes(true,false,Color.BLUE,Color.BLUE));
		r.addAttributes(new SelectionAttributes());
		this.model.add(r);
		
		SCircle c = new SCircle(new Point(100,100),10);
		c.addAttributes(new ColorAttributes(false,true,Color.BLUE,Color.BLUE));
		c.addAttributes(new SelectionAttributes());
		this.model.add(c);
		
		SText t= new SText(new Point(100,100),"hello");
		t.addAttributes(new ColorAttributes(true,true,Color.YELLOW,Color.BLUE));
		t.addAttributes(new FontAttributes());
		t.addAttributes(new SelectionAttributes());
		this.model.add(t);
		
		SCollection sc = new SCollection();
		sc.addAttributes(new SelectionAttributes());
		r= new SRectangle(new Point(20,30),30,30);
		r.addAttributes(new ColorAttributes(true,false,Color.MAGENTA,Color.BLUE));
		r.addAttributes(new SelectionAttributes());
		sc.add(r);
		c = new SCircle(new Point(150,100),20);
		c.addAttributes(new ColorAttributes(false,true,Color.BLUE,Color.DARK_GRAY));
		c.addAttributes(new SelectionAttributes());
		sc.add(c);
		this.model.add(sc);
	}
	
	public static void main(String[] args)
	{
		Editor self = new Editor();
		self.pack();
		self.setVisible(true);
	}
}
