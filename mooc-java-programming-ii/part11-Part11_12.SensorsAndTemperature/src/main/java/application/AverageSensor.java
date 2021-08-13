package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> sensorValues;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.sensorValues = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for(Sensor sensor : this.sensors) {
            if(!sensor.isOn())
                return false;
        }
        
        return true;
    }

    @Override
    public void setOn() {
        for(Sensor sensor : this.sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        Random rand = new Random();
        int randNum =  rand.nextInt(this.sensors.size());
        this.sensors.get(randNum).setOff();
    }

    @Override
    public int read() {
        if(this.sensors.isEmpty() || !isOn()) {
            throw new IllegalStateException();
        }
        
        int sum = 0;
        for(Sensor sensor : this.sensors) {
            sum += sensor.read();
        }
        
        int average = sum / sensors.size();
        
        this.sensorValues.add(average);
        
        return average;
    }
    
    public List<Integer> readings() {
        return sensorValues;
    }
}
