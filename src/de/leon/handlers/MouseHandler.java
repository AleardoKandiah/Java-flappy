package de.leon.flappybird.handlers;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import de.leon.flappybird.main.Game;
import de.leon.flappybird.supers.Button;

public class MouseHandler implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

		if (Button.checkCollision(e.getX(), e.getY(), Game.startButton)) {
			if (Game.gameover) {
				Game.startButton.pressed = true;
				ObjectHandler.list.clear();
				ObjectHandler.addObject(Game.bird);
				Game.gameover = false;
				Game.score = 0;
				Game.startButton.pressed = false;
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}
}
