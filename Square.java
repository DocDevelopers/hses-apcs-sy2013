import java.awt.*;
import javax.swing.*;

public class Square 
{
	private double side;
	
	
	public Square(double a_side)
	{
		side = a_side;
		
	}
	
	public double perimeter()
	{
		return side*4;
		
	}
	
	public double diagonal()
	{
		double diag = Math.sqrt( Math.pow(side, 2)*2);
		return diag;
		
	}
	public static void main(String args[])
	{
		JFrame frame = new JFrame("Squares!!!!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel contentPane = new JPanel(new BorderLayout());
		JButton ok = new JButton("Calculate");
		
		frame.add(ok);
		
		
		
	   frame.setSize(500, 500);
		frame.pack();
		
		frame.setVisible(true);
	
		
	}
}
