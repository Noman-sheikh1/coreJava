package array;

import java.util.Scanner;

public class TakeArrayInputAtRuntime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        System.out.println("enter the element of array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
