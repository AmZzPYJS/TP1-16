public class Fraction {
    private int numerateur;
    private int denominateur;

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

    public String toString() {
        return numerateur + "/" + denominateur;
    }
}
