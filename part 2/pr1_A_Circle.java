public class pr1_A_Circle{
    private double rad;

    // initialize the radius
    public pr1_A_Circle() 
    {
        rad = 10;
    }

    // parameterised constructor
    public pr1_A_Circle(double rad) 
    {
        this.rad = rad;
    }

    // getter method  
    public double getArea()
    {
        return 3.14*rad*rad;
    }

    // setter method
    public double getPerimeter()
    {
        return 2*3.14*rad;
    }
}
