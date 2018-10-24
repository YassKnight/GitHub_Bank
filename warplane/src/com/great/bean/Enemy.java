package com.great.bean;

import java.util.Random;

import com.great.ui.MainUI.MainPanel;

public class Enemy extends Flyer {
	// ���õл��ٶ�
	private static int speed = 1;
	// ���õл��ķ���
	private int score = 20;

	public Enemy() {
		image = Game.getEnemy1();
		width = image.getWidth();
		height = image.getHeight();
		y = -height;
		Random random = new Random();
		x = random.nextInt(MainPanel.WIDTH - width);
	}

	// �л�����·��
	@Override
	public void flyStep() {
		y += speed;
	}

	// Խ����
	@Override
	public boolean outFrame() {
		return y > MainPanel.HEIGHT;
	}

	// ---------------------------------------------------
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
