
/**
 *
 * @author LahiruCW
 */
public class ADTFractionApp {//use the class ADTFraction and its methods

    public static void main(String[] args) {
        // Create two fraction objects
        ADTFraction fraction1 = new ADTFraction(1, 2);
        ADTFraction fraction2 = new ADTFraction(2, 3);

        // Display the fractions
        System.out.print("Fraction 1: ");
        fraction1.display();
        System.out.print("Fraction 2: ");
        fraction2.display();

        // Add the fractions
        ADTFraction sum = fraction1.plus(fraction2);
        System.out.print("Sum: ");
        sum.display();

        // Multiply the fractions
        ADTFraction product = fraction1.times(fraction2);
        System.out.print("Product: ");
        product.display();

        // Multiply fraction1 by a number
        ADTFraction timesNumber = fraction1.times(2);
        System.out.print("Fraction 1 times 2: ");
        timesNumber.display();

        // Get the reciprocal of fraction1
        ADTFraction reciprocal = fraction1.reciprocal();
        System.out.print("Reciprocal of Fraction 1: ");
        reciprocal.display();

        // Get the value of fraction1
        float value = fraction1.value();
        System.out.println("Value of Fraction 1: " + value);
    }
}
