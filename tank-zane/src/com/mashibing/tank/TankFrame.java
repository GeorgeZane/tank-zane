package com.mashibing.tank;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {

	int x = 200;
	int y = 200;

	public TankFrame() {
		// 设置窗口大小
		setSize(800, 600);
		// 设置不能改变大小
		setResizable(false);
		// 设置标题
		setTitle("tank war");
		// 设置为可见
		setVisible(true);
		
		//添加键盘监听事件
		this.addKeyListener(new MyKeyListener());
		
		// 添加监听器，监听关闭事件
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});
	}

	/** 
	 * 窗口重新绘制的时候会调用这个方法（窗口第一次显示，窗口被盖住又显示出来，窗口改变大小的时候）
	 * @param g
	 * @see java.awt.Window#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics g) {
		System.out.println("paint");
		g.fillRect(x, y, 50, 50);
		x += 10;
		y += 10;
	}

	/**  
	 * @Title: TankFrame.java
	 * @Package com.mashibing.tank
	 * @Description: 添加键盘的监听
	 * @author ZhaoJianQiang
	 * @date 2020-05-11 18:09 
	 * @version V1.0  
	 */
	class MyKeyListener extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("key pressed!");
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("key released!");
		}

	}

}
