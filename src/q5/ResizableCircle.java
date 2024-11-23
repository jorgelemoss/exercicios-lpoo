package q5;

class ResizableCircle extends Circle {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle[Circle[radius=" + this.radius + "]]";
    }

    public void resize(int percent) {
        this.radius *= percent / 100.0;
    }
}
