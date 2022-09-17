//Feature 1 - Sort an array in alphabetical order
import java.util.*;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class feature1 {
    public static void main(String args[]) {  
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
    
        int arraySize;    
        System.out.println("Enter the number of items: ");
        arraySize = sc.nextInt();                     
    
        String str[] = new String[arraySize]; 
        System.out.println("Enter each item: ");
        for(int i = 0; i < arraySize ;i++) {
            str[i] = sc1.nextLine();
        }

        sortArray(str);
        System.out.println("Hello world");
        
    }

    public static String[] sortArray(String[] preSortedArray){
        Arrays.sort(preSortedArray); //Sort in ascending order
        System.out.println(Arrays.toString(preSortedArray)); 
        return preSortedArray; 
    }

    @Test
    public void testSortArray(){
        assertArrayEquals(new String[]{"Banana","Cherry","Grape","Honeydew","Lemon"} , sortArray(new String[]{"Grape","Honeydew","Lemon","Cherry","Banana"}));
    }
}
