package com.great.bean;

import java.awt.image.BufferedImage;

/**
 * ��װ�����ﹲͬ����
 */
public abstract class Flyer {
	// ����������x,y����
	public int x;
	public int y;
	// ���������Ŀ���
	protected int width;
	protected int height;
	// �������ͼƬ����
	public BufferedImage image;

	// ��������ƶ���ʽ
	public abstract void flyStep();

	// �жϷ������Ƿ�Խ��
	public abstract boolean outFrame();

	// �ж������������Ƿ���ײ
	public static boolean crash(Flyer f1, Flyer f2) {
		// �������������ĵ�
		int f1x = f1.x;
		int f1y = f1.y;

		int f2x = f2.x;
		int f2y = f2.y;
		// �������������Ƿ�����
		boolean hor = Math.abs(f1x - f2x) < (f1.width + f2.width) / 2 +20;
		// ��������������Ƿ�����
		boolean ver = Math.abs(f1y - f2y) < (f1.height + f2.height) / 2 +20;
		// �����������������������������Ϊ����ײ
		boolean flag;
		flag = ver && hor;
		return flag;
	}

	// ---------------------------------------------------------
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

}
