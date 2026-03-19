package WrapperClass;

import java.util.ArrayList;

class CoreJava {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(25);   // autoboxing
        list.add(50);

        int x = list.get(0); // unboxing
        System.out.println(x);
    }
}