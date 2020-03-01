package praticagraficos;

import java.awt.Canvas;

import javax.swing.JFrame;

public class Graficos extends Canvas implements Runnable{
	public static JFrame frame;
	private final int widht = 240;
	private final int height = 160;
	private final int scale = 3;
	private Thread thread;
	private boolean isRunning = true;
	
	
	public static void main(String args[]) {
		
	}
	
	public Graficos() {
		thread = new Thread(this);
		thread.start();
	}
	
	public void tick() {
		
	}
	
	public void render() {
		
	}


	public void run() {
		while(isRunning) {
			tick();
			render();
		}
	}

}
