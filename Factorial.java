public class Factorial
{
    public static void main (String[]args)
    {
        int fact=1, f, j;
        if(args.length>0)
        {
            j=Integer.parseInt(args[0]);
            f=1;
            while(f<=j)
        {
            fact=fact*f;
            f=f+1;
        }
            System.out.println("");
            System.out.println("The Factorial of "+j+" is "+fact);
            System.out.println("");
        // }
        // else
        // {
        //     System.out.println("");
        //     System.out.println("Please Enter the Number: ");
        //     System.out.println("");
        }
    }
}