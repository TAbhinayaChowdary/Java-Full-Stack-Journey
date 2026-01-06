class ArrayIndexOut
{
    public static void main(String args[])
    {
        int arr[] = {2, 4, 6, 8, 10};
        try
        {
            System.out.println(arr[10]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
