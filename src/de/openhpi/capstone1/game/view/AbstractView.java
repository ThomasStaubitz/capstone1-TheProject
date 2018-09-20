package de.openhpi.capstone1.game.view;

import processing.core.PApplet;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractView.
 */
public abstract class AbstractView {

	/** The display. */
	protected PApplet display;

	/**
	 * Instantiates a new abstract view.
	 *
	 * @param display the display
	 */
	public AbstractView(final PApplet display) {
		this.display = display;
	}

	/**
	 * Update.
	 */
	public abstract void update();
}
