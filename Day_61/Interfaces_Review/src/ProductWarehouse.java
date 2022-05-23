public class ProductWarehouse extends Warehouse{

    private String name;

    public ProductWarehouse(String productName, double capacity, double balance) {
        super(capacity, balance);
        name = productName;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    @Override
    public String toString() {
        return name + ": balance = " + this.getBalance() + ", space left " + this.howMuchSpaceLeft();
    }
}
