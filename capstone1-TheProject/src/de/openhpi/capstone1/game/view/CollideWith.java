package de.openhpi.capstone1.game.view;

import de.openhpi.capstone1.game.starter.Settings;

public class CollideWith {
	
	int ball_speed[] = new int[2];
	
	
	public CollideWith(){
		
		
	}
	
	
	
	public boolean collideWithWall(int xball, int yball,int xspeed,int yspeed) {
		
		if(xball+Settings.BALL_SIZE/2 == Settings.WINDOW_WIDTH) {
			
			xspeed = -xspeed;
			ball_speed[0] = xspeed;
			ball_speed[1] = yspeed;
			
			
		}else if(xball-Settings.BALL_SIZE/2 == 0) {
			
			xspeed = -xspeed;
			ball_speed[0] = xspeed;
			ball_speed[1] = yspeed;
			
			
		}else if(yball+Settings.BALL_SIZE/2 == Settings.WINDOW_HEIGHT) {
//			ball collided with bottom edge of the screen?
			System.out.println("Game Over");
			ball_speed[0] = 0;
			ball_speed[1] = 0;
			return true;
		}else if(yball-Settings.BALL_SIZE/2 == 0) {
			
			yspeed = -yspeed;
			ball_speed[0] = xspeed;
			ball_speed[1] = yspeed;
			
		}else {
			ball_speed[0] = xspeed;
			ball_speed[1] = yspeed;
		}
		
		return false;
	}
}
