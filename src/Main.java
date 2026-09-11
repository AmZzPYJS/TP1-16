public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 4);
        assert f1.toString().equals("3/4");

        Fraction f2 = new Fraction(5);
        assert f2.toString().equals("5/1");

        Fraction f3 = new Fraction();
        assert f3.toString().equals("0/1");
    }
}
