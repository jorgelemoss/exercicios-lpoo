package q6;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias
        Animal cat = new Cat("Kitty");
        Dog dog = new Dog("Buddy");
        BigDog bigDog1 = new BigDog("Max");
        BigDog bigDog2 = new BigDog("Rex");

        // Demonstrando polimorfismo
        System.out.println("Cat greets:");
        cat.greets();

        System.out.println("\nDog greets:");
        dog.greets();

        System.out.println("\nBigDog greets:");
        bigDog1.greets();

        System.out.println("\nDog greets another Dog:");
        dog.greets(new Dog("Charlie"));

        System.out.println("\nBigDog greets a Dog:");
        bigDog1.greets(dog);

        System.out.println("\nBigDog greets another BigDog:");
        bigDog1.greets(bigDog2);
    }
}
