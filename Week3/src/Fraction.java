public class Fraction {
    private int numerator, denominator = 1;

    public Fraction(int numerator, int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
        this.numerator = numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getNumerator() {
        return numerator;
    }
    public void setDenominator(int denominator) {
        if (denominator != 0) this.denominator = denominator;
    }
    public int getDenominator() {
        return denominator;
    }
    public int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a%b);
    }
    public Fraction reduce() {
        int UCLN = gcd(this.numerator, this.denominator);
        this.numerator = this.numerator/UCLN;
        this.denominator = this.denominator/UCLN;
        return this;
    }
    public Fraction add(Fraction a) {
        this.numerator = this.denominator*a.numerator + this.numerator*a.denominator;
        this.denominator = this.denominator*a.denominator;
        return this.reduce();
    }
    public Fraction subtract(Fraction a) {
        this.numerator = this.numerator*a.denominator - this.denominator*a.numerator;
        this.denominator = this.denominator*a.denominator;
        return this.reduce();
    }
    public Fraction multiply(Fraction a) {
        this.numerator = this.numerator * a.numerator;
        this.denominator = this.denominator * a.denominator;
        return this.reduce();
    }
    public Fraction divide(Fraction a) {
        if (a.numerator != 0 && a.denominator != 0) {
            this.numerator = this.numerator*a.denominator;
            this.denominator = this.denominator*a.numerator;
            return this.reduce();
        }
        else return this.reduce();
    }
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            this.reduce();
            other.reduce();
            if ((this.numerator == other.numerator) && (this.denominator == other.denominator)) return true;
            else return false;
        }
        else return false;
    }

    public static void main(String[] args) {
        Fraction s1 = new Fraction(1, 2);
        Fraction s2 = new Fraction(1, 2);
        s1.divide(s2);
        System.out.println(s1.getNumerator()+" "+s1.getDenominator());

    }
}
