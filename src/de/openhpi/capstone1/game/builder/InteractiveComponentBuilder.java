package de.openhpi.capstone1.game.builder;

import java.lang.reflect.InvocationTargetException;

import processing.core.PApplet;

// TODO: Auto-generated Javadoc
/**
 * The Class InteractiveComponentBuilder.
 */
public class InteractiveComponentBuilder {

	/**
	 * Creates the component.
	 *
	 * @param applet    the applet
	 * @param component the component
	 * @return the interactive component
	 */
	public static InteractiveComponent create(final PApplet applet, final Class<?> component) {
		try {
			return (InteractiveComponent) component.getDeclaredConstructor(PApplet.class).newInstance(applet);
		} catch (IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException
				| InstantiationException | IllegalAccessException e) {
			e.printStackTrace();

			return null;
		}
	}
}
