package cn.itcast_07;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("��������������ַ�");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		
		//����Label��ǩ����
		Label label = new Label("���������qq���룬�����Ƿ�����");
		TextField tf = new TextField(40);
		
		f.add(label);
		f.add(tf); 
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		
		//���ı�����Ӽ����¼�
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//�����ȡ�õ��ַ����������ַ���ȡ���¼�
				//˼·���Ȼ�ȡ�ַ����ж��ַ���ȡ���¼�
				char ch  = e.getKeyChar();
				if(!(ch >= '0'&& ch <='9')){
					e.consume();
				}
				
			}
		});
		
		
	}
}
