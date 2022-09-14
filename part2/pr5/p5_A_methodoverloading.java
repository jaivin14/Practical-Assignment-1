// this code is supporting class file of pr5_A

public class p5_A_methodoverloading {
    // here are two methods one with two args and another with only one args.
    public void Area(float radius){
        System.out.println("Area of this circle : "+3.14*radius*radius);
    }
    public void Area(float length,float width){
        System.out.println("Area of this rectangle : "+length*width);
    }
}