package oops.oops_3;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(2 , 4, 5);
        Box box2 = new Box();
        System.out.println(box1.width + " " + box2.length);

        BoxWeight Box3 = new BoxWeight();
        BoxWeight Box4 = new BoxWeight(2, 4, 5, 7);
        System.out.println(Box3.breadth + " " + Box4.weight);

        Box box5 = new BoxWeight(2, 3, 9, 80);
        System.out.println(box5.length);// will print without error
        //System.out.println(box5.weight);// error (why?)->
        /* here parent class is reference and a constructor from child class
        we can access members from parent but not members from child class
        -----Upcasting (child → parent reference): always allowed, automatic,
         but you lose access to the child's extra members.--------
         */
//        BoxWeight box6 = new Box(2, 3, 4);
//        System.out.println(Box6.length);
        /*
        ------DownCasting (parent → child reference): needs an explicit cast,
        and only succeeds if the object actually is an instance of the child class underneath.-------
         */
    }
}
