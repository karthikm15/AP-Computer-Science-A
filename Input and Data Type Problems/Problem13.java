
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Chap2P13 {
	public static void main(String[] args)   {  
    	JFrame frame = new JFrame();  
    	frame.setSize(400, 400);  
    	JLabel label = new JLabel("Hello!");	
    	label.setOpaque(true);	
    	Color bw = new Color(152, 251, 152);
    	label.setBackground(bw); 
    	frame.add(label);  	
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
    	frame.setVisible(true);  
	}
	}
