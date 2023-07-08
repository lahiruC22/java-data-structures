/**
 * This class represents a collection of long values without duplicates.
 * It provides methods to find, insert, delete and display the elements.
 * @author LahiruCW
 * @version 1.0
 */

public class NoDupArray {

    private long[] a;   //ref to array a
    private int nElems; //number of data items
    private int index;
    
    //--------------------------------------------------
    public NoDupArray(int max) {//constructor
        a = new long[max]; //construct new long array
        nElems = 0;
    }
    
    //--------------------------------------------------
    public boolean find(long searchKey) {//find specified value

        for (int index = 0; index < nElems; index++) {
            if (a[index] == searchKey) {
                this.index = index;
                return true;
            }
        }
        return false;
    }   // end find()

    //--------------------------------------------------
    public void insert(long value) {//put element into array

        //check whether the array is full
        if (nElems >= a.length) {
            throw new ArrayIndexOutOfBoundsException("Array bound is out!");
        } else {
            if(!find(value)){
                a[nElems] = value;
                nElems++;
            }
        }

    }   //end insert()
    //--------------------------------------------------

    public boolean delete(long value) {//delete the element if it found
        if(find(value)){ //if the value is found
            for(int j = index; j<nElems-1; j++){ //shift left all the values after the found value
                a[j] = a[j+1];
            }
            
            nElems--; //reduce the size
            return true;
        }
        
        return false;
    }   //end delete()
    //--------------------------------------------------

    public void display() {//display array contents
        for(int i=0; i<nElems;i++){
            System.out.print(a[i]+" ");
        }
        
    }   //end display ()
    //--------------------------------------------------

} //end class NoDupArray
