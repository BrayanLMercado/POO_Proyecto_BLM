package MainPackage;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import MainPackage.Main.STATE;

public class Main extends Canvas implements Runnable{
 
	private static final long serialVersionUID = 5050370347925006000L;
	public static final int WIDTH=720,HEIGHT=WIDTH/12*9;
	
	private Thread thread;
	private boolean running=false;
	private Menu menu;
	
	public enum STATE{
		Menu,
		Easy,
		Hard,
	}
	
	public STATE gameState= STATE.Menu;
	
	public Main(){
		new Ventana(WIDTH,HEIGHT, "Mathematical Insanity Beta v1.0",this);
		menu = new Menu(this);
		this.addMouseListener(menu);
	}
	
	public synchronized void start(){
		thread= new Thread(this);
		thread.start();
		running=true;
	}
	
	public synchronized void stop(){
		try{
			thread.join();
			running=false;
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public void run(){ 
		 long lastTime=System.nanoTime();
		 double amountOfTicks=60.0;
		 double ns=1000000000/amountOfTicks;
		 double delta=0;
		 long timer=System.currentTimeMillis();
		 int frames=0;
		 while(running){
			 long now=System.nanoTime();
			 delta+=(now-lastTime)/ns;
			 lastTime=now;
			 while(delta>=1){
				 tick();
				 delta--;
			 }
			 if(running)
				 render();
			 frames++;
			 if(System.currentTimeMillis()-timer>1000){
				 timer+=1000;
				 frames=0;
			 }
		 }
		 stop();
	}
	
	private void tick(){
		if(gameState==STATE.Menu){
			menu.tick();
		}
	}
	
	private void render(){
		BufferStrategy bs= this.getBufferStrategy();
		if(bs==null){
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g= bs.getDrawGraphics();
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0,0,WIDTH,HEIGHT);
		if(gameState==STATE.Menu || gameState==STATE.Hard 
				|| gameState==STATE.Easy){
			menu.render(g);
		}
		g.dispose();
		bs.show();
		
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
