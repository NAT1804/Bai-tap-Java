public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getNumerator() {
        return numerator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public int getDenominator() {
        return denominator;
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a%b);
    }
    public Fraction reduce(Fraction a) {
        int UCLN = gcd(a.numerator, a.denominator);
        a.numerator = a.numerator/UCLN;
        a.denominator = a.denominator/UCLN;
        return a;
    }
    public Fraction add(Fraction a) {

    }
    public Fraction subtract(Fraction a) {

    }
    public Fraction multiply(Fraction a) {

    }
    public Fraction devide(Fraction a) {

    }
    public static void main(String[] args) {
        Fraction s1 = new Fraction();
        s1.setNumerator(4);
        s1.setDenominator(8);
        s1 = s1.reduce(s1);
        System.err.println(s1.getNumerator());
        System.err.println(s1.getDenominator());
    }
}
