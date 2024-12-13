/*  
 * Class author: Jophie Chan
 * Date created: 12/2/2024
 * General description: This class represents a Ball object with properties such as position, size, and velocity. 
 * It includes methods to manipulate and render the ball on the screen, such as moving, drawing, and reversing its direction.
 */

 import java.awt.*;

 public class Ball {
	 // Instance variables representing the position (xPos, yPos), size, and velocity (xVelocity, yVelocity) of the ball
	 private int xPos;
	 private int yPos;
	 private int size;
	 private int xVelocity;
	 private int yVelocity;
 
	 // Constructor to initialize the ball's position, size, and set default velocities for movement
	 public Ball(int x, int y, int getSize) {
		 this.xPos = x;
		 this.yPos = y;
		 this.size = getSize;
		 this.xVelocity = 1;   // Default horizontal speed
		 this.yVelocity = -1;  // Default vertical speed
	 }
 
	 public int getXpos() {
		 return xPos;
	 }
 
	 public void setX(int xP) {
		 this.xPos = xP;
	 }
 
	 public int getYpos() {
		 return yPos;
	 }
 
	 public void setY(int yP) {
		 this.yPos = yP;
	 }
 
	 public int getSize() {
		 return size;
	 }
 
	 public void setSize(int sizee) {
		 this.size = sizee;
	 }
 
	 public int getXVelocity() {
		 return xVelocity;
	 }
 
	 public void setXVelocity(int xVelocityy) {
		 this.xVelocity = xVelocityy;
	 }
 
	 public int getYVelocity() {
		 return yVelocity;
	 }
 
	 public void setYVelocity(int yVelocityy) {
		 this.yVelocity = yVelocityy;
	 }
 
	 public void reverseY() {
		 yVelocity *= -1;
	 }
 
	 public void reverseX() {
		 xVelocity *= -1;
	 }
 
	 // Method to draw the ball on the screen using the Graphics object
	 public void draw(Graphics g) {
		 g.setColor(Color.blue);           // Set color to blue
		 g.fillOval(xPos, yPos, size, size);  // Draw a filled oval at the current position
	 }
 
	 // Method to move the ball based on its current velocity (updates position)
	 public void move() {
		 xPos += xVelocity;   // Update x position by xVelocity
		 yPos += yVelocity;   // Update y position by yVelocity
	 }
 }
 