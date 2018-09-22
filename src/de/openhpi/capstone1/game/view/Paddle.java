package de.openhpi.capstone1.game.view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import de.openhpi.capstone1.game.starter.Settings;
import processing.core.PApplet;

/**
 * The Class Paddle.
 */
public class Paddle extends AbstractView {

	/** The y position. */
	private static final float Y_POSITION = Settings.WINDOW_HEIGHT - Settings.PADDLE_HEIGHT;

	/** The x position. */
	private float xPosition = 0;

	/** The changes. */
	private final PropertyChangeSupport changes = new PropertyChangeSupport(this);

	/** The prv. */
	Tryfun prv = new Tryfun(display);

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
	 * @return the float
	 */
	private float checkBoundaries(final float mouseX) {
		return prv.limit(mouseX);
	}

	/**
	 * Adds the property change listener.
	 *
	 * @param listener the listener
	 */
	public void addPropertyChangeListener(final PropertyChangeListener listener) {
		changes.addPropertyChangeListener(listener);
	}

	/**
	 * Removes the property change listener.
	 *
	 * @param listener the listener
	 */
	public void removePropertyChangeListener(final PropertyChangeListener listener) {
		changes.removePropertyChangeListener(listener);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.openhpi.capstone1.game.view.AbstractView#update()
	 */
	@Override
	public void update() {
		display.fill(Settings.PADDLE_COLOR);
		setXPosition(checkBoundaries(display.mouseX));
		display.rect(xPosition, Y_POSITION, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}

	/**
	 * Sets the x position.
	 *
	 * @param newXPosition the new x position
	 */
	private void setXPosition(final float newXPosition) {
		if (xPosition == newXPosition)
			return;

		changes.firePropertyChange("xPosition", xPosition, newXPosition);
		xPosition = newXPosition;
	}
}
