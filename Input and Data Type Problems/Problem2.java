import java.applet.Applet;
import java.awt.*;
import java.awt.Color;
public class Chap2P2 extends Applet{
	public void paint(Graphics frame)
	{
    	frame.setColor(Color.red);
    	frame.drawRect(100, 100, 50, 50);
    	frame.setColor(Color.blue);
    	frame.drawRect(100, 100, 100, 100);
	}
}
