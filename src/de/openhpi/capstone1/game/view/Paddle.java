package de.openhpi.capstone1.game.view;

import de.openhpi.capstone1.game.starter.Settings;
import processing.core.PApplet;

/**
 * The Class Paddle.
 */
public class Paddle extends AbstractView {

	/** The y position. */
	private static final float Y_POSITION = Settings.WINDOW_HEIGHT - Settings.PADDLE_HEIGHT;

	Tryfun prv = new Tryfun(display);

	/**
	 * Instantiates a new paddle.
	 *
	 * @param display the display
	 */
	public Paddle(final PApplet display) {
		super(display);
	}

	private float checkBoundaries(final float mouseX) {
		return prv.limit(mouseX);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.openhpi.capstone1.game.view.AbstractView#update()
	 */
	@Override
	public void update() {
		display.fill(Settings.PADDLE_COLOR);
		display.rect(checkBoundaries(display.mouseX), Y_POSITION, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}
}
