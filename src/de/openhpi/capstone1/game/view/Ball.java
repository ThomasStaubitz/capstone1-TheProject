package de.openhpi.capstone1.game.view;

import de.openhpi.capstone1.game.starter.Settings;
import processing.core.PApplet;

/**
 * The Class Ball.
 */
public class Ball extends AbstractView {

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
		display.ellipseMode(PApplet.CENTER);
		display.fill(Settings.BALL_COLOR);
		display.ellipse(Settings.WINDOW_WIDTH / 2.0f - Settings.BALL_SIZE / 2.0f,
				Settings.WINDOW_HEIGHT - Settings.PADDLE_HEIGHT - Settings.BALL_SIZE, Settings.BALL_SIZE,
				Settings.BALL_SIZE);
	}

}
