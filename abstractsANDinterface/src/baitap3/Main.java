package baitap3;

public class Main {
    public static void main(String[] args) {
        MovavlePiont movavlePiont = new MovavlePiont(1,2,3,4);
        System.out.println(movavlePiont.toString());
        movavlePiont.moveUp();
        movavlePiont.moveDown();
        movavlePiont.moveLeft();
        movavlePiont.moveRight();
    }
}
