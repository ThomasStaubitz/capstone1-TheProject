package de.openhpi.capstone1.game.starter;

/**
 * The Class Settings.
 */
public class Settings {

	/** The settings. */
	private static Settings settingsInstance;

	/**
	 * Instance.
	 *
	 * @return the settings
	 */
	public static Settings instance() {
		if (settingsInstance == null) {
			settingsInstance = new Settings();
		}

		return settingsInstance;
	}

	private Settings() {

	}
}
