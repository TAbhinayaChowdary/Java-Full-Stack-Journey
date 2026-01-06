abstract class Shape
{
    abstract void area();
}
class Rectangle extends Shape
{
    int len, bre;
    Rectangle(int len, int bre)
    {
        this.len = len;
        this.bre = bre;
    }
    void area()
    {
        System.out.println("Area of Rectangle: " + (len * bre));
    }
}
class Circle extends Shape
{
    int rad;
    Circle(int rad)
    {
        this.rad = rad;
    }
    void area()
    {
        System.out.println("Area of Circle: " + (3.14 * rad * rad));
    }
}
class ShapeAbstraction
{
    public static void main(String args[])
    {
        Shape shape1 = new Rectangle(5, 10);
        shape1.area();
        Shape shape2 = new Circle(7);
        shape2.area();
    }
}
