package com.great.bean;

import com.great.ui.MainUI.MainPanel;

public class Hero extends Flyer {

	// ���������ͷ���
	private int life;
	private int score;

	public Hero() {
		// ����ͼƬ
		image = Game.getHero1();
		// ���÷ɻ���ʼλ��
		x = 150;
		y = 600;
		// ���÷ɻ���С
		width = image.getWidth();
		// System.out.println(width);
		height = image.getHeight();
		// System.out.println(height);
		// ���÷ɻ����������ͷ���
		life = 3;
		score = 0;
	}

	public void MoveTo(int x, int y) {
		this.x = x - width / 2;
		this.y = y - height / 2;
	}

	@Override
	public void flyStep() {
		// TODO �Զ����ɵķ������

	}

	@Override
	public boolean outFrame() {
		// �жϷɻ��Ƿ�Խ��

		// �жϷɻ������Ƿ�Խ��
		boolean flag1 = (x - width / 2) < 0;
		boolean flag2 = (x + width / 2) > MainPanel.WIDTH;
		// �жϷɻ������Ƿ�Խ��
		boolean flag3 = (y - height / 2) < 0;
		boolean flag4 = (y + height / 2) > MainPanel.HEIGHT;
		return flag1 || flag2 || flag3 || flag4;

	}

	/*
	 * public Bullet[] shoot() { Bullet[] bullets = null; // �ӵ�λ��x���꣺x+width/2 //
	 * �ӵ�λ��y���꣺y-�ӵ�ͼƬ�ĸ߶� bullets = new Bullet[1]; bullets[0] = new Bullet(x + width
	 * / 2, y); return bullets; }
	 */
	// -------------------------------------------------------------------
	// �ⲿ��ȡ����
	public int getLife() {
		return life;
	}

	// �ⲿ��ȡ����
	public int getScore() {
		return score;
	}

	// �ⲿ��������
	public void setLife(int life) {
		this.life = life;
	}

	// �ⲿ������������
	public void setScore(int score) {
		this.score = score;
	}

}