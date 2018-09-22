package de.openhpi.capstone1.game.view;

import processing.core.PApplet;

import de.openhpi.capstone1.game.starter.Settings;

public class Tryfun extends PApplet {
	
	
	
	public Tryfun() {
		

		
	}
	
	public float limit(float lim) {
		
		return lim = constrain(lim, 0, Settings.WINDOW_WIDTH -Settings.PADDLE_WIDTH);
		
	}

}
