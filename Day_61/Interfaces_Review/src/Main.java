import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ABC Part1 Creating Classes
        System.out.println("ABC Part1 Creating Classes.................");
        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();

        //ABC Part2 Class Inheritance
        System.out.println("\nABC Part2 Class Inheritance.............");
        c = new C();

        c.a();
        c.b();
        c.c();

        //Person and subclasses part1
        System.out.println("\nPerson and subclasses part1.............");
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);

        //Person and subclasses part2
        System.out.println("\nPerson and subclasses part2............");
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits "+ ollie.credits());

        //Person and subclasses part3
        System.out.println("\nPerson and subclasses part3............");
        ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        ollie.study();
        System.out.println(ollie);

        //Person and subclasses part4
        System.out.println("\nPerson and subclasses part4............");
        ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada);
        System.out.println(esko);

        ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
            ollie.study();
            i = i + 1;
        }
        System.out.println(ollie);

        //Person and subclasses part5
        System.out.println("\nPerson and subclasses part5............");
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
        printPersons(persons);

        //Warehousing part1
        System.out.println("\nWarehousing part1..................");
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0, 0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        System.out.println(juice);           // balance = 988.7, space left 11.3

        //Warehouse part2
        System.out.println("\nWarehousing part2..................");
        juice = new ProductWarehouse("Juice", 1000.0, 0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);           // Juice: balance = 989.7, space left 10.299999999999955

        //Warehouse part5
        System.out.println("\nWarehousing part5..................");
        // the usual:
        ProductWarehouseWithHistory newJuice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        newJuice.takeFromWarehouse(11.3);
        System.out.println(newJuice.getName()); // Juice
        newJuice.addToWarehouse(1.0);
        System.out.println(newJuice);           // Juice: balance = 989.7, space left 10.3

        // etc

        // however, history() still doesn't work properly:
        System.out.println(newJuice.history()); // [1000.0]
        // so we only get the initial state of the history set by the constructor...

        //Warehouse part6
        System.out.println("\nWarehousing part6..................");
        // the usual:
        ProductWarehouseWithHistory juice3 = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice3.takeFromWarehouse(11.3);
        System.out.println(juice3.getName()); // Juice
        juice3.addToWarehouse(1.0);
        System.out.println(juice3);           // Juice: balance = 989.7, space left 10.3

        // and now we have the history:
        System.out.println(juice3.history()); // [1000.0, 988.7, 989.7]

        //Warehouse part7
        System.out.println("\nWarehousing part7..................");
        ProductWarehouseWithHistory juice4 = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice4.takeFromWarehouse(11.3);
        juice4.addToWarehouse(1.0);
        //System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        juice4.printAnalysis();

        //Different kinds of boxes part2
        System.out.println("\nDifferent kinds of boxes part2.....................");
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));

        //Different kinds of boxes part3
        System.out.println("\nDifferent kinds of boxes part3.....................");
        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 1));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
    }

    public static void printPersons(ArrayList<Person> persons) {
        for(Person p : persons) {
            System.out.println(p.toString());
        }
    }
}
