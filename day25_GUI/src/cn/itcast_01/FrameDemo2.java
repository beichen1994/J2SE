package cn.itcast_01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;

public class FrameDemo2 {
	public static void main(String[] args) {
		Frame f = new Frame("¡÷«‡œº");
		
		f.setSize(400, 300);
		//Dimension d = new Dimension(400,300);
		//f.setSize(d);
		f.setLocation(400, 200);
		//Point p = new Point(400,200);
		//f.setLocation(p);
		
		//f.setBounds(400, 200, 400, 300);
		
		f.setVisible(true);
	}
}
