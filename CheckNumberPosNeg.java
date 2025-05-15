class User_Defined_Exception_Ex extends Exception
{
    User_Defined_Exception_Ex(String msg)
    {
        super(msg);
    }
}

class CheckNumberPosNeg
{
    public static void main(String[] args) {
        
        try{
            int n = Integer.parseInt(args[0]);
            if(n<0)
            {
                throw new User_Defined_Exception_Ex("Negative number not allowed");
            }
            else
            {
                System.out.println("Number is: " + n);
            }
        }
        catch(User_Defined_Exception_Ex e)
        {
            System.out.println("User Defined Exception: " + e.getMessage());
        }
        finally
        {
            System.out.println("Execution completed.");
        }
    }
}
