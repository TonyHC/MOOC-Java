
public class Program {
    public static void main(String[] args) {
        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(5));

        AnotherMagicSquare anotherMagicSquare = new AnotherMagicSquare();
        System.out.println(anotherMagicSquare.arrayAsString(anotherMagicSquare.createMagicSquare(5)));
    }
}
