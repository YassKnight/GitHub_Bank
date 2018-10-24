package com.great.ui.MainUI;

import javax.print.attribute.standard.MediaName;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

	// �汾��ʶ
	private static final long serialVersionUID = 1L;
	private MainPanel panel;
	public static MainFrame mainFrame;

	public MainFrame() {
		panel = new MainPanel();
		panel.creatPanel();
		this.add(panel);
		// ���ô��ڱ���
		setTitle("�ɻ���ս");
		// ���ò��ɸı��С
		// setResizable(false);
		// ���ô��ر�
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// ���ð���
		pack();
		// ���þ���
		setLocationRelativeTo(null);
		// �¼�
		panel.getGame().action();

	}

	public MainFrame(MainPanel panel) {
		super();
		this.panel = panel;
	}

	public static MainFrame getonlyMainFrame() {
		if (mainFrame == null) {
			mainFrame = new MainFrame();

		}
		return mainFrame;
	}

	// ---------------------------------------------
	public MainPanel getPanel() {
		return panel;
	}

	public void setPanel(MainPanel panel) {
		this.panel = panel;

	}

}
