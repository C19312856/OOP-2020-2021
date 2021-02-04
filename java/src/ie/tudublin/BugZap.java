package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{
    public void settings()
	{
		size(500,500);
	}

    public void setup() 
    {
		colorMode(HSB);
		background(5);

		playerX = 200;
		playerY = 200;
		playerWidth= 100;
		
	}

    float playerX = 20, playerY = 20, playerWidth = 40;
    float bugX = 50, bugY = 50, bugWidth = 40;
    float playerSpeed = 5;

	
	
	public void draw()
	{	
		drawPlayer(playerX, playerY, playerWidth);
    }
    
    void drawPlayer(float playerX, float playerY, float playerWidth)
    {
        
        float playerHeight = playerWidth / 2;
        line(playerX, playerY + playerHeight, playerX + playerWidth, playerY + playerHeight);
        line(playerX, playerY + playerHeight, playerX, playerY + playerHeight * 0.5f);
        line(playerX + playerWidth, playerY + playerHeight, playerX + playerWidth, playerY + playerHeight * 0.5f);
  
        line(playerX, playerY + playerHeight * 0.5f, playerX + playerWidth * 0.2f, playerY + playerHeight * 0.3f);
        line(playerX + playerWidth, playerY + playerHeight * 0.5f, playerX + playerWidth * 0.8f, playerY + playerHeight * 0.3f);
        line(playerX + playerWidth * 0.2f, playerY + playerHeight * 0.3f, playerX + playerWidth * 0.8f, playerY + playerHeight * 0.3f);
        line(playerX + playerWidth * 0.5f, playerY, playerX + playerWidth * 0.5f, playerY + playerHeight * 0.3f); 
        stroke(255);
    }



    public void keyPressed()
	{
		if (keyCode == LEFT)
		{
            System.out.println("Left arrow pressed");
            playerX -= 1;
		}
		if (keyCode == RIGHT)
		{
            System.out.println("Right arrow pressed");
            playerX += 1;
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
		}
	}
}

