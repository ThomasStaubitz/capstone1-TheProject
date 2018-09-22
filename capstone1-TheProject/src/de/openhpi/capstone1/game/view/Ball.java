package de.openhpi.capstone1.game.view;

import de.openhpi.capstone1.game.starter.Settings;
import processing.core.PApplet;

/**
 * The Class Ball.
 */
public class Ball extends AbstractView {
	
	int first = 0;
	int cord[] = new int[2];
	/**
	 * Instantiates a new ball.
	 *
	 * @param display the display
	 */
	BallMove movement = new BallMove();
	CollideWith collision = new CollideWith();
	
	public Ball(final PApplet display) {
		super(display);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.openhpi.capstone1.game.view.AbstractView#update()
	 */
	@Override
	public void update() {
		display.ellipseMode(PApplet.CENTER);
		display.fill(Settings.BALL_COLOR);
		if(first ==0) {
			movement.randomStart();
			cord = movement.move();
			display.ellipse(cord[0],cord[1], Settings.BALL_SIZE,Settings.BALL_SIZE);
			first = 1;
		}else {
			if(collision.collideWithWall(movement.x, movement.y,movement.xspeed,movement.yspeed)){
				movement.randomStart();
				cord = movement.move();
				display.ellipse(cord[0],cord[1], Settings.BALL_SIZE,Settings.BALL_SIZE);
			}else {
				collision.collideWithWall(movement.x, movement.y,movement.xspeed,movement.yspeed);
				movement.setSpeed(collision.ball_speed[0], collision.ball_speed[1]);
				cord = movement.move();
				display.ellipse(cord[0],cord[1], Settings.BALL_SIZE,Settings.BALL_SIZE);
			}

		}
		
		
		
	}

}
