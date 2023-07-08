
/**
 * This is a Abstract Data Type created for operations of the Fractions 
 * @author LahiruCW
 * @version 1.0
 */
public class ADTFraction {

    private int n;  //numerator
    private int d;  //denomenator

    //---------------------------------------------------
    public ADTFraction() {//default constructor
        //default values are considered as the 0 for numerator and 1 for denominator
        this(0, 1);
    }

    //---------------------------------------------------
    public ADTFraction(int a, int b) {//parameter constructor
        set(a, b);
    }

    //---------------------------------------------------
    public void set(int a, int b) {//set numerator and denomenator
        if(b == 0){
            throw new IllegalArgumentException("Invalid Denominator!, Denominator can not be zero!");
        }
        int gcd = gcd(a,b);
        this.n = a / gcd;
        this.d = b / gcd;
    }

    //-----------------------------------------------------
    //here is the additional getters to get the numerator and denominator
    //These are not included in the given code structure
    public int getNumerator() {
        return n;
    }

    public int getDenominator() {
        return d;
    }

    //---------------------------------------------------
    public ADTFraction plus(ADTFraction x) {//add two fractions
        int numeratorSum = n * x.getDenominator() + x.getNumerator() * d;
        int denominatorSum = d * x.getDenominator();
        return new ADTFraction(numeratorSum, denominatorSum);
    }

    //---------------------------------------------------
    public ADTFraction times(int a) {//multiply fraction by a number
        return new ADTFraction(a*n,d);
    }

    //---------------------------------------------------
    public ADTFraction times(ADTFraction x) {//multiply two fractions
        return new ADTFraction(n * x.getNumerator(), d*x.getDenominator());
    }

    //---------------------------------------------------
    public ADTFraction reciprocal() {//reciprocal of a fraction
        return new ADTFraction(d,n);
    }

    //---------------------------------------------------
    public float value() {//numerical value of a fraction
        return (float) n/d;
    }

    //---------------------------------------------------
    public void display() {//display the fraction in the format n/d
        System.out.println(n+"/"+d);
    }
    
    //---------------------------------------------------
    
    private int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
}
