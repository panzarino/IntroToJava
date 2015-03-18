//Zach Panzarino
//Program 2.14
//2-27-25
//Prints a snowman
 
import java.awt.*;
import java.applet.Applet;
public class Snowman extends Applet {
	private static final long serialVersionUID = 1L;
	public void init(){
		setSize(300,225);
	}

	public void paint(Graphics page) {
		final int MID = 150;
		final int TOP = 50;
		setBackground(Color.cyan);
		page.setColor(Color.blue);
		page.fillRect(0,175,300,50); //ground
		page.setColor(Color.yellow);
		page.fillOval(250,-40,80,80); //sun
		page.setColor(Color.white);
		page.fillOval(MID, TOP, 40, 40);
		page.fillOval(MID-15, TOP+35, 70, 50);
		page.fillOval(MID-30, TOP+80, 100, 60); //body
		page.setColor(Color.black);
		page.fillOval(MID+10, TOP+10, 5, 5);
		page.fillOval(MID+25, TOP+10, 5, 5); //eyes
		page.drawArc(MID+10, TOP+20, 20, 10, 190, -160); //mouth
		page.drawLine(MID-5, TOP+60, MID-30, TOP+40);
		page.drawLine(MID+45, TOP+60, MID+70, TOP+60); //arms
		page.drawLine(MID, TOP+5, MID+40, TOP+5);
		page.fillRect(MID+5, TOP-20, 30, 25); //hat
		page.drawString("Zach Panzarino", 10, 20); //name
		page.setColor(Color.red);
		page.fillOval(MID+18, TOP+50, 5, 5);
		page.fillOval(MID+18, TOP+60, 5, 5); //buttons
	}
}