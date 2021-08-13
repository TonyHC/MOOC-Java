
public class MainProgram {

    public static void main(String[] args) {
        Product oatmeal = new Product("Oatmeal");
        Product wine = new Product("Red wine", "Alcohol Section");
        Product eggs = new Product("Eggs", 2);
        
        System.out.println(oatmeal);
        System.out.println(wine);
        System.out.println(eggs);
    }
}
