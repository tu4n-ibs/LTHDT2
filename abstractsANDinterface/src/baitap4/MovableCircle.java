package baitap4;

import baitap3.Movable;
import baitap3.MovavlePiont;

public class MovableCircle extends MovavlePiont implements Movable {
    private int radius;
   private MovavlePiont center;

    public MovableCircle(int x , int y, int xSpeed, int ySpeed, int radius) {
        super(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    @Override
    public String toString(){
        return super.toString()
                + ","
                + " radius: "
                + radius;
    }
    @Override
    public void moveUp(){}
    @Override
    public void moveDown(){}
    @Override
    public void moveLeft(){}
    @Override
    public void moveRight(){}

}
