//Zach Panzarino
//Program 2.15
//3-3-15
//Draws a smiling face

import java.awt.*; 
import java.applet.*; 
import java.awt.event.*;
public class Face extends Applet implements MouseListener 
{ 
private static final long serialVersionUID = 1L;
int xpos; 
 int ypos;
 Image hits;
 int rect1xco,rect1yco,rect1width,rect1height;
 
 boolean mouseEntered;
 boolean rect1Clicked;
 public void init()  
 { 
  rect1xco = 60; 
  rect1yco = 60; 
  rect1width = 280; 
  rect1height = 280;
  hits = getImage(getDocumentBase(), "hits.png");
  setSize(400,400);
  addMouseListener(this); 
 }
	public void paint(Graphics page){
		Color skin = new Color(240,197,129);
		setBackground(Color.cyan);
		page.setColor(skin);
		page.fillOval(320,100,75,100);
		page.fillOval(10,100,75,100);
		page.fillOval(50,50,300,300);
		page.setColor(Color.white);
		page.fillOval(130,120,50,50);
		page.fillOval(230,120,50,50);
		page.setColor(Color.blue);
		page.fillOval(130,140,30,30);
		page.fillOval(250,120,30,30);
		page.setColor(Color.black);
		page.fillOval(135,150,15,15);
		page.fillOval(260,125,15,15);
		page.drawLine(200,200,150,250);
		page.drawLine(150,250,200,250);
		page.drawArc(150, 250, 100, 80, 195, 150);
		page.drawString("Zach Panzarino", 10, 20);
		page.drawString("g3t rekt m8", 180, 380);
		page.drawString("420 blaze it skrub", 160, 395);
		if (rect1Clicked) page.drawImage(hits, xpos-955, ypos-545, this);
	}
	 public void mouseClicked (MouseEvent me) {
		  xpos = me.getX(); 
		  ypos = me.getY();
		  if (xpos > rect1xco && xpos < rect1xco+rect1width && ypos >rect1yco &&  
		    ypos < rect1yco+rect1height)  rect1Clicked = true; 
		  else  
		   rect1Clicked = false; 
		  repaint();
		 }
		 public void mousePressed (MouseEvent me) {}
		 public void mouseReleased (MouseEvent me) {} 
		 public void mouseEntered (MouseEvent me) {}
		 public void mouseExited (MouseEvent me) {}
}