class DivisionByZero
{
    public static void main(String args[])
    {
        int a=10;
        int b=0;
        try
        {
            System.out.println("Output: "+ a/b);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}