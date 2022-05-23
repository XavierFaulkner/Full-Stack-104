public class Item {

    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product) {
        this.product = product;
        qty = 1;
    }

    public Item(String product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return qty*unitPrice;
    }

    public void increaseQuantity() {
        qty++;
    }

    public int getQty() {
        return qty;
    }

    public String getProduct() {
        return product;
    }

    public String toString() {
        return product + ": " + qty;
    }

    public boolean equals(Item t) {
        if(this == t) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}