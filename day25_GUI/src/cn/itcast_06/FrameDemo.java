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
		final Frame f = new Frame("更改背景色");
		f.setBounds(400,200,400,300);
		f.setLayout(new FlowLayout());
		
		//创建四个按钮
		Button redbu = new Button("红色");
		Button greenbu = new Button("绿色");
		Button bluebu = new Button("蓝色");
		
		
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
		//对按钮添加动作事件
		redbu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.RED);
			}
		});
		**/
		
		//对按钮添加鼠标事件
		redbu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.RED);
			}
		});
		
		
		//对按钮添加鼠标进入事件
		redbu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.RED);
			}
		});
		
		//对按钮添加鼠标离开事件
		redbu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.WHITE);
			}
		});
		
		

		//对按钮添加鼠标进入事件
		greenbu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.GREEN);
			}
		});
		
		//对按钮添加鼠标离开事件
		greenbu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.WHITE);
			}
		});
		
		

		//对按钮添加鼠标进入事件
		bluebu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.BLUE);
			}
		});
		
		//对按钮添加鼠标离开事件
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
