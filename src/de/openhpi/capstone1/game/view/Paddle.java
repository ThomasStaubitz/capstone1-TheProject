package de.openhpi.capstone1.game.view;

import de.openhpi.capstone1.game.starter.Settings;
import processing.core.PApplet;

/**
 * The Class Paddle.
 */
public class Paddle extends AbstractView {

	/** The y position. */
	private static final float Y_POSITION = Settings.WINDOW_HEIGHT - Settings.PADDLE_HEIGHT;

	/**
	 * Instantiates a new paddle.
	 *
	 * @param display the display
	 */
	public Paddle(final PApplet display) {
		super(display);
	}

	/**
	 * Check boundaries.
	 *
	 * @param mouseX the mouse X
	 * @return the optimizedPosition
	 */
	
	Tryfun prv = new Tryfun();
	private float checkBoundaries(final float mouseX) {
//		float optimizedPosition = mouseX;
//
//		if (optimizedPosition + Settings.PADDLE_WIDTH / 2 > Settings.WINDOW_WIDTH) {
//			optimizedPosition = Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH / 2;
//		} else if (optimizedPosition < Settings.PADDLE_WIDTH / 2) {
//			optimizedPosition = Settings.PADDLE_WIDTH / 2;
//		}
//
//		return optimizedPosition;
//		float move = mouseX;
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
//		display.rect(checkBoundaries(display.mouseX) - Settings.PADDLE_WIDTH / 2, Y_POSITION, Settings.PADDLE_WIDTH,
//				Settings.PADDLE_HEIGHT);
		display.rect(checkBoundaries(display.mouseX), Y_POSITION, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}

}
