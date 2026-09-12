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

        assert f1.doubleValue() == 0.75;
        assert f2.doubleValue() == 5.0;
        assert f3.doubleValue() == 0.0;

        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 3);
        Fraction sum = a.add(b);
        assert sum.getNumerateur() == 5 && sum.getDenominateur() == 6;

        Fraction c1 = new Fraction(1, 2);
        Fraction c2 = new Fraction(2, 4);
        assert c1.equals(c2);

        Fraction c3 = new Fraction(1, 3);
        assert !c1.equals(c3);

        Fraction d1 = new Fraction(1, 2);
        Fraction d2 = new Fraction(2, 3);
        assert d1.compareTo(d2) < 0;   // 1/2 < 2/3
        assert d2.compareTo(d1) > 0;   // 2/3 > 1/2
        assert d1.compareTo(d1) == 0;  // égal à lui-même

        Number aNumber = java.math.BigDecimal.ONE;
        Number anotherNumber = new Fraction(1, 2);
        assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;
    }


}