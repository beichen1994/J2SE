package cn.itcast_08;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("һ���˵�");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		
		//�����˵���
		MenuBar mb = new MenuBar();
		//�����˵�
		Menu m = new Menu("�ļ�");
		//�����ε���
		MenuItem mi = new MenuItem("�˳�ϵͳ");
		
		
		m.add(mi);
		mb.add(m);
		f.setMenuBar(mb);
		
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		
		
		
		mi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		
		
		
	}

}
