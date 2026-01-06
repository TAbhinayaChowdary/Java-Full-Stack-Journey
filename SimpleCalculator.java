import java.util.*;

class SimpleCalculator
{
    public static void main()
    {
        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        //Reading 1st integer
        System.out.print("Enter 1st integer: ");
        a = sc.nextDouble();
        //Reading 2nd integer
        System.out.print("Enter 2nd integer: ");
        b = sc.nextDouble();
        //Selecting an operation
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Remainder");
        int choice;
        System.out.print("Enter your choice:");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1: System.out.println("Addition of "+ a +" and "+ b +" is: "+(a+b));
                    break;
            case 2: System.out.println("Substraction of "+ a +" and "+ b +" is: "+(a-b));
                    break;
            case 3: System.out.println("Multiplication of "+ a +" and "+ b +" is: "+(a*b));
                    break;
            case 4: System.out.println("Division of "+ a +" by "+ b +" is: "+ (a/b));
                    break;
            case 5: System.out.println("Remainder when "+ a +" is divided by "+ b +" : "+ (a%b));
                    break;
            default: System.out.println("Invalid Choice");
                    break;
            
        }
    }
}