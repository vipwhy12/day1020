package com.sist.exam01;
import javax.swing.JFrame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener{
	
	public MyFrame() {
		setSize(400,300);
		setVisible(true);
		
		addMouseListener(  this  );
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("���콺 Ŭ��");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		public  MyFrame;
	}
	
}
