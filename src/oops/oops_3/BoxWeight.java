package oops.oops_3;

public class BoxWeight extends Box{
    int weight ;
    public BoxWeight (){
        this.weight = -1;
    }
   public BoxWeight (int l, int b, int w, int weight ){
        super(l, b, w);
        this.weight = weight;
    }

}
