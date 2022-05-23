import java.util.ArrayList;

public class OneItemBox extends Box{

    int capacity;
    int balance = 0;
    ArrayList<Item> list = new ArrayList<>();

    public OneItemBox() {
        capacity = 1;
    }

    @Override
    public void add(Item item) {
        if((balance + item.getQty()) > capacity) {
            return;
        } else {
            list.add(item);
            balance += item.getQty();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        int c = 0;
        for(Item t : list) {
            if(item.getProduct().equals(t.getProduct())) {
                c++;
            }
        }
        if(c > 0) {
            return true;
        } else {
            return false;
        }
    }
}
