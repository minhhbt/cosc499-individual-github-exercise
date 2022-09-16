//Feature 1 - Multiply two input integers
import static org.junit.Assert.assertEquals;
import java.util.*;
import org.junit.Test;

public class feature2 {
    public static void main(String args[]) {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter second integer: ");
        int b = sc1.nextInt();

        System.out.println("The product of these two integers is: " + (a * b));
    } 

    public static int getProduct(int a, int b) {
        return a * b;
    }

    @Test
    public void testGetProduct(){
        assertEquals(20, getProduct(4,5));
    }
}