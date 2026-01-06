abstract class Payment
{   
    abstract void makePayment();
    abstract void getRefund();
}
class CreditCardPayment extends Payment
{
    void makePayment()
    {
        System.out.println("Payment made using Credit Card");
    }
    void getRefund()
    {
        System.out.println("Refund processed to Credit Card");
    }
}
class PaymentAbs
{
    public static void main(String args[])
    {
        Payment obj = new CreditCardPayment();
        obj.makePayment();
        obj.getRefund();
    }
}