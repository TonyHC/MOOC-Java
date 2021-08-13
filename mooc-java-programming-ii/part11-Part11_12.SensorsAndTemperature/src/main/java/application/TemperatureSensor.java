
package application;

import java.util.Random;


public class TemperatureSensor implements Sensor {
    private int state;
    
    public TemperatureSensor() {
        this.state = 0;
    }
    
    @Override
    public boolean isOn() {
        if(this.state == 1) {
            return true;
        }
        
        return false;
    }

    @Override
    public void setOn() {
        this.state = 1;
    }

    @Override
    public void setOff() {
        this.state = 0;
    }

    @Override
    public int read() {
        if(!isOn()) {
            throw new IllegalStateException();
        }
        
        Random rand = new Random();
        return rand.nextInt(61) - 30;
    }
}
