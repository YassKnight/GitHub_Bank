package com.great.bean;

public class Bullet extends Flyer {
	// �ӵ��ķ��м��
	private int speed = 4;

	public Bullet() {

	}

	public Bullet(int x, int y) {
		image = Game.getBullet1();
		width = image.getWidth();
		height = image.getHeight();
		// ��ȡ�ӵ�����ʱ�ɻ���λ��
		this.x = x;
		this.y = y;

	}

	@Override
	public void flyStep() {
		// �ӵ����е�·��
		y -= speed;
	}

	@Override
	public boolean outFrame() {
		// �ӵ��Ƿ�Խ��
		return (y + height) < 0;
	}

}
