package de.openhpi.capstone1.game.builder;

import java.util.ArrayList;

import de.openhpi.capstone1.game.view.AbstractView;
import processing.core.PApplet;

/**
 * The Class InteractiveComponent.
 */
public abstract class InteractiveComponent {

	/**
	 * Instantiates a new interactive component.
	 *
	 * @param display the display
	 */
	public InteractiveComponent(final PApplet display) {
		views = new ArrayList<>();
		this.display = display;
	}

	/**
	 * Handle event.
	 */
	public abstract void handleEvent();

	/** The views. */
	protected ArrayList<AbstractView> views;

	/** The display. */
	protected PApplet display;

	/**
	 * Update.
	 */
	public void update() {
		for (final AbstractView view : views) {
			view.update();
		}
	}
}
