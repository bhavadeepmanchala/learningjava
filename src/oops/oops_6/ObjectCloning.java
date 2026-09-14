package oops.oops_6;

public class ObjectCloning {
    public static void main(String[] args) throws CloneNotSupportedException{

        Human Deep = new Human(19,"Bhavdeep");
        Human Twin = (Human)Deep.clone();
        System.out.println(Twin.age + " " + Twin.name);

    }
}

class Human implements Cloneable {
 int age;
 String name;
 int [] arr;

 public Human(int age, String name){
     this.age = age;
     this.name = name;;
 }

 public Object clone() throws CloneNotSupportedException{
     return super.clone();
 }
}
