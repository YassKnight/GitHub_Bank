package com.great.thread;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import com.great.bean.Bullet;
import com.great.bean.Game;

public class BulletThread {

	
	private Game game;
	// �洢�����ӵ������list����
	public List<Bullet> bullets = new ArrayList<Bullet>();

	public BulletThread(Game game) {
		this.game = game;
	}

	// �ӵ���������ӵ�
	int count = 0;

	public void addBullet() {
		count++;
		if (count % 30 == 0) {
			Bullet bullet = new Bullet(game.hero.x, game.hero.y);
			bullets.add(bullet);
		}
	}

	// �ӵ��ƶ�
	public void bulletMove() {
		for (int i = 0; i < bullets.size(); i++) {
			Bullet bullet = bullets.get(i);
			bullet.flyStep();
		}
	}

	// �����ӵ�
	public void paintBullets(Graphics g) {
		for (int i = 0; i < bullets.size(); i++) {
			Bullet bullet = bullets.get(i);
			g.drawImage(bullet.image, bullet.x + game.hero.getWidth() / 2, bullet.y, null);
		}
	}

	// �ӵ�Խ��ɾ��
	public void deleteBullets() {
		for (int i = 0; i < bullets.size(); i++) {
			Bullet bullet = bullets.get(i);
			if (bullet.outFrame())
				bullets.remove(i);
		}
	}

}
