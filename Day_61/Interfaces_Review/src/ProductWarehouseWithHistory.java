public class ProductWarehouseWithHistory extends ProductWarehouse{

    ChangeHistory history = new ChangeHistory();

    ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity, initialBalance);
        history.add(initialBalance);
    }

    public String history() {
        return history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        if(amount < 0) {
            history.add(getBalance());
            return;
        } else if((amount + getBalance()) > getCapacity()) {
            setBalance(getCapacity());
            history.add(getBalance());
        } else {
            setBalance(getBalance() + amount);
            history.add(getBalance());
        }
    }

    @Override
    public double takeFromWarehouse(double amount) {
        if(amount < 0) {
            setBalance(0);
            history.add(getBalance());
            return 0;
        } else if((getBalance() - amount) < 0) {
            setBalance(0);
            history.add(getBalance());
            return 0;
        } else {
            setBalance(getBalance() - amount);
            history.add(getBalance());
            return getBalance();
        }
    }

    public void printAnalysis() {
        System.out.println(
                "Product: " + getName() +
                "\nHistory: " + history.toString() +
                "\nLargest amount of product: " + history.maxValue() +
                "\nSmallest amount of product: " + history.minValue() +
                "\nAverage: " + history.average()
        );
    }

}
