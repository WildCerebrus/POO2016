/*package graphics.shapes;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Losange extends JApplet  {
	  public void init(){
			setContentPane(new Dessin());
	  }
	}

	@SuppressWarnings("serial")
	class Dessin extends JPanel {
	  int theta = 45, delta =45;
	  public void paintComponent(Graphics g) {
	    int largeur = getSize().width;
	    int hauteur = getSize().height;
	    int dl = largeur/2, dh = hauteur/2;
	    int [] polx = { 0, dl, largeur, dl};
	    int [] poly = {dh, 0, dh, hauteur};
	    Polygon pol = new Polygon(polx,poly,4);
	    
	    g.setColor(Color.black);
	    g.fillRect(0,0,largeur,hauteur);
	    g.setColor( Color.yellow);
	    g.fillPolygon(pol);
	    g.setColor( Color.red);
	    g.fillRect(dl/2, dh/2, dl,dh);
	    g.setColor( Color.green);
	    g.fillOval(dl/2, dh/2, dl,dh);
	    g.setColor( Color.blue);
	    g.fillArc(dl/2, dh/2, dl, dh,theta, delta);    
	  }
		public Dessin() {
	    addMouseListener( new MouseAdapter() {
	      public void mousePressed(MouseEvent e){
	        theta = (theta +10)%360;
	        repaint();
	      }
	    });

		}
	}

*/