package de.leon.flappybird.main;

import java.awt.Canvas;

SuppressWarnings("serial")
public class Game extends Canvas implements Runnable {
    
    public static final int WIDTH = 432;    
    public static final int HEIGHT = 768;
    
    public boolean running;
	public static boolean gameover;

	public static BufferedImage img_gameover;
	public static BufferedImage background;
	public static Ground ground;
	public static Bird bird;

	public static Button startButton;
	
	public static int score;
	
	Thread thread;
	ServerSocket serverSocket;    

    public static void main(String[] args) {

    }

    public synchronized void start() {

    }
    
    public void init() {

    }

    public void tick() {

    }

    public void render() {

    }

    @Override
    public void run() {
        init();
        this.requestFocus();

        long pastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000/ amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int updates = 0;
        int frames = 0;

        while(running){
            long now = System.nanoTime();
            delta += (now - pastTime) / ns;
            pastTime = now;

            while(delta > 0){
                tick();
                updates++;

                render();
                frames++;

                delta--;
            } 
        }
    }


}
