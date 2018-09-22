package de.openhpi.capstone1.game.view;

import de.openhpi.capstone1.game.starter.Settings;
import processing.core.PApplet;
import processing.core.PConstants;

/**
 * The Class Ball.
 */
public class Ball extends AbstractView {

	/** The first. */
	int first = 0;

	/** The cord. */
	int[] cord = new int[2];

	/** The movement. */
	BallMove movement = new BallMove(display);

	/** The collision. */
	CollideWith collision = new CollideWith(display);

	/**
	 * Instantiates a new ball.
	 *
	 * @param display the display
	 */
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
		display.ellipseMode(PConstants.CENTER);
		display.fill(Settings.BALL_COLOR);

		if (first == 0) {
			movement.randomStart();
			cord = movement.move();
			display.ellipse(cord[0], cord[1], Settings.BALL_SIZE, Settings.BALL_SIZE);
			first = 1;
		} else {
			if (collision.collideWithWall(movement.x, movement.y, movement.xspeed, movement.yspeed)) {
				movement.randomStart();
				cord = movement.move();
				display.ellipse(cord[0], cord[1], Settings.BALL_SIZE, Settings.BALL_SIZE);
			} else {
				collision.collideWithWall(movement.x, movement.y, movement.xspeed, movement.yspeed);
				movement.setSpeed(collision.ballSpeed[0], collision.ballSpeed[1]);
				cord = movement.move();
				display.ellipse(cord[0], cord[1], Settings.BALL_SIZE, Settings.BALL_SIZE);
			}
		}
	}
}
