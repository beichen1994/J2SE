package cn.itcast_06;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
	public static void main(String[] args) {
		final Frame f = new Frame("���ı���ɫ");
		f.setBounds(400,200,400,300);
		f.setLayout(new FlowLayout());
		
		//�����ĸ���ť
		Button redbu = new Button("��ɫ");
		Button greenbu = new Button("��ɫ");
		Button bluebu = new Button("��ɫ");
		
		
		f.add(redbu);
		f.add(greenbu);
		f.add(bluebu);
		
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		
		/**
		//�԰�ť��Ӷ����¼�
		redbu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.RED);
			}
		});
		**/
		
		//�԰�ť�������¼�
		redbu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.RED);
			}
		});
		
		
		//�԰�ť����������¼�
		redbu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.RED);
			}
		});
		
		//�԰�ť�������뿪�¼�
		redbu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.WHITE);
			}
		});
		
		

		//�԰�ť����������¼�
		greenbu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.GREEN);
			}
		});
		
		//�԰�ť�������뿪�¼�
		greenbu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.WHITE);
			}
		});
		
		

		//�԰�ť����������¼�
		bluebu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.BLUE);
			}
		});
		
		//�԰�ť�������뿪�¼�
		bluebu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.WHITE);
			}
		});
		
		
		f.setVisible(true);
	}
	
}
