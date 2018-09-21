package de.openhpi.capstone1.game.starter;

import java.awt.Color;

/**
 * The Class Settings.
 */
public final class Settings {
	/**
	 * Instantiates a new settings.
	 */
	private Settings() {

	}

	// [=====================] Game [=====================]
	/** The Constant USE_FULLSCREEN. */
	public static final boolean USE_FULLSCREEN = false;

	// [=====================] Window [=====================]
	/** The Constant WINDOW_HEIGHT. */
	public static final int WINDOW_HEIGHT = 500;

	/** The Constant WINDOW_WIDTH. */
	public static final int WINDOW_WIDTH = 500;

	// [=====================] GameScreen [=====================]
	/** The Constant GAMESCREEN_BACKGROUND_COLOR. */
	public static final int GAMESCREEN_BACKGROUND_COLOR = Color.WHITE.getRGB();

	// [=====================] Paddle [=====================]
	/** The Constant PADDLE_WIDTH_MULTIPLIER. */
	private static final float PADDLE_WIDTH_MULTIPLIER = 0.25f;

	/** The Constant PADDLE_HEIGHT_MULTIPLIER. */
	private static final float PADDLE_HEIGHT_MULTIPLIER = 0.05f;

	/** The Constant PADDLE_HEIGHT. */
	public static final float PADDLE_HEIGHT = WINDOW_HEIGHT * PADDLE_HEIGHT_MULTIPLIER;

	/** The Constant PADDLE_HEIGHT. */
	public static final float PADDLE_WIDTH = WINDOW_WIDTH * PADDLE_WIDTH_MULTIPLIER;

	/** The Constant PADDLE_COLOR. */
	public static final int PADDLE_COLOR = Color.BLACK.getRGB();

	// [=====================] Ball [=====================]
	/** The Constant BALL_COLOR. */
	public static final int BALL_COLOR = Color.BLACK.getRGB();

	/** The Constant BALL_SIZE_MULTIPLICATOR. */
	private static final float BALL_SIZE_MULTIPLICATOR = 0.05f;

	/** The Constant BALL_SIZE. */
	public static final int BALL_SIZE = (int) Math
			.floor(Math.min(WINDOW_HEIGHT, WINDOW_WIDTH) * BALL_SIZE_MULTIPLICATOR);

	// [=====================] Misc. [=====================]
	/** The Constant SPACER_SMALL. */
	public static final float SPACER_SMALL = Math.min(WINDOW_HEIGHT, WINDOW_WIDTH) * 0.01f;
}
