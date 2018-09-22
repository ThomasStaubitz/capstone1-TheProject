package de.openhpi.capstone1.game.view;

import de.openhpi.capstone1.game.starter.Settings;
import processing.core.PApplet;

/**
 * The Class BallMove.
 */
public class BallMove extends AbstractView {

	/** The x. */
	int x;

	/** The y. */
	int y;

	/** The xspeed. */
	int xspeed;

	/** The yspeed. */
	int yspeed;

	/** The speed. */
	int speed = 4;

	/** The ball cord. */
	int[] ballCord = new int[2];

	/**
	 * Instantiates a new ball move.
	 *
	 * @param display the display
	 */
	public BallMove(final PApplet display) {
		super(display);
	}

	/**
	 * Sets the speed.
	 *
	 * @param xspeed the xspeed
	 * @param yspeed the yspeed
	 */
	public void setSpeed(final int xspeed, final int yspeed) {

		this.xspeed = xspeed;
		this.yspeed = yspeed;
	}

	/**
	 * Move.
	 *
	 * @return the int[]
	 */
	public int[] move() {
		this.x += xspeed;
		this.y += yspeed;
		this.ballCord[0] = this.x;
		this.ballCord[1] = this.y;
		this.x = PApplet.constrain(this.x, 0 + Settings.BALL_SIZE / 2, Settings.WINDOW_WIDTH - Settings.BALL_SIZE / 2);
		this.y = PApplet.constrain(this.y, 0 + Settings.BALL_SIZE / 2, Settings.WINDOW_HEIGHT - Settings.BALL_SIZE / 2);
		return ballCord;
	}

	/**
	 * Random start.
	 */
	public void randomStart() {
		this.x = Settings.WINDOW_WIDTH / 2;
		this.y = Settings.WINDOW_HEIGHT / 2;
		this.xspeed = (int) (display.random(8) - 4);
		this.yspeed = (int) Math.sqrt(16.0d - this.xspeed * this.xspeed) + (int) (display.random(2));

		while (this.yspeed == 0) {
			this.yspeed = (int) Math.sqrt(16.0d - this.xspeed * this.xspeed);
		}
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
