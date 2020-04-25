import java.awt.Color;
import javax.swing.JFrame;
public class Chap2E8910
{
	public static void main(String[] args) {
    	JFrame frame = new JFrame();
    	frame.setSize(200, 200);
    	Color newColor = new Color(50, 100, 150);
    	newColor.brighter();
    	newColor.darker();
    	newColor.darker();
    	frame.getContentPane().setBackground(newColor);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
	}
}
