package application;

public class Program {

    public static void main(String[] args) {
        Sensor a = new TemperatureSensor();
        Sensor b = new TemperatureSensor();
        
        AverageSensor seminoleCity = new AverageSensor();
        seminoleCity.addSensor(a);
        seminoleCity.addSensor(b);
        
        seminoleCity.setOn();
        System.out.println(seminoleCity.read());
        System.out.println(seminoleCity.read());
        
        System.out.println(seminoleCity.readings());
    }
}
