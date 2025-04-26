abstract class Shape {
    int a,b;
    abstract void printArea();
}
class Rectangle extends Shape
{
    int a,b;
    Rectangle(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    void printArea()
    {
        int result=a*b;
        System.out.println("Ans is : "+result);
    }
}
class Triangle extends Shape
{
    int a,b;
    Triangle(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    void printArea()
    {
        double result=0.5*a*b;
        System.out.println("Ans is : "+result);
    }
}
class Circle extends Shape
{
    int a;
    Circle(int a)
    {
        this.a=a;
    }
    void printArea()
    {
        double result=(double)3.1416*a*a;
        System.out.println("Ans is : "+result);
    }
}
class ThreadDemo{
    public static void main(String[] args) {
        Rectangle r=new Rectangle(4,5);
        Triangle t=new Triangle(6,6);
        Circle c=new Circle(5);
        r.printArea();
        t.printArea();
        c.printArea();
    }
}

