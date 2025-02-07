package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean state; // On / Off state of the sensor - on = true;

    public TemperatureSensor() {
        this.state = false;
    }

    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void setOn() {
        this.state = true;
    }

    @Override
    public void setOff() {
        this.state = false;
    }

    @Override
    public int read() {
        if (this.state) {
            return new Random().nextInt(61) - 30;
        }
        throw new IllegalStateException("Sensor must be on to read its value");
    }

}
