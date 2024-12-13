import java.awt.*;

public class Paddle {

	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int velocity;

	public Paddle (int xPos, int yPos, int width, int height) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
		this.velocity = 1;
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
		velocity *=-2;
	}



	public void draw (Graphics g) {
		g.setColor(Color.red);
		g.drawRect(xPos, yPos, width, height);
	}


	public void move() {
		xPos += velocity;
		if(velocity > 0) {
			velocity --;
		}
		if(velocity < 0) {
			velocity ++;
		}
	}

	
	public void addVelocity(int add) {
		velocity += add;
	}

	

}
