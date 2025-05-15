abstract class Box{
    int length,breadth;

    void accept(int l,int b){
        length = l;
        breadth = b;
    }

    abstract void area();
}

class Abstract_Interface_Ex extends Box{

    public void area(){
        int a = length * breadth;
        System.out.println("Area of Box is: "+a);
    }

    public static void main(String args[]){
        Abstract_Interface_Ex obj1 = new Abstract_Interface_Ex();
        obj1.accept(5,6);
        obj1.area();
    }
}