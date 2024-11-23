package q5;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle: " + circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        ResizableCircle resizableCircle = new ResizableCircle(5.0);
        System.out.println("\nResizableCircle (antes do resize): " + resizableCircle);
        resizableCircle.resize(50);
        System.out.println("ResizableCircle (após 50% resize): " + resizableCircle);
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
    }
}
