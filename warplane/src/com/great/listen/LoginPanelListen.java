package com.great.listen;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import com.great.ui.MainUI.MainFrame;
import com.great.ui.loginUI.LoginPanel;

public class LoginPanelListen implements MouseListener {

	private LoginPanel loginPanel;

	public LoginPanelListen(LoginPanel loginPanel) {

		super();
		this.loginPanel = loginPanel;
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		String uname = loginPanel.getUnameText().getText();
		// �ж��û��Ƿ�����������
		if ("".equals(uname)) {
			JOptionPane.showMessageDialog(null, "��������������");
		} else {
			JOptionPane.showMessageDialog(null, "���ڼ���");
			loginPanel.getLoginFrame().setVisible(false);
			MainFrame mainFrame = MainFrame.getonlyMainFrame();
			mainFrame.setVisible(true);
			mainFrame.getPanel().getGame().setUname(uname);
		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO �Զ����ɵķ������

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO �Զ����ɵķ������

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO �Զ����ɵķ������

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO �Զ����ɵķ������

	}

}
