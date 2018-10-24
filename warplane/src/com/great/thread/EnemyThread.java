package com.great.thread;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import com.great.bean.Enemy;
import com.great.bean.Flyer;
import com.great.bean.Game;

public class EnemyThread {

	public Game game;
	// �洢���ел������list����
	public List<Enemy> enemies = new ArrayList<Enemy>();

	public EnemyThread(Game game) {
		this.game = game;
	}

	// �л�������ӵл�
	int index = 0;

	public void addEnemy() {
		index++;
		if (index % 42 == 0) {
			Enemy enemy = new Enemy();
			enemies.add(enemy);
		}
	}

	// �л��ƶ�
	public void enemyMove() {
		for (int i = 0; i < enemies.size(); i++) {
			Enemy enemy = enemies.get(i);
			enemy.flyStep();
		}
	}

	// �л�Խ��ɾ��
	public void deleteEnemy() {
		for (int i = 0; i < enemies.size(); i++) {
			Enemy enemy = enemies.get(i);
			if (enemy.outFrame())
				enemies.remove(i);

		}
	}

	// �����л�
	public void paintenemy(Graphics g) {
		for (int i = 0; i < enemies.size(); i++) {
			Enemy enemy = enemies.get(i);
			g.drawImage(enemy.image, enemy.x, enemy.y, null);
		}
	}

	// �ӵ��͵л�����ײ���
	public void crash() {
		for (int i = 0; i < game.bulletThread.bullets.size(); i++) {
			for (int j = 0; j < enemies.size(); j++) {
				if (Flyer.crash(game.bulletThread.bullets.get(i), enemies.get(j))) {
					// ����Ӣ�۵÷�
					game.hero.setScore(game.hero.getScore() + enemies.get(j).getScore());

					// ɾ����ײ���ӵ��͵л�
					game.bulletThread.bullets.remove(i);
					enemies.remove(j);
					break;
				}
			}
		}

	}

	// Ӣ�ۺ͵л�����ײ���
	public void heroCrash() {
		for (int i = 0; i < enemies.size(); i++) {
			if (Flyer.crash(enemies.get(i), game.hero)) {
				game.hero.setLife(game.hero.getLife() - 1);
				if (game.hero.getLife() < 0)
					game.hero.setLife(0);
				enemies.remove(i);
				break;
			}
		}
	}

}
