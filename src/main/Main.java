package main;

import processing.core.*;

public class Main extends PApplet{
	
	public void setup() {
    	background (220);
    }

    public void draw() {
    	ellipse (320, 320, mouseX, mouseY);
    }
    
    public void settings() {
    	size (720, 720); 
	}

    static public void main(String[] passedArgs) {
	    String[] appletArgs = new String[] { "main.Main" };
	    if (passedArgs != null) {
	      PApplet.main(concat(appletArgs, passedArgs));
	    } else {
	      PApplet.main(appletArgs);
	    }
	  }
}
