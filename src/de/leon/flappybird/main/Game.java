package de.leon.flappybird.main;
import java.awt.Canvas;

SuppressWarnings("serial")
public class Game extends Canvas implements Runnable {
    
    public static final int WIDTH = 432;    
    public static final int HEIGHT = 768;

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
        double delta;
        long timer = System.currentTimeMillis();
        int updates;
        int frames;

    }


}
