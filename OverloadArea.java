class Overload
{
    public double area(double radius)
    {
        return 3.14*radius*radius;
    }
    
    public double area(double length, double breadth)
    {
        return length*breadth;
    }

    public double area(double base, double height, int type)
    {
        return 0.5*base*height;
    }
}
class OverloadArea
{
    public static void main(String aregs[])
    {
        Overload obj = new Overload();
        System.out.println(obj.area(10));
        System.out.println(obj.area(10, 20));
        System.out.println(obj.area(10, 20, 30));
    }
}