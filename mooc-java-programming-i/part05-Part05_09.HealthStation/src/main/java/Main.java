
public class Main {

    public static void main(String[] args) {
        HealthStation childrensHospital = new HealthStation();
        
        Person mark = new Person("Mark", 12, 105, 29);
        Person thomas = new Person("Thomas", 41, 192, 59);
        
        System.out.println("Weighings performed: " + childrensHospital.weighings());
        
        System.out.println(mark.getName() + " weight: " + childrensHospital.weigh(mark) + " kilos");
        System.out.println(thomas.getName() + " weight: " + childrensHospital.weigh(thomas) + " kilos");
        
        System.out.println("Weighings performed: " + childrensHospital.weighings());
        
        childrensHospital.feed(mark);
        childrensHospital.feed(mark);
        
        System.out.println(mark.getName() + " weight: " + childrensHospital.weigh(mark) + " kilos");
        System.out.println(thomas.getName() + " weight: " + childrensHospital.weigh(thomas) + " kilos");
        
        System.out.println("Weighings performed: " + childrensHospital.weighings());
    }
}
