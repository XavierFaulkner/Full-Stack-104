package sensors_and_temperature;

public class StandardSensor implements Sensor{

    int number;
    boolean on;

    public StandardSensor(int num) {
        number = num;
        on = true;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setOn() {
        on = true;
    }

    @Override
    public void setOff() {
        on = true;
    }

    @Override
    public int read() {
        return number;
    }
}
