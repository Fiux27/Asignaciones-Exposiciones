
import java.util.*;
  
public class reversingArray {
  
    // function reverses the elements of the array
    static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
  
    public static void main(String[] args)
    {
        Integer [] arr = {12, 23, 34, 45, 56};
        reverse(arr);
    }
}