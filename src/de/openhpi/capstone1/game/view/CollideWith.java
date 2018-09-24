package de.openhpi.capstone1.game.view;

import de.openhpi.capstone1.game.starter.Settings;
import processing.core.PApplet;

/**
 * The Class CollideWith.
 */
public class CollideWith extends AbstractView {

	/** The ball speed. */
	int[] ballSpeed = new int[2];

	/**
	 * Instantiates a new collide with.
	 *
	 * @param display the display
	 */

	public CollideWith(final PApplet display) {
		super(display);
	}

	/**
	 * Collide with wall.
	 *
	 * @param xball  the xball
	 * @param yball  the yball
	 * @param xspeed the xspeed
	 * @param yspeed the yspeed
	 * @param xpad   the xpad
	 * @return true, if successful
	 */
	public boolean collideWithWall(final int xball, final int yball, int xspeed, int yspeed, final int xpad) {
		final int d = Math
				.abs((yball + Settings.BALL_SIZE / 2) - (int) (Settings.WINDOW_HEIGHT - Settings.PADDLE_HEIGHT));

		if ((xball + Settings.BALL_SIZE / 2 == Settings.WINDOW_WIDTH) || (xball - Settings.BALL_SIZE / 2 == 0)) {
			xspeed = -xspeed;
			ballSpeed[0] = xspeed;
			ballSpeed[1] = yspeed;
		} else if (yball + Settings.BALL_SIZE / 2 == Settings.WINDOW_HEIGHT) {
			// ball collided with bottom edge of the screen?
			System.out.println("Game Over");
			ballSpeed[0] = 0;
			ballSpeed[1] = 0;

			return true;
		} else if (yball - Settings.BALL_SIZE / 2 == 0) {
			yspeed = -yspeed;
			ballSpeed[0] = xspeed;
			ballSpeed[1] = yspeed;
		} else if (d < 5) {
			if (xball + Settings.BALL_SIZE >= xpad
					&& xball + Settings.BALL_SIZE <= xpad + (int) Settings.PADDLE_WIDTH + 30) {

				yspeed = -yspeed;
				if (xpad >= Settings.WINDOW_WIDTH) {
					xspeed = xspeed + 1;
				} else {
					xspeed = xspeed - 1;
				}

				ballSpeed[0] = xspeed;
				ballSpeed[1] = yspeed;
			}
		} else {
			ballSpeed[0] = xspeed;
			ballSpeed[1] = yspeed;
		}

		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.openhpi.capstone1.game.view.AbstractView#update()
	 */
	@Override
	public void update() {

	}
}
