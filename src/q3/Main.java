package q3;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 5, 3);
        System.out.println("Posição inicial " + point);

        point.moveUp();
        System.out.println("Após moveUp: " + point);

        point.moveDown();
        System.out.println("Após moveDown: " + point);

        point.moveLeft();
        System.out.println("Após moveLeft: " + point);

        point.moveRight();
        System.out.println("Após moveRight: " + point);
    }
}
