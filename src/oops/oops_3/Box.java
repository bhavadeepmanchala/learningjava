package oops.oops_3;

public class Box {
    int length ;
    int breadth ;
    int width ;
    // let's consider different types constructor
    Box(){
        this.length = -1;
        this.breadth = -2;
        this.width = -3;
    }
    Box(int side){
        this.length = side;
        this.breadth = side;
        this.width = side;
    }
    Box(int l, int b, int w){
        this.length = l;
        this.breadth = b;
        this.width = w;
    }
}
