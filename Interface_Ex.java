interface Area{
    static final double PI = 3.14;
    void area();
}

interface Perimeter{
    void perimeter();
}

class Interface_Ex implements Area,Perimeter{
    double radius;

    Interface_Ex(double r){
        radius = r;
    }

    public void area(){
        double a = PI*radius*radius;
        System.out.println("Area of Circle is: "+a);
    }

    public void perimeter(){
        double p = 2*PI*radius;
        System.out.println("Perimeter of Circle is: "+p);
    }

    public static void main(String args[]){
        Interface_Ex obj1 = new Interface_Ex(5.0);
        obj1.area();
        obj1.perimeter();
    }
}