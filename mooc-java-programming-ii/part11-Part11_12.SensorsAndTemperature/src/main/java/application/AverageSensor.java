package application;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class AverageSensor implements Sensor{

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    public List<Integer> readings() {
        return readings;
    }

    @Override
    public boolean isOn() {
        int activeSensors = (int) this.sensors.stream()
                                .filter(sensor -> sensor.isOn())
                                .count();
        if (activeSensors == this.sensors.size()) {
            return true;
        }
        return false;
    }

    @Override
    public void setOn() {
        this.sensors.stream().forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        this.sensors.stream().forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        if (isOn()) {
            int sum = this.sensors.stream()
                        .mapToInt(Sensor::read)
                        .sum();
            int average = (int) sum / this.sensors.size();
            this.readings.add(average);
            return average;
        }
        throw new IllegalStateException("All sensors must be on to read the sensor average");
    }

}
