class Overload
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int add(int a, int b, int c)
    {
        return a+b+c;
    }
}
class OverloadAdd
{
    public static void main(String aregs[])
    {
        Overload obj = new Overload();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
    }
}