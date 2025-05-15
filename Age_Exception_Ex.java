/*public class Age_Exception_Ex {
    
    public static void checkAge(int age)
    {
            if (age < 18) {
                throw new ArithmeticException("Access Denied: You must be at least 18 years old.");
            }
            else
            System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
        checkAge(25);
    }

    
}*/

/*import java.util.Scanner;

class Number_Exception_Ex
{
    public static void divide()
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        if(b==0)
        {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        else
        {
            c = a/b;
            System.out.println("Result: " + c);
        }
    }

    public static void main(String[] args) {
        divide();
    }
}*/

import java.io.*;

class Throws_Exception_Ex
{
    public static void writeToFile() throws IOException
    {
        FileWriter fw = new FileWriter("test.txt");
        fw.write("Hello, World!");
        fw.close();
    }

    public static void main(String[] args) {
        try
        {
            writeToFile();
        }
        catch(IOException e)
        {
            System.out.println("An IOException occurred: " + e.getMessage());
        }
        finally
        {
            System.out.println("File operation completed.");
        }
    }
}
