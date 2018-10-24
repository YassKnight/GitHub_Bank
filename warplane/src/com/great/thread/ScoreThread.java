package com.great.thread;

import java.awt.Font;
import java.awt.Graphics;

import com.great.bean.Game;

public class ScoreThread {
	private Game game;

	// ��������
	Font font = new Font(Font.SANS_SERIF, Font.BOLD, 14);

	public ScoreThread(Game game) {
		this.game = game;
	}

	// ���������ʾӢ�۷ɻ������͵÷�
	public void paintScore_Life(Graphics g) {
		// ���õ÷ֺ�������������
		int x = 10;
		int y = 15;
		g.setFont(font);
		g.drawString("�÷֣�" + game.hero.getScore(), x, y);
		y += 20;
		g.drawString("��������" + game.hero.getLife(), x, y);
	}

	/*
	 * // ������������ʷ������� public void paintAllScore(Graphics g) { // ����������� int x = 10;
	 * int y = 500; g.setFont(font); g.drawString("��ʷ�÷֣�", x, y-20);
	 * 
	 * //g.drawString("<"+i+">"+panel.historyScore.get(i)+"��", x, y); for (int i =
	 * 0; i < panel.historyScore.size(); i++) {
	 * g.drawString("<"+i+">"+panel.historyScore.get(i)+"��", x, y+i*10);
	 * 
	 * }//s.run();
	 * 
	 * }
	 */
}
