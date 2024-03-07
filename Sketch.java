import java.net.DatagramSocketImplFactory;

import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  
   public void setup() {





        //random background colour generator
        float r = random(256);
        float g = random(256);
        float b = random(256);
        background(r,g,b);
                          
               
               
                //random(143);
                //int colour;

                //colour = (int)random(143);
                //background(colour);

    // flower 1
    float flowerX = random(0, width);
    float flowerY = random(0, height);
    float petalSize = random(25, 150);
    float petalDistance = petalSize / 2;
    

    fill(113,98,189);
    // upper-left petal
    ellipse(flowerX - petalDistance, flowerY - petalDistance,
            petalSize, petalSize);
    
    // upper-right petal
    ellipse(flowerX + petalDistance, flowerY - petalDistance,
            petalSize, petalSize);
    
    // lower-left petal
    ellipse(flowerX - petalDistance, flowerY + petalDistance,
            petalSize, petalSize);
    
    // lower-right petal
    ellipse(flowerX + petalDistance, flowerY + petalDistance,
            petalSize, petalSize);
    
    fill(255, 241, 135);
    
    // center petal
    ellipse(flowerX, flowerY,
            petalSize, petalSize);



    float flower1 = random(0, width);
    float flower2 = random(0, height);
    float petalSize1 = random(25, 150);
    float petalDistance1 = petalSize / 2;
    

    fill(36, 60, 107);
    // upper-left petal
    ellipse(flower1 - petalDistance1, flower2 - petalDistance1,
            petalSize1, petalSize1);
    
    // upper-right petal
    ellipse(flower1 + petalDistance1, flower2 - petalDistance1,
            petalSize1, petalSize1);
    
    // lower-left petal
    ellipse(flower1 - petalDistance1, flower2 + petalDistance1,
            petalSize1, petalSize1);
    
    // lower-right petal
    ellipse(flower1 + petalDistance1, flower2 + petalDistance1,
            petalSize1, petalSize1);
    
    fill(255, 241, 135);
    
    // center petal
    ellipse(flower1, flower2,
            petalSize1, petalSize1);
  }
  

  public void draw() {

        //time function
        int s = second();
        int m = minute();
        int h = hour();
        int day = day();
        int year = year();
        text(day, 100, 100);
        text(h, 100, 110);
        text(m, 100, 120);
        text(s, 100, 130);
        text(year, 100, 140);
  // define other methods down here.
  }
}