public class Student extends Person{
    int credits = 0;

    public Student(String name, String address) {
        super(name, address);
    }

    public int credits() {
        return credits;
    }

    public void study() {
        credits++;
    }

    public void getName() {
        System.out.println(this.name);
    }

    @Override
    public String toString() {
        return name + "\n" + "   " + address + "\n   Study credits " + credits;
    }

}
