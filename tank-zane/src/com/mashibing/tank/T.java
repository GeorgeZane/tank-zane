package com.mashibing.tank;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T {
	public static void main(String[] args) {
		//代表一个窗口
		Frame f = new Frame();
		//设置窗口大小
		f.setSize(800, 600);
		//设置不能改变大小
		f.setResizable(false);
		//设置标题
		f.setTitle("tank war");
		//设置为可见
		f.setVisible(true);
		//添加监听器，监听关闭事件
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
}
