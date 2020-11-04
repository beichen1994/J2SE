package cn.itcast_01;

import java.awt.Frame;

/**	
 * 					Class Frame
 * 				Frame()
				Constructs a new instance of Frame that is initially invisible.
			
				Frame(String title)
				Constructs a new, initially invisible Frame object with the specified title.
				
			inherited from Class Window
	public void setSize(int width, int height)
				Resizes this component so that it has width width and height height.
 *
 */

public class FrameDemo {
	public static void main(String[] args){
		Frame f = new Frame();
		
	
		
		//窗体大小
		f.setSize(400, 300); //像素
		
		//窗体位置
		f.setLocation(400,200);
		
		//窗体标题
		f.setTitle("HelloWorld");
		
		//窗体可见
		f.setVisible(true);
		
		
		//System.out.println("helloworld");
	}

}
