public class Main {
    public static void main(String[] args) {
        //Herds part1
        System.out.println("\nHerds part1");
        Organism organism = new Organism(20, 30);
        System.out.println(organism);
        organism.move(-10, 5);
        System.out.println(organism);
        organism.move(50, 20);
        System.out.println(organism);

        //Herds part2
        System.out.println("\nHerds part2");
        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        System.out.println(herd);

        //Animals part2
        System.out.println("\nAnimals part2");
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.bark();

        //Animals part3
        System.out.println("\nAnimals part3");
        Cat cat = new Cat();
        cat.purr();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.purr();

        //Animals part4
        System.out.println("\nAnimals part4");
        NoiseCapable dog2 = new Dog();
        dog2.makeNoise();

        NoiseCapable cat2 = new Cat("Garfield");
        cat2.makeNoise();
        Cat c = (Cat) cat2;
        c.purr();
    }
}
