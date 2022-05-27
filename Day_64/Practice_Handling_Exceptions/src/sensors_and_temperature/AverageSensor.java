package sensors_and_temperature;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{

    boolean on = false;
    ArrayList<Sensor> sensors = new ArrayList<>();
    List<Integer> readings = new ArrayList<>();

    @Override
    public boolean isOn() {
        for(Sensor s : sensors) {
            if(s.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for(Sensor s : sensors) {
            s.setOn();
        }
        on = true;
    }

    @Override
    public void setOff() {
        for(Sensor s : sensors) {
            s.setOff();
        }
        on = false;
    }

    @Override
    public int read() {
        if(!on || sensors.isEmpty()) {
            throw new IllegalStateException("Average sensor must be on and have sensors added to list.");
        }
        int reading = (int)sensors.stream().mapToInt(s -> s.read()).average().getAsDouble();
        readings.add(reading);
        return reading;
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return readings;
    }
}
