package Operator;

public class Assignment {
    public static void main(String[] args){

        int n = 10;
        n += 5;
        System.out.println("After += : " + n);
        n *= 2;
        System.out.println("After *= : " + n);
        n -= 5;
        System.out.println("After -= : " + n);
        n /= 2;
        System.out.println("After /= : " + n);
        n %= 3;
        System.out.println("After %= : " + n);
    }
}
