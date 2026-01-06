class AddMethodOverload
{
    int a, b, c;
    AddMethodOverload(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    AddMethodOverload(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
class AddOverload
{

    public static void main(String args[])
    {
        AddMethodOverload obj1 = new AddMethodOverload(5, 10);
        AddMethodOverload obj2 = new AddMethodOverload(5, 10, 15);
        int sum1 = obj1.a + obj1.b;
        int sum2 = obj2.a + obj2.b + obj2.c;
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
    }
}
