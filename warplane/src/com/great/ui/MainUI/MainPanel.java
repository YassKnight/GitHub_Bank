package com.great.ui.MainUI;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

import com.great.bean.Game;

public class MainPanel extends JPanel {
	// �汾��ʶ
	private static final long serialVersionUID = 1L;

	// �������̶���С
	public static final int WIDTH = 400;
	public static final int HEIGHT = 700;

	private Game game = new Game(this);

	public MainPanel() {
	}

	public void creatPanel() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}

	// ����ͼƬ
	public void paint(Graphics g) {
		// ����������ͼ
		g.drawImage(getGame().getBackground(), 0, 0, null);
		//��Ϸ�÷ֵ���100��ʱ�����ڶ��ŵ�ͼ
		if(getGame().hero.getScore()>100)
		{
			g.drawImage(getGame().getBackground2(), 0, 0, null);
		}
		// ����Ӣ�ۻ�
		paintHero(g);
		
		
		// �����л�
		getGame().enemyThread.paintenemy(g);
		// �����ӵ�
		getGame().bulletThread.paintBullets(g);
		// �����÷ֺ�������
		getGame().scoreThread.paintScore_Life(g);
		// ������ʼ����ͣ����������
		if (getGame().getState() == getGame().getStart()) {
			g.drawImage(getGame().getStart1(), 0, 0, null);
			g.drawString("\"�����Ļ��ʼ��Ϸ!!\"" , 180, 400);
		} else if (getGame().getState() == getGame().getPause()) {
			g.drawImage(getGame().getPause1(), 0, 0, null);
		} else if (getGame().getState() == getGame().getEnding()) {
			g.drawImage(getGame().getEnding1(), 0, 0, null);
			g.drawString("���ĵ÷֣�" + getGame().hero.getScore(), 240, 300);
			/*
			 * historyScore.add(hero.getscore()); scoreThread.paintAllScore(g);
			 */

		}
	}

	// ����Ӣ�۷ɻ�
	int index = 0;

	private void paintHero(Graphics g) {

			g.drawImage(Game.getHero1(), getGame().hero.x, getGame().hero.y, this);
		
	}

	// -----------------------------------------------
	public Game getGame() {
		
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

}
