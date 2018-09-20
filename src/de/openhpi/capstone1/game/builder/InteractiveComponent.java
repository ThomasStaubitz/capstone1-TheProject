package de.openhpi.capstone1.game.builder;

import de.openhpi.capstone1.game.view.AbstractView;

// TODO: Auto-generated Javadoc
/**
 * The Class InteractiveComponent.
 */
public abstract class InteractiveComponent {

	/**
	 * Handle event.
	 */
	public abstract void handleEvent();

	/** The views. */
	protected AbstractView[] views;

	/**
	 * Update.
	 */
	public void update() {
		for (final AbstractView view : views) {
			view.update();
		}
	}
}
