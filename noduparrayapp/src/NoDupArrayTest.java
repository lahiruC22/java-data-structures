
/**
 * This class show case a way to use the NoDupArray data structure.
 * @author LahiruCW
 * @version 1.0
 */
public class NoDupArrayTest {

    public static void main(String[] args) {

        //create an instance of NoDupArray with a maximum capacity
        NoDupArray noDupArray = new NoDupArray(5);

        //insert elements into the array
        noDupArray.insert(10);
        noDupArray.insert(20);
        noDupArray.insert(30);

        System.out.println("After inserting 10, 20, and 30:");
        //Display the elements in the array
        noDupArray.display();

        //trying to find an element in the array
        boolean found = noDupArray.find(20);
        System.out.println("\nFound 20: " + found);

        //trying to delete an element
        boolean deleted = noDupArray.delete(10);
        System.out.println("Deleted 10: " + deleted);

        System.out.println("After deleting 10: ");
        //display the elements in the array
        noDupArray.display();

        //trying to find non existing element in the array
        found = noDupArray.find(40);
        System.out.println("\nFound 40: " + found);

        // Inserting more elements into the array to provoke ArrayIndexOutOfBoundsException
        noDupArray.insert(40);
        noDupArray.insert(50);
        noDupArray.insert(60); // This should throw an ArrayIndexOutOfBoundsException
    }
}
