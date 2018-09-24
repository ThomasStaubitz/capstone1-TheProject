package de.openhpi.capstone1.game.starter;

import processing.core.PApplet;

/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
		if (Settings.USE_FULLSCREEN) {
			PApplet.main(new String[] { "--present", TheApp.class.getName() });
		} else {
			PApplet.main(new String[] { TheApp.class.getName() });
		}
	}
}
