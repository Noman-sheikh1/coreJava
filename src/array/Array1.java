package array;

public class Array1 {
    public static void main(String[] args){
        int[] arr=new int[5];
        arr[0]=2;
        arr[1]=3;
        arr[2]=4;
        arr[3]=5;
        arr[4]=6;
        for(int it:arr){
            System.out.print(it+" ");
        }
        //updating an element of array
        arr[2]=54;
        System.out.println();
        System.out.println("array after modification is:");

        for(int it:arr){
            System.out.print(it+" ");
        }
        System.out.println();
        System.out.println("length of arr is:"+arr.length);
    }
}
