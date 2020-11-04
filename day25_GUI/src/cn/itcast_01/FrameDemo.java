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
		
	
		
		//�����С
		f.setSize(400, 300); //����
		
		//����λ��
		f.setLocation(400,200);
		
		//�������
		f.setTitle("HelloWorld");
		
		//����ɼ�
		f.setVisible(true);
		
		
		//System.out.println("helloworld");
	}

}
