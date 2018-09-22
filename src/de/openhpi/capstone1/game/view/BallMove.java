package de.openhpi.capstone1.game.view;

import de.openhpi.capstone1.game.starter.Settings;
import processing.core.PApplet;

public class BallMove extends PApplet {
	
	int x;
	int y;
	int xspeed;
	int yspeed;
	int speed= 4;
	
	
	int ball_cord[] = new int[2];

	public BallMove() {
		

		
	}
	
	public void setSpeed(int xspeed, int yspeed) {
		
		this.xspeed = xspeed;
		this.yspeed = yspeed;
	}
	public int[] move() {
		
		this.x += xspeed;
		this.y += yspeed;
		this.ball_cord[0]=this.x;
		this.ball_cord[1]=this.y;
		this.x = constrain(this.x, 0 + Settings.BALL_SIZE/2, Settings.WINDOW_WIDTH - Settings.BALL_SIZE/2);
		this.y = constrain(this.y, 0 + Settings.BALL_SIZE/2, Settings.WINDOW_HEIGHT - Settings.BALL_SIZE/2);
	return ball_cord;
	}
	
	public void randomStart() {
		
		
		this.x = Settings.WINDOW_WIDTH/2;
		this.y = Settings.WINDOW_HEIGHT/2;
		this.xspeed = (int)(random(8)-4);
		this.yspeed = (int)Math.sqrt(16 - this.xspeed*this.xspeed) + (int)(random(2));
		while(this.yspeed == 0) {
			
			this.yspeed = (int)Math.sqrt(16 - this.xspeed*this.xspeed);
		}

		
	}
	

	
}
