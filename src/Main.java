public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 4);
        assert f1.toString().equals("3/4");

        Fraction f2 = new Fraction(5);
        assert f2.toString().equals("5/1");

        Fraction f3 = new Fraction();
        assert f3.toString().equals("0/1");

        assert Fraction.ZERO.toString().equals("0/1");
        assert Fraction.UN.toString().equals("1/1");

        Fraction f = new Fraction(3, 4);
        assert f.getNumerateur() == 3;
        assert f.getDenominateur() == 4;
    }
}