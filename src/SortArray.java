import java.util.Arrays;
import java.util.Collections;

public class SortArray {

    public static void main(String[] args){
        String[] myArray = {"cherry", "orange", "banana","bananb"};
        for (int i = 0; i < myArray.length; i++){
            Arrays.sort(myArray, Collections.reverseOrder());
            System.out.print(myArray[i]  + "\n" );
        }
    }

    public static void arraySort(String [] array){
        for(int i=0; i < array.length; i++){
            Arrays.sort(array, Collections.reverseOrder());
            System.out.println(array[i]);
        }
    }
}
