package de.openhpi.capstone1.game.starter;

import de.openhpi.capstone1.game.builder.GameScreen;
import de.openhpi.capstone1.game.builder.InteractiveComponent;
import de.openhpi.capstone1.game.builder.InteractiveComponentBuilder;
import processing.core.PApplet;

// TODO: Auto-generated Javadoc
/**
 * The Class TheApp.
 */
public class TheApp extends PApplet {

	private InteractiveComponent gameScreen;

	/*
	 * (non-Javadoc)
	 *
	 * @see processing.core.PApplet#settings()
	 */
	@Override
	public void settings() {
		// Size of the window
		size(500, 500);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see processing.core.PApplet#setup()
	 */
	@Override
	public void setup() { // setup() runs once
		frameRate(30);

		gameScreen = InteractiveComponentBuilder.create(this, GameScreen.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see processing.core.PApplet#draw()
	 */
	@Override
	public void draw() { // draw() loops forever, until stopped
		gameScreen.update();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see processing.core.PApplet#mouseClicked()
	 */
	// Add further user interaction as necessary
	@Override
	public void mouseClicked() {

	}
}
