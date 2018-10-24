package com.great.bean;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;

import com.great.listen.MainPanelListen;
import com.great.thread.BulletThread;
import com.great.thread.EnemyThread;
import com.great.thread.ScoreThread;
import com.great.ui.MainUI.MainPanel;

public class Game {

	private MainPanel panel;
	// ��Ϸ�������
	private String uname;

	// Ӣ��ʵ��
	public Hero hero = new Hero();

	// �����ӵ�
	public BulletThread bulletThread = new BulletThread(this);

	// �����л�
	public EnemyThread enemyThread = new EnemyThread(this);

	// �����������
	public ScoreThread scoreThread = new ScoreThread(this);

	/*
	 * // �洢�����ļ��� public List<Integer> historyScore=new ArrayList<Integer>();
	 */

	// ������Ϸ����״̬
	private int State = 0;
	private static final int START = 0;
	private static final int RUNNING = 1;
	private static final int PAUSE = 2;
	private static final int ENDING = 3;

	// ��ʼʱ������ͼƬ
	private static BufferedImage start1;
	private static BufferedImage pause1;
	private static BufferedImage ending1;
	private static BufferedImage hero1;
	private static BufferedImage background1;
	private static BufferedImage bullet1;
	private static BufferedImage enemy1;
	private static BufferedImage background2;

	// ��ʼʱ��������ͼƬ
	static {
		try {
			start1 = ImageIO.read(new FileInputStream("image/start.png"));
			pause1 = ImageIO.read(new FileInputStream("image/pause.png"));
			ending1 = ImageIO.read(new FileInputStream("image/ending.png"));
			hero1 = ImageIO.read(new FileInputStream("image/hero1.png"));
			background1 = ImageIO.read(new FileInputStream("image/background1.jpg"));
			bullet1 = ImageIO.read(new FileInputStream("image/BULLET.png"));
			enemy1 = ImageIO.read(new FileInputStream("image/airplane.png"));
			background2 = ImageIO.read(new FileInputStream("image/background2.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Game(MainPanel panel) {
		this.panel = panel;
	}

	// �¼�����
	public void action() {
		// ���������
		MainPanelListen listen = new MainPanelListen(this, panel);
		panel.addMouseMotionListener(listen);
		panel.addMouseListener(listen);

		Timer timer = new Timer();
		{
			timer.schedule(new TimerTask() {

				@Override
				public void run() {
					if (getState() == getRunning()) {
						// �ӵ��˶�
						bulletThread.addBullet();
						bulletThread.bulletMove();
						// �ӵ�Խ��ɾ��
						bulletThread.deleteBullets();
						// �л��˶�
						enemyThread.addEnemy();
						enemyThread.enemyMove();
						// �л�Խ��ɾ��
						enemyThread.deleteEnemy();

						// ��ײɾ��
						enemyThread.crash();
						enemyThread.heroCrash();
						if (hero.getLife() == 0) {
							setState(getEnding());

						}

					}
					// �ػ�
					panel.repaint();
				}
			}, 10, 10);
		}

	}
	
	
	
	

	// -----------------------------------------------------------------
	
	
	
	
	
	public int getState() {
		return State;
	}

	public static BufferedImage getBackground2() {
		return background2;
	}

	public static void setBackground2(BufferedImage background2) {
		Game.background2 = background2;
	}

	public void setState(int state) {
		State = state;
	}

	public MainPanel getPanel() {
		return panel;
	}

	public void setPanel(MainPanel panel) {
		this.panel = panel;
	}

	public Hero getHero() {
		return hero;
	}

	public void setHero(Hero hero) {
		this.hero = hero;
	}

	public BulletThread getBulletThread() {
		return bulletThread;
	}

	public void setBulletThread(BulletThread bulletThread) {
		this.bulletThread = bulletThread;
	}

	public EnemyThread getEnemyThread() {
		return enemyThread;
	}

	public void setEnemyThread(EnemyThread enemyThread) {
		this.enemyThread = enemyThread;
	}

	public ScoreThread getScoreThread() {
		return scoreThread;
	}

	public void setScoreThread(ScoreThread scoreThread) {
		this.scoreThread = scoreThread;
	}

	public BufferedImage getStart1() {
		return start1;
	}

	public void setStart(BufferedImage start) {
		Game.start1 = start;
	}

	public BufferedImage getPause1() {
		return pause1;
	}

	public void setPause(BufferedImage pause) {
		Game.pause1 = pause;
	}

	public BufferedImage getEnding1() {
		return ending1;
	}

	public void setEnding(BufferedImage ending) {
		Game.ending1 = ending;
	}

	public static BufferedImage getHero1() {
		return hero1;
	}

	public void setHero1(BufferedImage hero1) {
		Game.hero1 = hero1;
	}


	public BufferedImage getBackground() {
		return background1;
	}

	public void setBackground(BufferedImage background) {
		Game.background1 = background;
	}

	public static BufferedImage getBullet1() {
		return bullet1;
	}

	public void setBullet1(BufferedImage bullet1) {
		Game.bullet1 = bullet1;
	}

	public static BufferedImage getEnemy1() {
		return enemy1;
	}

	public void setEnemy1(BufferedImage enemy1) {
		Game.enemy1 = enemy1;
	}

	public int getStart() {
		return START;
	}

	public int getRunning() {
		return RUNNING;
	}

	public int getPause() {
		return PAUSE;
	}

	public int getEnding() {
		return ENDING;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

}
