package cn.itcast_04;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * �����ڴ�����Ӱ�ť���԰�ť���һ������¼�
 * A:�����������
 * B:������ť����
 * C:�ڴ�����Ӱ�ť
 * D:������ʾ
 */

public class FrameDemo {
	public static void main(String[] args) {
		
		Frame f = new Frame("��Ӱ�ť");
		f.setBounds(400,200,400,300);
		//���ò���Ϊ��ʽ����
		f.setLayout(new FlowLayout());
		
		
		Button bu  = new Button("���ǰ�ť");
		bu.setSize(20, 10);
		
		f.add(bu);
		
		f.setVisible(true);
		
		f.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		bu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("�������");
			}
		});
		
		
	}

}
