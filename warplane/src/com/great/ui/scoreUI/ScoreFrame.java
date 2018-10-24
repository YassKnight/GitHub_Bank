package com.great.ui.scoreUI;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class ScoreFrame extends JFrame {

	private ScorePanel scorePanel;

	public ScoreFrame() {
		scorePanel = new ScorePanel(this);
		this.add(scorePanel);
		// ���ô�С
		setPreferredSize(new Dimension(100, 300));
		setTitle("�Ʒְ�");
		// ���ò��ɸ��Ĵ�С
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���
		pack();
		// ���ô��ھ���
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public ScorePanel getScorePanel() {
		return scorePanel;
	}

	public void setScorePanel(ScorePanel scorePanel) {
		this.scorePanel = scorePanel;
	}

}
