package oops.oops_1;

public class Demo {
    public static void main(String[] args) {
        Students ob = new Students();
        System.out.println(ob.name);
        Students ib = new Students(11,23,34);
        System.out.println(ib.name);
        Students er = new Students();
        System.out.println(er.name);
    }
}
class Students{
    int name;
    int add ;
    int city;

    Students(){
      name = 103;
      add =19;
      city = 56;
    }
    Students(int nae , int adds , int dcity){
      name = nae;
      add = adds;
      city = dcity;
    }

}
