package oops.oops_4;

public class ObjectDemo {
    int num ;
    float gpa ;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;

    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(12, 56.43f);
        ObjectDemo obj2 = new ObjectDemo(12, 58.43f);
        if(obj1.equals(obj2)){
            System.out.println("obj1 is equal to obj2");
        }
        System.out.println(obj1.getClass().getName());
    }
}

