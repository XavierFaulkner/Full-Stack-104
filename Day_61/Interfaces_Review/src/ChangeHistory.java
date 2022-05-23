import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ChangeHistory {

    ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    @Override
    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if(history.size() == 0 || history.isEmpty()) {
            return 0;
        } else {
            double max = Collections.max(history);
            return max;
        }
    }

    public double minValue() {
        if(history.size() == 0 || history.isEmpty()) {
            return 0;
        } else {
            double min = Collections.min(history);
            return min;
        }
    }

    public double average() {
        if(history.size() == 0 || history.isEmpty()) {
            return 0;
        } else  {
            double sum = 0;
            for(Double d : history) {
                sum += d;
            }
            return sum/history.size();
        }
    }

}
