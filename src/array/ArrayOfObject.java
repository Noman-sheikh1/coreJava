package array;
 class   Student{
    int  age;
    String name;
     Student(String name,int age){
         this.name=name;
         this.age=age;
     }
 };
public class ArrayOfObject {
    public static void main(String[] args){
        Student[] st=new Student[3];
        st[0]= new Student("rahul",21);
        st[1]= new Student("raj",32);
        st[2]=new Student("PRIYA",22);

        for(Student it:st){
            System.out.println(it.name+" "+ it.age);
        }
    }
}
