class Overload
{
    public void stmt(int a)
    {
        System.out.println(a);
    }
    public void stmt(String a)
    {
        System.out.println(a);
    }
    public void stmt(int arr[])
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
class OverloadPrint
{
    public static void main(String aregs[])
    {
        Overload obj = new Overload();
        obj.stmt(10);
        obj.stmt("Hello");
        //int arr[] = {10,20,30,40,50};
        obj.stmt(new int[]{10,20,30,40,50});
    }
}