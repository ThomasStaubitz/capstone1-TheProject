/**
 *
 */
package de.openhpi.capstone1.game.view;

import processing.core.PApplet;

/**
 * @author dew1r
 *
 */
public class Paddle extends AbstractView {

	/**
	 * Instantiates a new paddle.
	 *
	 * @param display the display
	 */
	public Paddle(final PApplet display) {
		super(display);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.openhpi.capstone1.game.view.AbstractView#update()
	 */
	@Override
	public void update() {
		display.rect(display.width / 2.0f - (display.width * 0.25f) / 2.0f, display.height - display.height * 0.05f,
				display.width * 0.25f, display.height * 0.5f);
		display.fill(0);
		display.redraw();
	}

}
