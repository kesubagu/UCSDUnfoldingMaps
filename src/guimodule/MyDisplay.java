package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet{
	
	public void setup(){
		size(400, 400);
		background(255, 0, 255);
	}
	
	public void draw(){
		fill(255, 255, 0);
		ellipse(200, 200, 300, 300);
		fill(0, 0, 255);
		ellipse(150, 150, 50, 50);
		ellipse(250, 150, 50, 50);
		
		noFill();
		arc(200, 250, 75, 74, 0, PI/2);
		
	}
 
}
