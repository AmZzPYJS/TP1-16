public class Fraction extends Number implements Comparable<Fraction> {
    private int numerateur;
    private int denominateur;

    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction UN = new Fraction(1, 1);

    public Fraction(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public Fraction(int numerateur) {
        this(numerateur, 1);
    }

    public Fraction() {
        this(0, 1);
    }

    @Override
    public String toString() {
        return numerateur + "/" + denominateur;
    }

    public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }

    public double doubleValue() {
        return (double) numerateur / denominateur;
    }

    public Fraction add(Fraction other) {
        int num = this.numerateur * other.denominateur
                + other.numerateur * this.denominateur;

        int den = this.denominateur * other.denominateur;

        return new Fraction(num, den);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Fraction other = (Fraction) obj;

        return this.numerateur * other.denominateur ==
                other.numerateur * this.denominateur;
    }

    @Override
    public int compareTo(Fraction other) {
        int left = this.numerateur * other.denominateur;
        int right = other.numerateur * this.denominateur;
        return Integer.compare(left, right);}

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

}