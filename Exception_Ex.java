public class Exception_Ex {

    public static void main(String[] args) {
        
        try
        {
            int a = args.length;
            System.out.println("a = "+a);
            int b = 42/a;
            int c[] = {1};
            c[42] = 99;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero: " + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bounds: " + e);
        }
        catch(Exception e)
        {
            System.out.println("General exception: " + e);
        }
        finally
        {
            System.out.println("Execution completed.");
        }
    }
}
    
