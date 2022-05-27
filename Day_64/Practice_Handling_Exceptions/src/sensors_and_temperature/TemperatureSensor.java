package sensors_and_temperature;
import java.lang.Math;

public class TemperatureSensor implements Sensor{

    boolean on = false;

    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void setOn() {
        on = true;
    }

    @Override
    public void setOff() {
        on = false;
    }

    @Override
    public int read() {
        if(!on) {
            throw new IllegalStateException("Sensor must be on");
        }
        return (int)(Math.random() * (30 - (-30) + 1) + (-30));
    }
}
