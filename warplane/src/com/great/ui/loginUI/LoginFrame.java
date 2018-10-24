package com.great.ui.loginUI;

import java.awt.Dimension;

import javax.swing.JFrame;

public class LoginFrame extends JFrame{
	
	private LoginPanel loginPanel;
	private static LoginFrame loginFrame;
	public  LoginFrame( )
	{
		loginPanel=new LoginPanel(this);
		this.add(loginPanel);
		setTitle("��½����");
		//���ô�С���ɸı�
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ð���
		pack();
		// ���þ���
		setLocationRelativeTo(null);
		// ���ÿɼ�
		setVisible(true);
	}
	public static LoginFrame createLoginFrame()
	{
		if(loginFrame==null)
			loginFrame=new LoginFrame();
		return loginFrame;
	}
	public LoginPanel getLoginPanel() {
		return loginPanel;
	}
	public void setLoginPanel(LoginPanel loginPanel) {
		this.loginPanel = loginPanel;
	}

}
