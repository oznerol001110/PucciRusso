package GameLogic;

import java.awt.Rectangle;

import Component.Cell2D;

<<<<<<< HEAD
public class Bullet {
	protected Cell2D position;
	protected Cell2D grafic;
	protected int speed;
	boolean AliveBullet;
	
	
	public Bullet(int x, int y, int speed, boolean AliveBullet, int Dimx, int Dimy) {
		position = new Cell2D(x, y);
		grafic = new Cell2D(Dimx, Dimy);
		this.speed = speed;
		this.AliveBullet = AliveBullet;
	}
	
	public Cell2D getPosition() {
		return position;
	}

	public void setPosition(Cell2D position) {
		this.position = position;
	}

	public boolean isAliveBullet() {
		return AliveBullet;
	}

	public void setAliveBullet(boolean aliveBullet) {
		AliveBullet = aliveBullet;
	}

	public int getX() {
		return position.getX();
	}
=======
public class Bullet extends GameObject {
	boolean fire = false;

	public Bullet(int x, int y, int speed) {
		super(x, y, speed);
	}

	public boolean isFire() {
		return fire;
	}

	public void setFire(boolean fire) {
		this.fire = fire;
>>>>>>> d516257af9854926d7ba4eb980c16f01cfd18099

	}

	public void scroll() {
		// System.out.println(getX());
		this.position.setX(position.getX() + speed);

	}

	public void reset() {
		this.position.setX(0);
	}
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Rectangle getBoundsBullet() {
        return new Rectangle(getPosition().getX(), getPosition().getY(), getGrafic().getX(), getGrafic().getY());
    }

	public Cell2D getGrafic() {
		return grafic;
	}

	public void setGrafic(Cell2D grafic) {
		this.grafic = grafic;
	}

}
