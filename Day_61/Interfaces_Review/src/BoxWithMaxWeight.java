import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{

    int capacity;
    int balance = 0;
    ArrayList<Item> list = new ArrayList<>();

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
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
    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            if((list.size() + item.getQty()) > capacity) {
                return;
            } else {
                list.add(item);
            }
        }
    }

    @Override
    public boolean isInBox(Item item) {
        int count = 0;
        for(Item t : list) {
            if(item.getProduct().equals(t.getProduct())) {
                count++;
            }
        }
        if(count > 0) {
            return true;
        } else {
            return false;
        }
    }

}
