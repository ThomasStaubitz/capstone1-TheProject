package de.openhpi.capstone1.game.view;

import de.openhpi.capstone1.game.starter.Settings;
import processing.core.PApplet;

/**
 * The Class Tryfun.
 */
public class Tryfun extends AbstractView {

	/**
	 * Instantiates a new tryfun.
	 *
	 * @param display the display
	 */
	public Tryfun(final PApplet display) {
		super(display);
	}

	/**
	 * Limit.
	 *
	 * @param limit the limit
	 * @return the float
	 */
	public float limit(final float limit) {
		return PApplet.constrain(limit, 0, Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH);
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
