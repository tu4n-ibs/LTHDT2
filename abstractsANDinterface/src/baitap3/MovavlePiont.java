package baitap3;

public class MovavlePiont implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovavlePiont(int x, int y, int xSpped, int xSpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpped;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "),"
                + " speed= " + "(" + xSpeed + ","+ ySpeed + ")";
    }
    @Override
    public void moveUp(){
        y -= ySpeed;
    }
    @Override
    public void moveDown(){
        y += ySpeed;
    }
    @Override
    public void moveLeft(){
        x -= xSpeed;
    }
    @Override
    public void moveRight(){
        x += xSpeed;
    }
}
