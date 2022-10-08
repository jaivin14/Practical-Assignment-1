// Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

// Aim : 
// design a class named Circle containing following attributes and behavior.
// • Onedouble data field named radius. The default valueis1.
// • A no-argumentconstructor that creates a default circle.
// • A Single argument constructor that creates a Circle with the specified radius.
// • A method named getArea() that returns area of the Circle.
// • A method named getPerimeter() that returns perimeterof it.


class pr1_B_CircleMain {
    public static void main(String[] args) {
        
        // will call the default constructor and take the defualt values
        pr1_A_Circle c1 = new pr1_A_Circle();
        
        // it will call the parameterised constructor.
        pr1_A_Circle c2 = new pr1_A_Circle(15);

        // print the area and perimeter
        System.out.println("Area and Perimeter of Circle Object 1 is respectively : "+c1.getArea()+" and "+c1.getPerimeter());
        System.out.println("Area and Perimeter of Circle Object 2 is respectively : "+c2.getArea()+" and "+c2.getPerimeter());
    }
}
