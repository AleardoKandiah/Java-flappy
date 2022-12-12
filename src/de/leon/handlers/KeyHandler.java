package de.leon.flappybird.handlers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import de.leon.flappybird.main.Game;

public class KeyHandler implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			Game.bird.setVelY(-5);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
}
