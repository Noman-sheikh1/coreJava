package array;
import java.util.Arrays;
import java.util.Arrays.*;

public class ArraysClassUtility {
    public static void main(String[] args){
        int[] arr={2,5,4,7,86,51,78};
        Arrays.sort(arr);
        for(int it:arr){
            System.out.print(it+" ");
        }
        System.out.println();
        //using binary search
        int key=86;
        int key2=22;
        System.out.println("to check in array key is persent or not if persent then index: "+Arrays.binarySearch(arr,key));
        System.out.println("to chck in Array key i persent or not if persent then index is:"+Arrays.binarySearch(arr,key2));

        //to comare to array
        int[] a={1,2,3};
        int[] b={4,6,7};
        System.out.println(Arrays.compare(a,b));

        //to copy
        int[] a1={2,3,56,75};
        int[] a2=Arrays.copyOf(a1,5);
        System.out.println(Arrays.toString(a2));

    }
}
