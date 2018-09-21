/**
 *
 */
package de.openhpi.capstone1.game.builder;

import de.openhpi.capstone1.game.view.Paddle;
import processing.core.PApplet;

/**
 * @author dew1r
 *
 */
public class GameScreen extends InteractiveComponent {

	/**
	 * Instantiates a new game screen.
	 * 
	 * @param display
	 */
	public GameScreen(final PApplet display) {
		super(display);

		views.add(new Paddle(display));
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.openhpi.capstone1.game.builder.InteractiveComponent#handleEvent()
	 */
	@Override
	public void handleEvent() {
	}

}
