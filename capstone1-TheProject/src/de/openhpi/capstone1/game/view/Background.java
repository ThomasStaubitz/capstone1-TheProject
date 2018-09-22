package de.openhpi.capstone1.game.view;

import de.openhpi.capstone1.game.starter.Settings;
import processing.core.PApplet;

/**
 * The Class Background.
 */
public class Background extends AbstractView {

	/**
	 * Instantiates a new background.
	 *
	 * @param display the display
	 */
	public Background(final PApplet display) {
		super(display);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.openhpi.capstone1.game.view.AbstractView#update()
	 */
	@Override
	public void update() {
		display.fill(Settings.GAMESCREEN_BACKGROUND_COLOR);
		display.rect(0, 0, Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
	}

}
