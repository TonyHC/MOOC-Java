package application;

public class StandardSensor implements Sensor {
    private int value;
    
    public StandardSensor(int value) {
        this.value = value;
    }
    
    @Override
    public int read() {
        return value;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {
        
    }
}
