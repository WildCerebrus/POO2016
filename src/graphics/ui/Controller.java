package graphics.ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Controller implements MouseListener, MouseMotionListener, KeyListener
{
	private Object model;
	private View view;
		
	
	public Controller(Object newModel)
	{
		model = newModel;
	}
	
	public void setView(View view)
	{
		this.view = view;
	}
	
	final public View getView()
	{
		return this.view;
	}
	
	public void setModel(Object model)
	{
		this.model = model;
	}
	
	public Object getModel()
	{
		return this.model;
	}
	
	public void mousePressed(MouseEvent e)
	{
		//TODO � faire
	}

	public void mouseReleased(MouseEvent e)
	{
		//TODO � faire
	}

	public void mouseClicked(MouseEvent e)
	{
		//TODO � faire
	}
	
	public void mouseEntered(MouseEvent e)
	{
		//TODO � faire
	}

	public void mouseExited(MouseEvent e)
	{
		//TODO � faire
	}
	
	public void mouseMoved(MouseEvent evt)
	{
		//TODO � faire
	}
	
	public void mouseDragged(MouseEvent evt)
	{
		//TODO � faire
	}
	
	public void keyTyped(KeyEvent evt)
	{
		//TODO � faire
	}
	
	public void keyPressed(KeyEvent evt)
	{
		//TODO � faire
	}

	public void keyReleased(KeyEvent evt)
	{
		//TODO � faire
	}
}
