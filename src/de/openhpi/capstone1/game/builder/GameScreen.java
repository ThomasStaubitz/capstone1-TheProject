package de.openhpi.capstone1.game.builder;

import de.openhpi.capstone1.game.view.Background;
import de.openhpi.capstone1.game.view.Ball;
import de.openhpi.capstone1.game.view.Paddle;
import processing.core.PApplet;

/**
 * The Class GameScreen.
 */
public class GameScreen extends InteractiveComponent {

	/**
	 * Instantiates a new game screen.
	 *
	 * @param display the display
	 */
	public GameScreen(final PApplet display) {
		super(display);

		views.add(new Background(display));
		views.add(new Paddle(display));
		views.add(new Ball(display));
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
