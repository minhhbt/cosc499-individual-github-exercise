//Feature 1 - Sort an array in alphabetical order
import java.util.Arrays;  
import java.util.Scanner;
import java.util.*;

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
                
        //Arrays.sort(str); //Sort in ascending order
        Arrays.sort(str,Collections.reverseOrder()); //Sort in descending order
        System.out.println(Arrays.toString(str)); 
    } 
}
