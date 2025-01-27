import java.util.Scanner;

public class ArrayOfObjectEx
{
    
    String name;
    int age;

    public void accept()
    {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter name and age of Student: ");
        name = x.nextLine();
        age = x.nextInt();
    }

    public void display()
    {
        System.out.println();
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }

    public static void main(String[] args) 
    {
        ArrayOfObjectEx obj[] = new ArrayOfObjectEx[3];

        for(int i=0;i<3;i++)
            obj[i] = new ArrayOfObjectEx();

        for(int i=0;i<3;i++)
            obj[i].accept();

        for(int i=0;i<3;i++)
            obj[i].display();
    }
}
