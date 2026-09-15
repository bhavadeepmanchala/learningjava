package oops.oops_6;

import java.util.Arrays;

public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Humanbeing Bhavadeep = new Humanbeing(19,"Bhavadeep");
        Humanbeing Twin = (Humanbeing) Bhavadeep.clone();
        System.out.println(Arrays.toString(Twin.arr));
        Twin.arr[2] = 86;
        System.out.println(Arrays.toString(Twin.arr));
        System.out.println(Arrays.toString(Bhavadeep.arr));
    }
}
    class Humanbeing implements Cloneable {
    int age;
    String name;
    int [] arr;

    public Humanbeing(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int []{2,45,6,1,5};
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        Humanbeing twin = (Humanbeing)super.clone();
        twin.arr = new int[twin.arr.length];
        for(int i = 0; i<twin.arr.length; i++)
        {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
