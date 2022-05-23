public class Warehouse {

    private double capacity;
    private double balance;

    public Warehouse(double capacity, double balance) {
        if(capacity <= 0) {
            this.capacity = 0;
        } else {
            this.capacity = capacity;
        }

        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCapacity() {
        return capacity;
    }

    public double howMuchSpaceLeft() {
        return capacity-balance;
    }

    public void addToWarehouse(double amount) {
        if(amount < 0) {
            return;
        } else if((amount + balance) > capacity) {
             balance = capacity;
        } else {
            balance += amount;
        }
    }

    public double takeFromWarehouse(double amount) {
        if(amount < 0) {
            balance = 0;
            return 0;
        } else if((balance - amount) < 0) {
            balance = 0;
            return 0;
        } else {
            balance -= amount;
            return balance;
        }
    }

    @Override
    public String toString() {
        return "balance = " + balance + ", space left " + howMuchSpaceLeft();
    }

}
