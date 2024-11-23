package q6;

class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    public void greets(BigDog another) {
        System.out.println("Wooooooooof");
    }
}
