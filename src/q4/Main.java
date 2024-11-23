package q4;

public class Main {
    public static void main(String[] args) {
        // Testando MovablePoint
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println("Ponto inicial " + point);
        point.moveRight();
        System.out.println("Após moveRight: " + point);
        point.moveUp();
        System.out.println("Após moveUp: " + point);

        // Testando MovableCircle
        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 5);
        System.out.println("\nCírculo inicial: " + circle);
        circle.moveLeft();
        System.out.println("Após moveLeft: " + circle);
        circle.moveDown();
        System.out.println("Após moveDown: " + circle);
    }
}
