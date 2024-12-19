/*  
 * Class author: Jophie Chan
 * Date created: 12/2/2024
 * General description: This class represents a Paddle object with properties such as position, size, and velocity. 
 * It includes methods to manipulate and render the paddle on the screen, such as moving, drawing, and reversing its direction.
 */

import java.awt.*;

public class Paddle {

    private int xPos;          // The current X position of the paddle
    private int yPos;          // The current Y position of the paddle
    private int width;         // The width of the paddle
    private int height;        // The height of the paddle
    private int velocity;      // The velocity of the paddle, controls its movement speed

    // Constructor to initialize the paddle with given position, width, height, and default velocity
    public Paddle (int xPos, int yPos, int width, int height) {
        this.xPos = xPos;       // Set the initial X position
        this.yPos = yPos;       // Set the initial Y position
        this.width = width;     // Set the paddle width
        this.height = height;   // Set the paddle height
        this.velocity = 1;      // Default velocity is set to 1 (can be changed later)
    }
    
    public int getX() {
        return xPos;
    }

    public void setX(int xP) {
        this.xPos = xP;
    }

    public int getY() {
        return yPos;
    }

    public void setY(int yP) {
        this.yPos = yP;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int widthh) {
        this.width = widthh;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int heightt) {
        this.height = heightt;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocityy) {
        this.velocity = velocityy;
    }

    public void reverseX(){
        velocity *= -2;  // Reverse the velocity by multiplying by -2 (or changing direction)
    }

    // Method to draw the paddle on the screen using Graphics
    public void draw (Graphics g) {
        g.setColor(Color.red);          // Set the color of the paddle to red
        g.drawRect(xPos, yPos, width, height);  // Draw the paddle as a rectangle
    }

    // Method to move the paddle based on its current velocity
    public void move() {
        xPos += velocity;  // Update the X position by adding the velocity
        if(velocity > 0) {
            velocity--;      // Slow down the paddle when moving to the right
        }
        if(velocity < 0) {
            velocity++;      // Slow down the paddle when moving to the left
        }
    }

    // Method to increase or decrease the paddle's velocity
    public void addVelocity(int add) {
        velocity += add;   // Adjust the velocity by adding a specified value
    }
}
